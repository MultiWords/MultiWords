package victor.com.multiwords.controller;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainController {

	public static void main(String... strings) {

		runApplication();
System.out.println("END");
		
	}

	private static void runApplication() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		System.out.println(ctx);
	}

}
