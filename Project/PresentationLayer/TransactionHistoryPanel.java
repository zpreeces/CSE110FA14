/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLayer;

/*mport java.awt.CardLayout;
 import javax.swing.JLabel;
 import javax.swing.JPanel;
 import javax.swing.table.DefaultTableCellRenderer;*/
import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.font.TextAttribute;

/**
 *
 * @author Ryan
 */
public class TransactionHistoryPanel extends javax.swing.JPanel
{

    private JPanel MainPanel;
    private GUI mainGUI;

    public void update()
    {
        TransactionsTable.clearSelection();
        TransactionsTable.getSelectionModel().clearSelection();
        TransactionsTable.setModel(new TransactionTableModel(GUI.currentBankAccount));

    }

    public TransactionHistoryPanel(JPanel MainPanel, GUI mainGUI)
    {
        this.MainPanel = MainPanel;
        this.mainGUI = mainGUI;
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
        java.awt.GridBagConstraints gridBagConstraints;

        ChildBG = new javax.swing.JPanel();
        BusinessPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TransactionsTable = new javax.swing.JTable();
        Back = new javax.swing.JButton();
        Logout = new javax.swing.JButton();
        TitlePanel = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        Bank42 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setName("BackgroundPanel"); // NOI18N
        setPreferredSize(new java.awt.Dimension(800, 600));
        setLayout(new java.awt.GridBagLayout());

        ChildBG.setMaximumSize(new java.awt.Dimension(800, 600));
        ChildBG.setMinimumSize(new java.awt.Dimension(800, 600));
        ChildBG.setOpaque(false);
        ChildBG.setPreferredSize(new java.awt.Dimension(800, 600));
        ChildBG.setLayout(new java.awt.GridBagLayout());

        BusinessPanel.setOpaque(false);
        BusinessPanel.setLayout(new java.awt.GridBagLayout());

        jScrollPane1.setPreferredSize(new java.awt.Dimension(675, 300));

        TransactionsTable.setModel(new PresentationLayer.TransactionTableModel(PresentationLayer.GUI.currentBankAccount));
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        TransactionsTable.setDefaultRenderer(String.class, centerRenderer);
        TransactionsTable.setSelectionModel(new ForcedListSelectionModel());
        TransactionsTable.getTableHeader().setReorderingAllowed(false);
        TransactionsTable.getTableHeader().setDefaultRenderer((new HeaderRenderer(TransactionsTable)));
        TransactionsTable.getTableHeader().setResizingAllowed(false);
        TransactionsTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(TransactionsTable);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        BusinessPanel.add(jScrollPane1, gridBagConstraints);

        Back.setBackground(new Color(255,255,255,150));
        Back.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Back.setForeground(new java.awt.Color(14, 118, 188));
        Back.setText("Return To Account Selection");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        BusinessPanel.add(Back, gridBagConstraints);

        Logout.setBackground(new java.awt.Color(255, 255, 255));
        Logout.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Logout.setForeground(new java.awt.Color(14, 118, 188));
        Logout.setText("Log Out");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        BusinessPanel.add(Logout, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 70, 0);
        ChildBG.add(BusinessPanel, gridBagConstraints);

        TitlePanel.setOpaque(false);
        TitlePanel.setLayout(new java.awt.GridBagLayout());

        Title.setBackground(new java.awt.Color(250, 250, 250));
        Title.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Title.setForeground(new java.awt.Color(14, 118, 188));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Welcome To your account's Transaction History!");
        Title.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(16, 0, 0, 0);
        TitlePanel.add(Title, gridBagConstraints);

        Bank42.setFont(new java.awt.Font("DejaVu Sans", 1, 48)); // NOI18N
        Bank42.setForeground(new java.awt.Color(51, 0, 255));
        Bank42.setText("Bank 42");
        Bank42.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 49, 0);
        TitlePanel.add(Bank42, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        ChildBG.add(TitlePanel, gridBagConstraints);

        add(ChildBG, new java.awt.GridBagConstraints());

        Background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/TransactionHistoryPic.jpg"))); // NOI18N
        Background.setFocusable(false);
        Background.setInheritsPopupMenu(false);
        Background.setMaximumSize(new java.awt.Dimension(800, 600));
        Background.setMinimumSize(new java.awt.Dimension(800, 600));
        Background.setPreferredSize(new java.awt.Dimension(800, 600));
        Background.setRequestFocusEnabled(false);
        Background.setVerifyInputWhenFocusTarget(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        add(Background, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BackActionPerformed
    {//GEN-HEADEREND:event_BackActionPerformed
        CardLayout layout = (CardLayout) (MainPanel.getLayout());
        layout.show(MainPanel, "AccList");
    }//GEN-LAST:event_BackActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        CardLayout layout = (CardLayout) (MainPanel.getLayout());
        layout.show(MainPanel, "Login");
    }//GEN-LAST:event_LogoutActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Bank42;
    private javax.swing.JPanel BusinessPanel;
    private javax.swing.JPanel ChildBG;
    private javax.swing.JButton Logout;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel TitlePanel;
    private javax.swing.JTable TransactionsTable;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
