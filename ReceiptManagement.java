import java.awt.event.*;
/**
 * Receipt Management form created with Net Beans
 * @author Michael McGaffick
 * @version 4/16/18
 */
public class ReceiptManagement extends javax.swing.JFrame {

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSaveToFile;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAdd2;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnPrintAll;
    private javax.swing.JLabel lblItems;
    private javax.swing.JLabel lblItem;
    private javax.swing.JLabel lblUpdate;
    private javax.swing.JLabel lblAdd;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPrint;
    private javax.swing.JLabel lblName2;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtItems;
    private javax.swing.JTextField txtItem;
    private javax.swing.JTextField txtName2;
    private java.awt.Label lblTitle;
    // End of variables declaration//GEN-END:variables

    /**
     * Creates new form ReceiptManagement
     */
    public ReceiptManagement() {
        initComponents();
    }

    /**
    * This method is called from within the constructor to initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is always
    * regenerated by the Form Editor.
    */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new java.awt.Label();
        lblAdd = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblItems = new javax.swing.JLabel();
        lblUpdate = new javax.swing.JLabel();
        lblItem = new javax.swing.JLabel();
        lblPrint = new javax.swing.JLabel();
        lblName2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtItems = new javax.swing.JTextField();
        txtItem = new javax.swing.JTextField();
        txtName2 = new javax.swing.JTextField();
        btnHome = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnAdd2 = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnPrintAll = new javax.swing.JButton();
        btnSaveToFile = new javax.swing.JButton();

        //Adds functions to each of the buttons
        btnHome.addActionListener(new HomeListener());
        btnAdd.addActionListener(new AddListener());
        btnAdd2.addActionListener(new Add2Listener());
        btnRemove.addActionListener(new RemoveListener());
        btnPrint.addActionListener(new PrintListener());
        btnSaveToFile.addActionListener(new SaveToFileListener());
        btnPrintAll.addActionListener(new PrintAllListener());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Receipt Management");

        lblTitle.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        lblTitle.setText("Receipt Management");

        lblAdd.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        lblAdd.setText("Add a Receipt");

        lblName.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        lblName.setText("Name:");

        lblItems.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        lblItems.setText("Items:");

        lblUpdate.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        lblUpdate.setText("Update a Receipt");

        lblItem.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        lblItem.setText("Item:");

        lblPrint.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        lblPrint.setText("Print a Receipt");

        lblName2.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        lblName2.setText("Name:");

        txtName.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        txtName.setText("(Name)");

        txtItems.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        txtItems.setText("(Item Item Item)");

        txtItem.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        txtItem.setText("(Item)");

        txtName2.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        txtName2.setText("(Name)");

        btnHome.setBackground(new java.awt.Color(153, 153, 255));
        btnHome.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        btnHome.setText("Home");

        btnAdd.setBackground(new java.awt.Color(153, 153, 255));
        btnAdd.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        btnAdd.setText("Add");

        btnAdd2.setBackground(new java.awt.Color(153, 153, 255));
        btnAdd2.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        btnAdd2.setText("Add");

        btnPrint.setBackground(new java.awt.Color(153, 153, 255));
        btnPrint.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        btnPrint.setText("Print");

        btnRemove.setBackground(new java.awt.Color(153, 153, 255));
        btnRemove.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        btnRemove.setText("Remove");

        btnPrintAll.setBackground(new java.awt.Color(153, 153, 255));
        btnPrintAll.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        btnPrintAll.setText("Sort and Print All Receipts");

