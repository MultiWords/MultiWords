package victor.com.multiwords.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * @author <b>WRosinski</b><br/>
 * glowne okno aplikacji
 * <br/>
 */
public class Window extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTabbedPane tabbedPanel;
	private javax.swing.JPanel upperPanel;

	public Window() {
		super("Multi Words");
		try {
			UIManager
					.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
			SwingUtilities.updateComponentTreeUI(this);
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			throw new RuntimeException(e);
		}
		initComponents();
		maximaliseWindow();
	}


	private void initComponents() {
		
		setLayout(new BorderLayout());
		upperPanel=new JPanel();
		add(upperPanel, BorderLayout.NORTH);

		addWindowListener(new WindowAdapter() {

			@SuppressWarnings("finally")
			@Override
			public void windowClosing(WindowEvent we) {
				String ObjButtons[] = { "Tak", "Nie" };
				int PromptResult = JOptionPane.showOptionDialog(null,
						"Czy na pewno chcesz zakończyć?", "Zamykanie",
						JOptionPane.DEFAULT_OPTION,
						JOptionPane.QUESTION_MESSAGE, null, ObjButtons,
						ObjButtons[1]);
				if (PromptResult == 0) {
					System.exit(0);
				} else {
					try {
						we = new WindowEvent(getOwner(), NORMAL);
					} finally {
						return;
					}
				}
			}
		});

		setVisible(true);
	}



	private void maximaliseWindow() {
		Rectangle ekran = this.getGraphicsConfiguration().getBounds();
		Rectangle okno = new Rectangle(ekran);

		Insets insets = Toolkit.getDefaultToolkit().getScreenInsets(
				this.getGraphicsConfiguration());
		okno.height = ekran.height - (insets.bottom + insets.top);
		okno.width = ekran.width - (insets.left + insets.right);
		setBounds(okno);
		
	}

	/** {@link Window#tabbedPanel} */
	public JTabbedPane getTabbedPanel() {
		return tabbedPanel;
	}

	@SuppressWarnings("rawtypes")
	public void loadPanels(List<GenericViewPanel> panels){
		tabbedPanel=new JTabbedPane();
		for(GenericViewPanel panel: panels){
			tabbedPanel.addTab(panel.getTitle(), panel);
		}
		add(tabbedPanel, BorderLayout.CENTER);
	}
	
	/**
	 * @param upperPanelController
	 */
	public void loadUpperPanel(UpperPanel upperPanel) {
		this.upperPanel.setLayout(new GridLayout(1, 0, 0, 0));
		this.upperPanel.add(upperPanel);
	}


	
	
	
	
}
