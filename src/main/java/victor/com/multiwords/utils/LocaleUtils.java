package victor.com.multiwords.utils;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author <b>WRosinski</b><br/>
 *<br/>
 */
/**
 * @author <b>WRosinski</b><br/>
 *<br/>
 */
public class LocaleUtils {

	private static Locale myLocale;
	private static Locale lernedLocale;
	
	private static ApplicationContext context = new ClassPathXmlApplicationContext("locale.xml");
	
	
	public static String getMessage(String code){
		return context.getMessage(code, null, myLocale);
	}
	
	/** {@link LocaleUtils#myLocale} */
	public static Locale getMyLocale() {
		return myLocale;
	}
	/** {@link LocaleUtils#myLocale} */
	public static void setMyLocale(Locale myLocale) {
		LocaleUtils.myLocale = myLocale;
	}
	/** {@link LocaleUtils#lernedLocale} */
	public static Locale getLernedLocale() {
		return lernedLocale;
	}
	/** {@link LocaleUtils#lernedLocale} */
	public static void setLernedLocale(Locale lernedLocale) {
		LocaleUtils.lernedLocale = lernedLocale;
	}
	

	
}
