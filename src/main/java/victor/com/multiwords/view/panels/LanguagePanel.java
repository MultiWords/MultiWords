package victor.com.multiwords.view.panels;

import victor.com.multiwords.controller.viewControllers.LanguagePanelController;
import victor.com.multiwords.view.GenericViewPanel;
import victor.com.multiwords.view.dialogs.NewLanguageDialog;

/**
 * @author <b>WRosinski</b><br/>
 *<br/>
 */
public class LanguagePanel extends GenericViewPanel<LanguagePanelController> {

    /**  */
	private static final long serialVersionUID = 3024696464882702853L;
	
	private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonCancelArrears;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonNewLanguage;
    private javax.swing.JButton buttonSave;
    private javax.swing.JButton buttonShow;
    private javax.swing.JButton buttonSpredArrears;
    private javax.swing.JList jListLanguages;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel labelArrearsNumber;
    private javax.swing.JLabel labelFiltr;
    private javax.swing.JLabel labelKnownWordsNumber;
    private javax.swing.JLabel labelLanguageList;
    private javax.swing.JLabel labelLanguageName;
    private javax.swing.JLabel labelLernedWordsNumber;
    private javax.swing.JLabel labelPacketsNumber;
    private javax.swing.JLabel labelRepeats;
    private javax.swing.JLabel labelStep;
    private javax.swing.JLabel labelValueArrearsNumber;
    private javax.swing.JLabel labelValueKnownWordsNumber;
    private javax.swing.JLabel labelValueLernedWordsNumber;
    private javax.swing.JLabel labelValuePacketsNumber;
    private javax.swing.JLabel labelValueWordsNumber;
    private javax.swing.JLabel labelWordsNumber;
    private javax.swing.JLabel labelWordsPerDay;
    private javax.swing.JPanel panelLanguageSettings;
    private javax.swing.JPanel panelLangugeStatistics;
    private javax.swing.JScrollPane scrollPaneLanguageList;
    private javax.swing.JTextField textFieldLanguageName;
    private javax.swing.JTextField textFieldRepeats;
    private javax.swing.JTextField textFieldStep;
    private javax.swing.JTextField textFieldWordsPerDay;
	
    /**
     * Creates new form LanguagePanel
     */
    public LanguagePanel(LanguagePanelController controller) {
    	super(controller);
    	
    	title="Języki";
        initComponents();
    }

