package victor.com.multiwords.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;

import javax.swing.JOptionPane;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainController {

	public static void main(String... strings) {
		try{
		System.out.println("start");
		laodSQLiteDataSourceProperties();

		runApplication();
		JOptionPane.showMessageDialog(null, "Aplikacja uruchomiona", "Sukces", JOptionPane.INFORMATION_MESSAGE);
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, e.getStackTrace(), "Błąd", JOptionPane.ERROR_MESSAGE);
		}
		
	}

	private static void runApplication() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		System.out.println(ctx);
	}

	private static void laodSQLiteDataSourceProperties() {
		System.out.println("load properties");
		String basePath = null;
		String path = null;
		try {
			path = MainController.class.getProtectionDomain().getCodeSource()
					.getLocation().toURI().getPath();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		path = path.substring(0, path.indexOf("MultiWords"));
		basePath = new String(path);
		path = path + "MultiWords/src/main/resources/MultiWordsData.sqlite";
		writeDataSourcePropertiesFile(basePath, path);

	}

	private static void writeDataSourcePropertiesFile(String basePath,
			String dataBasePath) {
		// READ
		File file = new File(basePath
				+ "/MultiWords/src/main/resources/dataSource.properties");
		StringBuffer data = new StringBuffer();
		String line;
		boolean toSave = false;
		try {
			Scanner reader = new Scanner(file);
			while (reader.hasNextLine()) {
				line = reader.nextLine();
				if (line.indexOf("sqlite.url=") < 0) {
					data.append(line).append("\n");
				} else {
					if (line.equals("sqlite.url=jdbc:sqlite:/" + dataBasePath)) {
						System.out.println("jest ok");
					} else {
						data.append("sqlite.url=jdbc:sqlite:/")
								.append(dataBasePath).append("\n");
						toSave = true;
					}

				}
			}
			reader.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catchblock
			e.printStackTrace();
		}

		// WRITE
		if(toSave){
			saveChangesInDataSourceFile(basePath, data.toString());
			JOptionPane.showMessageDialog(null, "Nastąpiła zmina konfiguracji, koniecznych do wczytania.\nProsze restartować aplikację w celu załadowania nowych ustawień", "Zmiana konfiguracji", JOptionPane.INFORMATION_MESSAGE);
		}

	}

	private static void saveChangesInDataSourceFile(String path, String data) {
		try {
			FileWriter writer = new FileWriter(path
					+ "/MultiWords/src/main/resources/dataSource.properties");
			writer.write(data.toString());
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
