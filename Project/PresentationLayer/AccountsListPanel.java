package PresentationLayer;

/**
 * **************************************************************************
 *
 * Ryan Bridges CSE 110, Fall 2014 Last Updated: October 30, 2014
 *
 * Team 42
 *
 * File Name: AccountsListPanel.java Description: This class will define what
 * our Login Page will look like and how it will behave. THIS CLASS IS JUST A
 * PLACEHOLDER RIGHT NOW AND DOES NOT DO ANYTHING YET OTHER THAN DISPLAY A
 * MESSAGE TELLING US WHICH PANEL IT IS SUPPOSED TO BE.
 * **************************************************************************
 */
import FacadeLayer.UserAccountWrapper;
import LogicLayer.UserAccount;
import java.awt.CardLayout;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;

//for debug
//import java.io.*;
public class AccountsListPanel extends javax.swing.JPanel
{

    final static int NAMECOL = 1;
    final static int BALANCECOL = 3;
    // VERY IMPORTANT !! YOU MUST MAKE SURE THAT YOU GIVE EACH NEW PANEL THAT 
    // YOU DECLARE A PRIVATE VARIABLE THAT WILL STORE THE MAIN PANEL FROM GUI 
    private JPanel MainPanel;
    private GUI mainGUI;
    private UserAccountWrapper wrapper;
    private int total_accounts;
    private String[] accountlist;

    public AccountsListPanel()
    {
        initComponents();
    }

    /* THIS CONSTRUCTOR IS EXTREMELY IMPORTANT. WRITE A CONSTRUCTOR LIKE THIS
     FOR ALL OTHER PANELS
    
     This constructor takes in MainPanel from GUI.java which gives us access to
     the main panel where all of our GUI elements will eventually be located. */
    public AccountsListPanel(JPanel MainPanel, GUI mainGUI)
    {
        wrapper = new UserAccountWrapper(GUI.currentUserAccount);
        total_accounts = wrapper.getTotalAccounts();
        accountlist = new String[total_accounts];
        for (int i = 0; i < total_accounts; i++)
        {
            accountlist[i] = wrapper.getAccountName(i);
        }
        this.MainPanel = MainPanel;
        this.mainGUI = mainGUI;
        initComponents();
    }

    public void setNewCellValue(double NewBalance, String accountName)
    {
        AccountsTable.setValueAt((Object) NewBalance,
                findRowPositionByName(accountName), BALANCECOL);
    }

    public void update()
    {
        mainGUI.updateUserLabels();
        AccountsTable.clearSelection();
        System.out.println(AccountsTable.getSelectedRowCount());
        AccountsTable.getSelectionModel().clearSelection();
        AccountsTable.setModel(new AccountsTableModel(GUI.currentUserAccount));
        wrapper = new UserAccountWrapper(GUI.currentUserAccount);
        total_accounts = wrapper.getTotalAccounts();
        accountlist = new String[total_accounts];
        for (int i = 0; i < total_accounts; i++)
        {
            accountlist[i] = wrapper.getAccountName(i);
        }
        DefaultComboBoxModel model1 = new DefaultComboBoxModel(accountlist);
        DefaultComboBoxModel model0 = new DefaultComboBoxModel(accountlist);
        this.BankAccountsList1.setModel(model1);
        this.BankAccountsList0.setModel(model0);
    }

