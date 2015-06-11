package victor.com.multiwords.utils;

import org.osgi.service.component.annotations.Component;

/**
 * @author <b>WRosinski</b><br/>
 *<br/>
 */
public class ConnectionUtils {

	private static boolean openConnection=true;

	/** {@link ConnectionUtils#openConnection} */
	public static boolean isOpenConnection() {
		return openConnection;
	}

	/** {@link ConnectionUtils#openConnection} */
	public static void setOpenConnection(boolean openConnection) {
		ConnectionUtils.openConnection = openConnection;
	}
	
	
}