    private void initComponents() {

        labelLanguageList = new javax.swing.JLabel();
        labelFiltr = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        scrollPaneLanguageList = new javax.swing.JScrollPane();
        jListLanguages = new javax.swing.JList();
        buttonNewLanguage = new javax.swing.JButton();
        buttonShow = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();
        panelLanguageSettings = new javax.swing.JPanel();
        labelLanguageName = new javax.swing.JLabel();
        textFieldLanguageName = new javax.swing.JTextField();
        labelWordsPerDay = new javax.swing.JLabel();
        textFieldWordsPerDay = new javax.swing.JTextField();
        labelRepeats = new javax.swing.JLabel();
        textFieldRepeats = new javax.swing.JTextField();
        labelStep = new javax.swing.JLabel();
        textFieldStep = new javax.swing.JTextField();
        buttonSave = new javax.swing.JButton();
        buttonCancel = new javax.swing.JButton();
        panelLangugeStatistics = new javax.swing.JPanel();
        labelPacketsNumber = new javax.swing.JLabel();
        labelValuePacketsNumber = new javax.swing.JLabel();
        labelWordsNumber = new javax.swing.JLabel();
        labelValueWordsNumber = new javax.swing.JLabel();
        labelKnownWordsNumber = new javax.swing.JLabel();
        labelValueKnownWordsNumber = new javax.swing.JLabel();
        labelLernedWordsNumber = new javax.swing.JLabel();
        labelValueLernedWordsNumber = new javax.swing.JLabel();
        labelArrearsNumber = new javax.swing.JLabel();
        labelValueArrearsNumber = new javax.swing.JLabel();
        buttonSpredArrears = new javax.swing.JButton();
        buttonCancelArrears = new javax.swing.JButton();

        labelLanguageList.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        labelLanguageList.setText("Lista języków");

        labelFiltr.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        labelFiltr.setText("filtr");

        jTextField5.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jListLanguages.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jListLanguages.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Polski", "Angielski", "Niemiecki", "Francuski", "Hiszpański", "Włoski", "Portugalski", "Brazylijski", "Bułgarski", "Węgierski", "Czeski", "Słowacki", "Ukraiński", "Rosyjski" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        scrollPaneLanguageList.setViewportView(jListLanguages);

        buttonNewLanguage.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        buttonNewLanguage.setText("Nowy język");
        buttonNewLanguage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNewLanguageActionPerformed(evt);
            }
        });

        buttonShow.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        buttonShow.setText("Pokaż");
        buttonShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonShowActionPerformed(evt);
            }
        });

        buttonDelete.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        buttonDelete.setText("Usuń");
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });

        panelLanguageSettings.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createTitledBorder(null, "Ustawienia języka", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 10)))); // NOI18N

        labelLanguageName.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        labelLanguageName.setText("nazwa języka");

        textFieldLanguageName.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        textFieldLanguageName.setText("moja nazwa języka");

        labelWordsPerDay.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        labelWordsPerDay.setText("liczba wyrazów / dzień");

        textFieldWordsPerDay.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        textFieldWordsPerDay.setText("moja nazwa języka");

        labelRepeats.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        labelRepeats.setText("liczba powtórek");

        textFieldRepeats.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        textFieldRepeats.setText("moja nazwa języka");

        labelStep.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        labelStep.setText("krok");

        textFieldStep.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        textFieldStep.setText("moja nazwa języka");

        buttonSave.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        buttonSave.setText("Zapsiz");
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });

        buttonCancel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        buttonCancel.setText("Anuluj");
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLanguageSettingsLayout = new javax.swing.GroupLayout(panelLanguageSettings);
        panelLanguageSettings.setLayout(panelLanguageSettingsLayout);
        panelLanguageSettingsLayout.setHorizontalGroup(
            panelLanguageSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLanguageSettingsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLanguageSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLanguageSettingsLayout.createSequentialGroup()
                        .addComponent(buttonSave)
                        .addGap(18, 18, 18)
                        .addComponent(buttonCancel))
                    .addGroup(panelLanguageSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panelLanguageSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLanguageSettingsLayout.createSequentialGroup()
                                .addComponent(labelLanguageName, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textFieldLanguageName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLanguageSettingsLayout.createSequentialGroup()
                                .addComponent(labelWordsPerDay, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textFieldWordsPerDay, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLanguageSettingsLayout.createSequentialGroup()
                                .addComponent(labelRepeats, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textFieldRepeats, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panelLanguageSettingsLayout.createSequentialGroup()
                            .addComponent(labelStep, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(textFieldStep, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panelLanguageSettingsLayout.setVerticalGroup(
            panelLanguageSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLanguageSettingsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLanguageSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLanguageName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldLanguageName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLanguageSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelWordsPerDay, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldWordsPerDay, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLanguageSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRepeats, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldRepeats, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLanguageSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelStep, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldStep, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLanguageSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSave)
                    .addComponent(buttonCancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelLangugeStatistics.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createTitledBorder(null, "Statystyka", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 10)))); // NOI18N

        labelPacketsNumber.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        labelPacketsNumber.setText("Liczba zestawów:");

        labelValuePacketsNumber.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        labelValuePacketsNumber.setText("150");

        labelWordsNumber.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        labelWordsNumber.setText("Liczba wyrazów:");

        labelValueWordsNumber.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        labelValueWordsNumber.setText("150");

        labelKnownWordsNumber.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        labelKnownWordsNumber.setText("Liczba wyrazów poznanych:");

        labelValueKnownWordsNumber.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        labelValueKnownWordsNumber.setText("150");

        labelLernedWordsNumber.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        labelLernedWordsNumber.setText("Liczba wyrazów nauczonych:");

        labelValueLernedWordsNumber.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        labelValueLernedWordsNumber.setText("150");

        labelArrearsNumber.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        labelArrearsNumber.setText("Liczba zaległości:");

        labelValueArrearsNumber.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        labelValueArrearsNumber.setText("150");

        buttonSpredArrears.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        buttonSpredArrears.setText("Rozłóż zaległości");
        buttonSpredArrears.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSpredArrearsActionPerformed(evt);
            }
        });

        buttonCancelArrears.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        buttonCancelArrears.setText("Anuluj zaległości");
        buttonCancelArrears.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelArrearsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLangugeStatisticsLayout = new javax.swing.GroupLayout(panelLangugeStatistics);
        panelLangugeStatistics.setLayout(panelLangugeStatisticsLayout);
        panelLangugeStatisticsLayout.setHorizontalGroup(
            panelLangugeStatisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLangugeStatisticsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLangugeStatisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLangugeStatisticsLayout.createSequentialGroup()
                        .addComponent(buttonSpredArrears, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonCancelArrears, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 17, Short.MAX_VALUE))
                    .addGroup(panelLangugeStatisticsLayout.createSequentialGroup()
                        .addGroup(panelLangugeStatisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(labelArrearsNumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelWordsNumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelLernedWordsNumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addComponent(labelKnownWordsNumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelPacketsNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLangugeStatisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelValueLernedWordsNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelValueKnownWordsNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelValuePacketsNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelValueWordsNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelValueArrearsNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        panelLangugeStatisticsLayout.setVerticalGroup(
            panelLangugeStatisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLangugeStatisticsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLangugeStatisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelValuePacketsNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPacketsNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLangugeStatisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelValueWordsNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelWordsNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLangugeStatisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelKnownWordsNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelValueKnownWordsNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLangugeStatisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLernedWordsNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelValueLernedWordsNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLangugeStatisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelArrearsNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelValueArrearsNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelLangugeStatisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCancelArrears)
                    .addComponent(buttonSpredArrears)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(labelLanguageList, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(labelFiltr, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField5))
                        .addComponent(scrollPaneLanguageList, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(buttonNewLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(buttonShow, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                    .addComponent(buttonDelete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelLanguageSettings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelLangugeStatistics, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelLanguageList, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelFiltr))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollPaneLanguageList)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonNewLanguage))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonShow)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonDelete))
                            .addComponent(panelLanguageSettings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(panelLangugeStatistics, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 34, Short.MAX_VALUE)))
                .addContainerGap())
        );
        setVisible(true);
    }                       

    private void buttonNewLanguageActionPerformed(java.awt.event.ActionEvent evt) {                                                  
       new NewLanguageDialog(null, this, true);
    }                                                 

    private void buttonShowActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void buttonCancelArrearsActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
    }                                                   

    private void buttonSpredArrearsActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
    }                                                  

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            



}