        btnSaveToFile.setBackground(new java.awt.Color(153, 153, 255));
        btnSaveToFile.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        btnSaveToFile.setText("Save to File");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAdd)
                                .addGap(145, 145, 145)
                                .addComponent(btnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblItem)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtItem, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lblItems)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtItems, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(57, 57, 57)
                                        .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnAdd2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnRemove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUpdate)
                                    .addComponent(lblPrint)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblName)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnPrintAll, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lblName2)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtName2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(58, 58, 58)
                                        .addComponent(btnPrint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnSaveToFile, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAdd)
                    .addComponent(btnHome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblItems)
                    .addComponent(txtItems, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblItem)
                    .addComponent(txtItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd2)
                    .addComponent(btnRemove))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPrint)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName2)
                    .addComponent(txtName2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrint))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrintAll)
                    .addComponent(btnSaveToFile))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Runs at the start of the program to intialize everything
     * @param args the command line arguments
     */
    public static void main() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ReceiptManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReceiptManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReceiptManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReceiptManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }

    /**
     * Listener for the home button
     * @author Michael McGaffick
     * @version 4/23/18
     */
    class HomeListener implements ActionListener
    {
        /**
         * Returns to the home menu and closes receipt management
         * @param e the action of the button being clicked
         */
        public void actionPerformed(ActionEvent e)
        {
            Container.rm.setVisible(false);
            Container.hf.setVisible(true);
        }
    }

    /**
     * Listener for the first add button
     * @author Michael McGaffick
     * @version 4/23/18
     */
    class AddListener implements ActionListener
    {
         /**
         * Adds the receipt with the specified name and listing of items
         * @param e the action of the button being clicked
         */
        public void actionPerformed(ActionEvent e)
        {
            try {
                Container.rl.add(txtName.getText().toLowerCase(),txtItems.getText().toLowerCase());
            }

            catch(Exception ex)
            {
                System.out.println("\fIncorrect Input... please refer to the user manual for help.");
            }
        }
    }

    /**
     * Listener for the second add button
     * @author Michael McGaffick
     * @version 4/23/18
     */
    class Add2Listener implements ActionListener
    {
         /**
         * Adds an item to the specified receipt
         * @param e the action of the button being clicked
         */
        public void actionPerformed(ActionEvent e)
        {
            try{
                Container.rl.updateAdd(txtName.getText().toLowerCase(),txtItem.getText().toLowerCase());
            }
            catch(Exception ex)
            {
                System.out.println("\fIncorrect Input... please refer to the user manual for help.");
            }
        }
    }

    /**
     * Listener for the remove button
     * @author Michael McGaffick
     * @version 4/23/18
     */
    class RemoveListener implements ActionListener
    {
         /**
         * Removes an item from a customer's receipt based on name and item specified
         * @param e the action of the button being clicked
         */
        public void actionPerformed(ActionEvent e)
        {
            try{
                Container.rl.updateRemove(txtName.getText().toLowerCase(),txtItem.getText().toLowerCase());
            }
            catch(Exception ex)
            {
                System.out.println("\fIncorrect Input... please refer to the user manual for help.");
            }
        }
    }

    /**
     * Listener for the print button
     * @author Michael McGaffick
     * @version 4/23/18
     */
    class PrintListener implements ActionListener
    {
         /**
         * Prints all information on the specified receipt
         * @param e the action of the button being clicked
         */
        public void actionPerformed(ActionEvent e)
        {
            try
            {
                Container.rl.search(txtName2.getText().toLowerCase());
            }
            catch(Exception ex)
            {
                System.out.println("\fIncorrect Input... please refer to the user manual for help.");
            }
        }
    }

    /**
     * Listener for the print all button
     * @author Michael McGaffick
     * @version 4/23/18
     */
    class PrintAllListener implements ActionListener
    {
         /**
         * Prints a listing of all information regarding the current receipts
         * @param e the action of the button being clicked
         */
        public void actionPerformed(ActionEvent e)
        {
            try{
                Container.rl.printAll();
            }
            catch(Exception ex)
            {
                System.out.println("\fAn error printing the receipts has occured... please refer to the user manual for help.");
            }
        }
    }

    /**
     * Listener for the save button
     * @author Michael McGaffick
     * @version 4/23/18
     */
    class SaveToFileListener implements ActionListener
    {
         /**
         * Saves the receipts to a file based on the current system time
         * @param e the action of the button being clicked
         */
        public void actionPerformed(ActionEvent e)
        {
            try{
                FileHandler.saveReceipts();
            }

            catch(Exception ex)
            {
                System.out.println("\fFailure to save to the receipts.");
            }
        }
    }
}
