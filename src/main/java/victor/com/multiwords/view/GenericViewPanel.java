package victor.com.multiwords.view;

import javax.swing.JPanel;

import victor.com.multiwords.controller.GenericViewController;

/**
 * @author <b>WRosinski</b><br/>
 * klasa macierzysta wszystkich paneli widokow, dzieki niej panele sa scisle powiazane ze swoimi kontrolerami i automatycznie tworzone przez Spring
 *<br/>
 */
public class GenericViewPanel <T extends GenericViewController<? extends GenericViewPanel<T>>> extends JPanel{
	/**  */
	private static final long serialVersionUID = 7829128819299952002L;
	protected T controller;
	protected String title="main";
	
	public GenericViewPanel(T controller){
		super();
		this.controller=controller;
	}

	/** {@link GenericViewPanel#title} */
	public String getTitle() {
		return title;
	}

	/** {@link GenericViewPanel#controller} */
	public T getController() {
		return controller;
	}


	
	
}
