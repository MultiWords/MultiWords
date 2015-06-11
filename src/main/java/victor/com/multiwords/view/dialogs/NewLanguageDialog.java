package victor.com.multiwords.view.dialogs;

import java.awt.Rectangle;
import java.util.List;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import victor.com.multiwords.entity.Keyboard;
import victor.com.multiwords.view.panels.LanguagePanel;

/**
 * @author <b>WRosinski</b><br/>
 *<br/>
 */
public class NewLanguageDialog extends javax.swing.JDialog {

    /**  */
	private static final long serialVersionUID = -1461731167391617313L;
	
	private LanguagePanel owner;
	
	private javax.swing.JButton bttnCancel;
    private javax.swing.JButton bttnNewKeyboard;
    private javax.swing.JButton bttnSave;
    private javax.swing.JComboBox comboBoxKeyboard;
    private javax.swing.JLabel labelKeyboardLanfuage;
    private javax.swing.JLabel labelLanguageName;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField textFieldLanguageName;
	
    
    /**
     * Creates new form NewLanguageDialog
     */
    public NewLanguageDialog(java.awt.Frame parent, LanguagePanel owner, boolean modal) {
        super(parent, modal);
        this.owner=owner;
        initComponents();
        loadData();
        setVisible(true);
    }

    
    private void initComponents() {

        panel = new javax.swing.JPanel();
        labelLanguageName = new javax.swing.JLabel();
        textFieldLanguageName = new javax.swing.JTextField();
        labelKeyboardLanfuage = new javax.swing.JLabel();
        comboBoxKeyboard = new javax.swing.JComboBox();
        bttnNewKeyboard = new javax.swing.JButton();
        bttnSave = new javax.swing.JButton();
        bttnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nowy język");

        panel.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 10)))); // NOI18N

        labelLanguageName.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        labelLanguageName.setText("nazwa języka");

        textFieldLanguageName.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        textFieldLanguageName.setText("moja nazwa języka");

        labelKeyboardLanfuage.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        labelKeyboardLanfuage.setText("klawiatura");

        comboBoxKeyboard.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        bttnNewKeyboard.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        bttnNewKeyboard.setText("Dodaj klawiaturę");
        bttnNewKeyboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnNewKeyboardActionPerformed(evt);
            }
        });

        bttnSave.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        bttnSave.setText("Zapsiz");

        bttnCancel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        bttnCancel.setText("Anuluj");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(bttnSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bttnCancel))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(labelLanguageName, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textFieldLanguageName))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(labelKeyboardLanfuage, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bttnNewKeyboard, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(comboBoxKeyboard, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textFieldLanguageName, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(labelLanguageName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelKeyboardLanfuage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboBoxKeyboard, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bttnNewKeyboard)
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttnSave)
                    .addComponent(bttnCancel))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        
        Rectangle ekran = this.getGraphicsConfiguration().getBounds();
        int y=ekran.height/4;
        int x=ekran.width/3;
        setLocation(x,y);

        pack();
    }                      

    private void loadData(){
    List<Keyboard> keyboards=owner.getController().getAvailablesKeyboards();
    }
    
    private void bttnNewKeyboardActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               


}
