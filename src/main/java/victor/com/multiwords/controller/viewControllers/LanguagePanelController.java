package victor.com.multiwords.controller.viewControllers;

import java.util.List;

import org.springframework.stereotype.Controller;

import victor.com.multiwords.controller.GenericViewController;
import victor.com.multiwords.entity.Keyboard;
import victor.com.multiwords.view.panels.LanguagePanel;

/**
 * @author <b>WRosinski</b><br/>
 *<br/>
 */
@Controller
public class LanguagePanelController extends GenericViewController<LanguagePanel>{

	/**
	 * zwraca liste dostepnych klawiatur
	 */
	public List<Keyboard> getAvailablesKeyboards() {
		return null;
	}

}