    public void deletecomboboxes(String bankacc)
    {
        wrapper = new UserAccountWrapper(GUI.currentUserAccount);
        total_accounts = wrapper.getTotalAccounts();
        accountlist = new String[total_accounts - 1];
        boolean accountfound = false;
        for (int i = 0; i < total_accounts; i++)
        {
            if (accountfound == false)
            {
                if (wrapper.getAccountName(i).compareTo(bankacc) != 0)
                {
                    accountlist[i] = wrapper.getAccountName(i);
                }
                else
                    accountfound = true;
            }

            else
            {
                accountlist[i - 1] = wrapper.getAccountName(i);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {
        java.awt.GridBagConstraints gridBagConstraints;

        jButton1 = new javax.swing.JButton();
        Bank42 = new javax.swing.JLabel();
        Settings = new javax.swing.JButton();
        Logout = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AccountsTable = new javax.swing.JTable();
        TransferFundsPanel = new javax.swing.JPanel();
        AmountToTransfer = new javax.swing.JLabel();
        AmountField = new javax.swing.JTextField();
        BankAccountsList0 = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        TransferButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        BankAccountsList1 = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        Transferanotheruser = new javax.swing.JLabel();
        TransferButton1 = new javax.swing.JButton();
        EmailEntryField = new javax.swing.JTextField();
        BankAccountTransfer = new javax.swing.JLabel();
        DeleteAccountButton = new javax.swing.JButton();
        CreateBAButton = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(800, 600));
        setLayout(new java.awt.GridBagLayout());

        Bank42.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Bank42.setForeground(new java.awt.Color(51, 0, 255));
        Bank42.setText("Bank 42");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        add(Bank42, gridBagConstraints);

        Settings.setText("Settings");
        Settings.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                SettingsMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 0);
        add(Settings, gridBagConstraints);

        Logout.setText("Logout");
        Logout.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                LogoutMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.insets = new java.awt.Insets(11, 268, 0, 18);
        add(Logout, gridBagConstraints);

        jPanel3.setOpaque(false);
        java.awt.GridBagLayout jPanel3Layout = new java.awt.GridBagLayout();
        jPanel3Layout.columnWidths = new int[] {0, 5, 0};
        jPanel3Layout.rowHeights = new int[] {0, 5, 0};
        jPanel3.setLayout(jPanel3Layout);

        jScrollPane1.setMinimumSize(new java.awt.Dimension(440, 390));
        jScrollPane1.setOpaque(false);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(440, 390));

        AccountsTable.setAutoCreateRowSorter(true);
        AccountsTable.setSelectionModel(new ForcedListSelectionModel());
        AccountsTable.setModel(new PresentationLayer.AccountsTableModel(PresentationLayer.GUI.currentUserAccount));
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        AccountsTable.setDefaultRenderer(String.class, centerRenderer);
        AccountsTable.setDefaultRenderer(Double.class, centerRenderer);
        AccountsTable.getTableHeader().setResizingAllowed(false);
        AccountsTable.setOpaque(false);
        AccountsTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(AccountsTable);
        AccountsTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(jScrollPane1, gridBagConstraints);

        TransferFundsPanel.setBackground(new java.awt.Color(204, 204, 255));
        TransferFundsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Transfer Funds", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("DejaVu Sans", 1, 16))); // NOI18N

        AmountToTransfer.setText("Amount to Transfer:");

        AmountField.setText("Amount");
        AmountField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                AmountFieldActionPerformed(evt);
            }
        });
        AmountField.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                AmountFieldFocusGained(evt);
            }
        });

        BankAccountsList0.setModel(new javax.swing.DefaultComboBoxModel(accountlist));
        BankAccountsList0.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                BankAccountsList0ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 255, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TransferButton.setText("Transfer");
        TransferButton.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                TransferButtonMouseClicked(evt);
            }
        });
        TransferButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                TransferButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("To Your One Of Bank Accounts");

        BankAccountsList1.setModel(new javax.swing.DefaultComboBoxModel(accountlist));
        BankAccountsList1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                BankAccountsList1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(BankAccountsList1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(TransferButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BankAccountsList1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(TransferButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(204, 255, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Transferanotheruser.setText("Transfer To Another User:");

        TransferButton1.setText("Transfer");
        TransferButton1.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                TransferButton1MouseClicked(evt);
            }
        });

        EmailEntryField.setText("Email Address");
        EmailEntryField.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                EmailEntryFieldFocusGained(evt);
            }
        });
        EmailEntryField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                EmailEntryFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Transferanotheruser)
                .addGap(18, 18, 18)
                .addComponent(EmailEntryField, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(TransferButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Transferanotheruser)
                    .addComponent(EmailEntryField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TransferButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        BankAccountTransfer.setText("Bank Account To Transfer From");

        javax.swing.GroupLayout TransferFundsPanelLayout = new javax.swing.GroupLayout(TransferFundsPanel);
        TransferFundsPanel.setLayout(TransferFundsPanelLayout);
        TransferFundsPanelLayout.setHorizontalGroup(
            TransferFundsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TransferFundsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TransferFundsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(TransferFundsPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(TransferFundsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AmountToTransfer)
                    .addComponent(BankAccountTransfer))
                .addGap(18, 18, 18)
                .addGroup(TransferFundsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BankAccountsList0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AmountField, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TransferFundsPanelLayout.setVerticalGroup(
            TransferFundsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TransferFundsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TransferFundsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BankAccountTransfer)
                    .addComponent(BankAccountsList0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(TransferFundsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AmountToTransfer)
                    .addComponent(AmountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        jPanel3.add(TransferFundsPanel, gridBagConstraints);

        DeleteAccountButton.setText("Delete Highlighted Account");
        DeleteAccountButton.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                DeleteAccountButtonMouseClicked(evt);
            }
        });
        DeleteAccountButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                DeleteAccountButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel3.add(DeleteAccountButton, gridBagConstraints);

        CreateBAButton.setText("Create New Bank Account");
        CreateBAButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                CreateBAButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel3.add(CreateBAButton, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        add(jPanel3, gridBagConstraints);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Background2.jpg"))); // NOI18N
        Background.setAlignmentY(0.0F);
        Background.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        add(Background, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
        //retrieve MainPanel to transfer it's layout to AccountListPanel
        CardLayout layout = (CardLayout) (MainPanel.getLayout());

        //send the layout of MainPanel to new display of JPanel "Login"
        layout.show(MainPanel, "Login");
    }//GEN-LAST:event_LogoutMouseClicked

    private void SettingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SettingsMouseClicked
        CardLayout layout = (CardLayout) (MainPanel.getLayout());
        layout.show(MainPanel, "Settings");
    }//GEN-LAST:event_SettingsMouseClicked

    private void DeleteAccountButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteAccountButtonMouseClicked
        if (AccountsTable.getSelectedRowCount() > 0)
        {
            if (GUI.currentUserAccount.getNumOfBankAccounts() == 1)
            {
                JOptionPane.showMessageDialog(null, "ERROR! You must have at least one bank account.\n"
                        + "You cannot delete this Bank Account without creating a new one first.");
                return;
            }

            double amount_in_deleted_acc;
            String account_name;
            int row = AccountsTable.getSelectedRow();
            String bankacc = (String) AccountsTable.getValueAt(row, 1);
            GUI.currentBankAccount = GUI.currentUserAccount.findBankAccount(bankacc);
            amount_in_deleted_acc = GUI.currentBankAccount.getBalance();
            account_name = GUI.currentBankAccount.getAccountName();

            if (amount_in_deleted_acc == 0)
            {
                JOptionPane.showMessageDialog(null, bankacc + " has been Deleted");
                GUI.currentUserAccount.deleteBankAccount(bankacc);
                this.update();
                return;
            }

            Object[] options =
            {
                "To one of my other Bank Accounts",
                "Email Me Funds"
            };
            int n = JOptionPane.showOptionDialog(null,
                    "You have $" + amount_in_deleted_acc + " in account " + account_name
                    + "\nWhere would you like the funds to go?",
                    "Where to Transfer Funds",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null, //do not use a custom icon
                    options, //the titles of buttons
                    options[0]); //default button title

            deletecomboboxes(bankacc);

            if (n == 0)
            {
                String choice = (String) JOptionPane.showInputDialog(
                        null,
                        "Choose a Bank Account",
                        "Bank 42",
                        JOptionPane.PLAIN_MESSAGE,
                        null,
                        accountlist,
                        null);

                if (null == choice)
                {
                    return;
                }

                GUI.currentUserAccount.deleteBankAccount(bankacc);

                GUI.currentBankAccount = GUI.currentUserAccount.findBankAccount(choice);
                GUI.currentBankAccount.addToBalance(amount_in_deleted_acc);
                this.update();

                JOptionPane.showMessageDialog(null, "Bank Account " + bankacc
                        + " has been Deleted" + "\nFunds have been transfered to " + choice);
            }

            else if (n == 1)
            {
                GUI.currentUserAccount.deleteBankAccount(bankacc);
                this.update();

                JOptionPane.showMessageDialog(null, "Bank Account " + bankacc
                        + " has been Deleted" + "\nFunds have been emailed to " + GUI.currentUserAccount.getEmail());
            }
        }
        else
            JOptionPane.showMessageDialog(null, "Please Select an Account");
    }//GEN-LAST:event_DeleteAccountButtonMouseClicked

    private void CreateBAButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_CreateBAButtonActionPerformed
    {//GEN-HEADEREND:event_CreateBAButtonActionPerformed
        String choice = (String) JOptionPane.showInputDialog(
                        null,
                        "New Bank Account Name",
                        "Bank 42",
                        JOptionPane.PLAIN_MESSAGE,
                        null,
                        null,
                        null);
        
        if (GUI.currentUserAccount.findBankAccount(choice)==null&&choice.length()>0) {
            
            
            
        }
        
        /* Object[] options =
            {
                "",
                ""
            };
            int n = JOptionPane.showOptionDialog(null,
                    "You have $" + amount_in_deleted_acc + " in account " + account_name
                    + "\nWhere would you like the funds to go?",
                    "Where to Transfer Funds",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null, //do not use a custom icon
                    options, //the titles of buttons
                    options[0]); //default button title*/
    }//GEN-LAST:event_CreateBAButtonActionPerformed

    private void AmountFieldFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_AmountFieldFocusGained
    {//GEN-HEADEREND:event_AmountFieldFocusGained
        AmountField.setText("");
    }//GEN-LAST:event_AmountFieldFocusGained

    private void AmountFieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_AmountFieldActionPerformed
    {//GEN-HEADEREND:event_AmountFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AmountFieldActionPerformed

    private void BankAccountsList0ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BankAccountsList0ActionPerformed
    {//GEN-HEADEREND:event_BankAccountsList0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BankAccountsList0ActionPerformed

    private void EmailEntryFieldFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_EmailEntryFieldFocusGained
    {//GEN-HEADEREND:event_EmailEntryFieldFocusGained
        EmailEntryField.setText("");
    }//GEN-LAST:event_EmailEntryFieldFocusGained

    private void EmailEntryFieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_EmailEntryFieldActionPerformed
    {//GEN-HEADEREND:event_EmailEntryFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailEntryFieldActionPerformed

    private void BankAccountsList1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BankAccountsList1ActionPerformed
    {//GEN-HEADEREND:event_BankAccountsList1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BankAccountsList1ActionPerformed

    public static boolean isParsable(String input)
    {
        boolean parsable = true;
        try
        {
            Double.parseDouble(input);
        } catch (NumberFormatException e)
        {
            parsable = false;
        }
        return parsable;
    }

    private void TransferButtonMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_TransferButtonMouseClicked
    {//GEN-HEADEREND:event_TransferButtonMouseClicked

    }//GEN-LAST:event_TransferButtonMouseClicked
    private int findRowPositionByName(String accountName)
    {
        int cRow = 0;
        int totalRows = AccountsTable.getRowCount();
        while (!accountName.equals(AccountsTable.getValueAt(cRow, NAMECOL))
                || cRow == totalRows)
        {
            cRow++;
        }
        return cRow;
    }
    private void TransferButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_TransferButtonActionPerformed
    {//GEN-HEADEREND:event_TransferButtonActionPerformed
        double amount;

        if (isParsable(AmountField.getText()))
        {
            amount = Double.parseDouble(AmountField.getText());
        }

        else
        {
            JOptionPane.showMessageDialog(null, "Please Enter A Valid Amount To Transfer","Bank 42",1);
            return;
        }

        if (amount <= 0)
        {
            JOptionPane.showMessageDialog(null, "Please Enter A Valid Amount To Transfer","Bank 42",1);
            return;
        }

        GUI.currentBankAccount = GUI.currentUserAccount.findBankAccount((String) BankAccountsList0.getSelectedItem());

        if (amount > GUI.currentBankAccount.getBalance())
        {
            AmountField.setText("");
            JOptionPane.showMessageDialog(null, "Insufficient Funds"
                    + "\nYou have " + GUI.currentBankAccount.getBalance() + "$ available"
                    + " in selected Bank Account","Bank 42",1);
        }
        else
        {
            GUI.currentBankAccount.subFromBalance(amount);
            mainGUI.setAccountBalance(GUI.currentBankAccount.getAccountName(), GUI.currentBankAccount.getBalance());
            GUI.currentBankAccount = GUI.currentUserAccount.findBankAccount((String) BankAccountsList1.getSelectedItem());
            GUI.currentBankAccount.addToBalance(amount);
            mainGUI.setAccountBalance(GUI.currentBankAccount.getAccountName(), GUI.currentBankAccount.getBalance());
            JOptionPane.showMessageDialog(null, "Funds Transfered Successfully!","Bank 42",1);
            //GUI.MasterTable.findUserAccount();
            // test
        }
    }//GEN-LAST:event_TransferButtonActionPerformed

    private void TransferButton1MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_TransferButton1MouseClicked
    {//GEN-HEADEREND:event_TransferButton1MouseClicked
        double amount;
        if (isParsable(AmountField.getText()))
        {
            amount = Integer.parseInt(AmountField.getText());
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please Enter A Valid Amount To Transfer","Bank 42",1);
            return;
        }

        if (amount <= 0)
        {
            JOptionPane.showMessageDialog(null, "Please Enter A Valid Amount To Transfer","Bank 42",1);
            return;
        }

        GUI.currentBankAccount = GUI.currentUserAccount.findBankAccount((String) BankAccountsList0.getSelectedItem());

        if (amount > GUI.currentBankAccount.getBalance())
        {
            AmountField.setText("");
            JOptionPane.showMessageDialog(null, "Insufficient Funds"
                    + "\nYou have " + GUI.currentBankAccount.getBalance() + "$ available"
                    + " in selected Bank Account","Bank 42",1);
            return;
        }

        String email = EmailEntryField.getText();
        UserAccount founduser = GUI.MasterTable.findUserAccountEmail(email);

        if (founduser != null)
        {
            GUI.currentBankAccount.subFromBalance(amount);
            mainGUI.setAccountBalance(GUI.currentBankAccount.getAccountName(), GUI.currentBankAccount.getBalance());
            GUI.currentBankAccount = founduser.getBankAccHead();
            GUI.currentBankAccount.addToBalance(amount);
            mainGUI.setAccountBalance(GUI.currentBankAccount.getAccountName(), GUI.currentBankAccount.getBalance());
            JOptionPane.showMessageDialog(null, "Funds Transfered Successfully!","Bank 42",1);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Error, User Account Not Found","Bank 42",1);
        }
    }//GEN-LAST:event_TransferButton1MouseClicked

    private void DeleteAccountButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_DeleteAccountButtonActionPerformed
    {//GEN-HEADEREND:event_DeleteAccountButtonActionPerformed
          if (AccountsTable.getSelectedRowCount() > 0)
        {
            if (GUI.currentUserAccount.getNumOfBankAccounts() == 1)
            {
                JOptionPane.showMessageDialog(null, "You must have at least one bank account.\n"
                        + "You cannot delete this Bank Account without creating a new one first.","Bank 42",0);
                return;
            }

            String account_type;
            double amount_in_deleted_acc;
            String account_name;
            int row = AccountsTable.getSelectedRow();
            String bankacc = (String) AccountsTable.getValueAt(row, 1);

            GUI.currentBankAccount = GUI.currentUserAccount.findBankAccount(bankacc);
            amount_in_deleted_acc = GUI.currentBankAccount.getBalance();
            account_type = GUI.currentBankAccount.getAccountType();
            account_name = GUI.currentBankAccount.getAccountName();

            if (amount_in_deleted_acc == 0)
            {
                JOptionPane.showMessageDialog(null, bankacc + " has been Deleted","Bank 42",1);
                GUI.currentUserAccount.deleteBankAccount(bankacc);
                this.update();
                return;
            }

            Object[] options =
            {
                "To one of my other Bank Accounts",
                "Email Me Funds"
            };
            int n = JOptionPane.showOptionDialog(null,
                    "You have $" + amount_in_deleted_acc + " in account " + account_name
                    + "\nWhere would you like the funds to go?",
                    "Bank 42",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null, //do not use a custom icon
                    options, //the titles of buttons
                    options[0]); //default button title

            deletecomboboxes(bankacc);

            if (n == 0)
            {
                String choice = (String) JOptionPane.showInputDialog(
                        null,
                        "Choose a Bank Account",
                        "Bank 42",
                        JOptionPane.PLAIN_MESSAGE,
                        null,
                        accountlist,
                        null);

                if (null == choice)
                {
                    return;
                }

                GUI.currentUserAccount.deleteBankAccount(bankacc);

                GUI.currentBankAccount = GUI.currentUserAccount.findBankAccount(choice);
                GUI.currentBankAccount.addToBalance(amount_in_deleted_acc);
                this.update();

                JOptionPane.showMessageDialog(null, "Bank Account " + bankacc
                        + " has been Deleted" + "\nFunds have been transfered to " + choice,"Bank 42",1);
            }

            else if (n == 1)
            {
                GUI.currentUserAccount.deleteBankAccount(bankacc);
                this.update();

                JOptionPane.showMessageDialog(null, "Bank Account " + bankacc
                        + " has been Deleted" + "\nFunds have been emailed to you at:\n" 
                        + GUI.currentUserAccount.getEmail(),"Bank 42",1);
            }
        }
        else
            JOptionPane.showMessageDialog(null, "Please Select an Account","Bank 42",1);
    }//GEN-LAST:event_DeleteAccountButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AccountsTable;
    private javax.swing.JTextField AmountField;
    private javax.swing.JLabel AmountToTransfer;
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Bank42;
    private javax.swing.JLabel BankAccountTransfer;
    private javax.swing.JComboBox BankAccountsList0;
    private javax.swing.JComboBox BankAccountsList1;
    private javax.swing.JButton CreateBAButton;
    private javax.swing.JButton DeleteAccountButton;
    private javax.swing.JTextField EmailEntryField;
    private javax.swing.JButton Logout;
    private javax.swing.JButton Settings;
    private javax.swing.JButton TransferButton;
    private javax.swing.JButton TransferButton1;
    private javax.swing.JPanel TransferFundsPanel;
    private javax.swing.JLabel Transferanotheruser;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
