package victor.com.multiwords.view;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import victor.com.multiwords.controller.viewControllers.UpperPanelController;

/**
 * @author <b>WRosinski</b><br/>
 * panel gorny na glownym oknie aplikacji, posiada informacje jaki jezyk jest wlaczony, 
 * podstawowe info o zalogowanym uzytkowniku, czy wlaczona jest funckja online, o wersji jezykowej aplikacji
 *<br/>
 */
public class UpperPanel extends GenericViewPanel<UpperPanelController> {

    /**  */
	private static final long serialVersionUID = 551894428665560511L;
	private javax.swing.JLabel labelLanguage;
    private javax.swing.JPanel panelUser;
    private javax.swing.JRadioButton radioOnline;
    
    /**
     * Creates new form UpperPanel
     */
    public UpperPanel(UpperPanelController controller) {
    	super(controller);
    	try {
			UIManager
					.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
			SwingUtilities.updateComponentTreeUI(this);
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			throw new RuntimeException(e);
		}
        initComponents();
    }

    private void initComponents() {

        labelLanguage = new javax.swing.JLabel();
        radioOnline = new javax.swing.JRadioButton();
        panelUser = new javax.swing.JPanel();

        labelLanguage.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelLanguage.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelLanguage.setText("Angielski");

        radioOnline.setText("online");
        radioOnline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioOnlineActionPerformed(evt);
            }
        });

        panelUser.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createTitledBorder(null, "Imie i nazwisko", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 12)))); // NOI18N

        javax.swing.GroupLayout panelUserLayout = new javax.swing.GroupLayout(panelUser);
        panelUser.setLayout(panelUserLayout);
        panelUserLayout.setHorizontalGroup(
            panelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 275, Short.MAX_VALUE)
        );
        panelUserLayout.setVerticalGroup(
            panelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 113, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioOnline)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioOnline))
                .addContainerGap(78, Short.MAX_VALUE))
            .addComponent(panelUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        setVisible(true);
    }                        

    private void radioOnlineActionPerformed(java.awt.event.ActionEvent evt) {                                            

    }                                           

}