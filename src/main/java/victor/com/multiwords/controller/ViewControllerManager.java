package victor.com.multiwords.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import victor.com.multiwords.controller.viewControllers.LanguagePanelController;
import victor.com.multiwords.controller.viewControllers.UpperPanelController;
import victor.com.multiwords.view.GenericViewPanel;
import victor.com.multiwords.view.UpperPanel;

/**
 * @author <b>WRosinski</b><br/>
 * compoment zarzadzajacy kontrolerami widokow, zawiera wszystkie kontrolery
 *<br/>
 */
@Component
public class ViewControllerManager {

	@Autowired
	private UpperPanelController upperPanelController;
	
	@Autowired
	private  LanguagePanelController languagePanelController;
	
	public UpperPanel getUpperPanel(){
		return upperPanelController.getPanel();
	}
	
	@SuppressWarnings("rawtypes")
	public List<GenericViewPanel> getPanels(){
		List<GenericViewPanel> panels=new ArrayList<GenericViewPanel>();
		panels.add(languagePanelController.getPanel());
		return panels;
	}
}
