package victor.com.multiwords.controller;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;

import victor.com.multiwords.view.GenericViewPanel;

/**
 * @author <b>WRosinski</b><br/>
 * klasa macierzysta wszystkich kontrolerow do paneli widokow, dzieki niej kontrolery sa tworzone automatycznie przez Spring 
 * i sa scisle powiazane ze swoimi panelami
 *<br/>
 */
public class GenericViewController <T extends GenericViewPanel<? extends GenericViewController<T>>>{
	
	protected T panel;
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public GenericViewController(){
		
		//refleksyjne tworzenie panelu
		try {
			ParameterizedType paramType=(ParameterizedType) this.getClass().getGenericSuperclass();
			Class<T> panelClass=(Class<T>) paramType.getActualTypeArguments()[0];
			Constructor constructor=panelClass.getConstructor(this.getClass());
			panel=  (T) constructor.newInstance(this);
		} catch (InstantiationException | IllegalAccessException
				| IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException e) {
			throw new RuntimeException(e);
		}
	}
	
	public T getPanel(){
		return panel;
	}
}
