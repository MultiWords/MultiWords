package victor.com.multiwords.controller;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import victor.com.multiwords.view.Window;

/** klasa ktora uruchamia aplikacje */
public class MainController {

	private static Window window;	
	
	public static void main(String... strings) {

		runApplication();
		System.out.println("END");
		
	}

	private static void runApplication() {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		window=new Window();
		ViewControllerManager manager=ctx.getBean(ViewControllerManager.class);
		window.loadPanels(manager.getPanels());
		window.loadUpperPanel(manager.getUpperPanel());
	}

}
