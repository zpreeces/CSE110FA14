/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLayer;

import java.awt.*;
import java.awt.font.TextAttribute;
import java.util.Map;
import javax.swing.*;

/**
 *
 * @author Zack
 */
public class TellerMainMenu extends javax.swing.JPanel
{

    private JPanel MainPanel;
    private GUI mainGUI;

    /**
     * Creates new form TellerMainMenu
     */
    public TellerMainMenu()
    {
        initComponents();
    }

    public TellerMainMenu(JPanel MainPanel, GUI mainGUI)
    {
        this.mainGUI = mainGUI;
        this.MainPanel = MainPanel;
        initComponents();
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

        BGPanel = new javax.swing.JPanel();
        ButtonPanel = new javax.swing.JPanel();
        InterestPenaltyButton = new javax.swing.JButton();
        SearchUserButton = new javax.swing.JButton();
        ApplyPenIntButton = new javax.swing.JButton();
        Logout = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Bank42 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setLayout(new java.awt.GridBagLayout());

        BGPanel.setOpaque(false);
        java.awt.GridBagLayout BGPanelLayout = new java.awt.GridBagLayout();
        BGPanelLayout.columnWidths = new int[] {0};
        BGPanelLayout.rowHeights = new int[] {0};
        BGPanel.setLayout(BGPanelLayout);

        ButtonPanel.setBackground(new Color(255,255,255,100));
        ButtonPanel.setOpaque(false);
        java.awt.GridBagLayout ButtonPanelLayout = new java.awt.GridBagLayout();
        ButtonPanelLayout.columnWidths = new int[] {0};
        ButtonPanelLayout.rowHeights = new int[] {0, 10, 0, 10, 0, 10, 0};
        ButtonPanel.setLayout(ButtonPanelLayout);

        InterestPenaltyButton.setBackground(new java.awt.Color(255, 255, 255));
        InterestPenaltyButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        InterestPenaltyButton.setForeground(new java.awt.Color(51, 0, 255));
        InterestPenaltyButton.setText("Adjust Interest Rates and Penalties");
        InterestPenaltyButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                InterestPenaltyButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        ButtonPanel.add(InterestPenaltyButton, gridBagConstraints);

        SearchUserButton.setBackground(new java.awt.Color(255, 255, 255));
        SearchUserButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        SearchUserButton.setForeground(new java.awt.Color(51, 0, 255));
        SearchUserButton.setText("Search For A User");
        SearchUserButton.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                SearchUserButtonMouseClicked(evt);
            }
        });
        SearchUserButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                SearchUserButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        ButtonPanel.add(SearchUserButton, gridBagConstraints);

        ApplyPenIntButton.setBackground(new java.awt.Color(255, 255, 255));
        ApplyPenIntButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ApplyPenIntButton.setForeground(new java.awt.Color(51, 0, 255));
        ApplyPenIntButton.setText("Apply Global Interest");
        ApplyPenIntButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ApplyPenIntButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 70;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        ButtonPanel.add(ApplyPenIntButton, gridBagConstraints);

        Logout.setBackground(new java.awt.Color(255, 255, 255));
        Logout.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Logout.setForeground(new java.awt.Color(51, 0, 255));
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
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        ButtonPanel.add(Logout, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        BGPanel.add(ButtonPanel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        add(BGPanel, gridBagConstraints);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("<HTML><U>Teller Home</U></HTML>");
        Font font = jLabel1.getFont();
        Map attributes = font.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        jLabel1.setFont(font.deriveFont(attributes));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.insets = new java.awt.Insets(80, 0, 0, 0);
        jPanel1.add(jLabel1, gridBagConstraints);

        Bank42.setFont(new java.awt.Font("DejaVu Sans", 1, 48)); // NOI18N
        Bank42.setForeground(new java.awt.Color(204, 204, 255));
        Bank42.setText("Bank 42");
        Bank42.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel1.add(Bank42, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        add(jPanel1, gridBagConstraints);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/rsz_3lgfnqn Cropped.jpg"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        add(Background, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void SearchUserButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchUserButtonMouseClicked

        String name = JOptionPane.showInputDialog(
                null, "Please Enter User Account: ");

        if (name != null)
        {
            GUI.currentUserAccount = GUI.MasterTable.findUserAccount(name);

            if (GUI.currentUserAccount != null)
            {
                mainGUI.getTellerAP().update();
                CardLayout layout = (CardLayout) (MainPanel.getLayout());
                layout.show(MainPanel, "TellerAP");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "User Accout Not Found");
            }
        }
    }//GEN-LAST:event_SearchUserButtonMouseClicked

    private void InterestPenaltyButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_InterestPenaltyButtonActionPerformed
    {//GEN-HEADEREND:event_InterestPenaltyButtonActionPerformed
        CardLayout layout = (CardLayout) (MainPanel.getLayout());
        //layout.show(MainPanel, "IntPenPanel");
        layout.show(MainPanel, "PenIntPanel");
    }//GEN-LAST:event_InterestPenaltyButtonActionPerformed

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_LogoutMouseClicked
    {//GEN-HEADEREND:event_LogoutMouseClicked
        //retrieve MainPanel to transfer it's layout to AccountListPanel
        CardLayout layout = (CardLayout) (MainPanel.getLayout());

        //send the layout of MainPanel to new display of JPanel "Login"
        layout.show(MainPanel, "Login");
    }//GEN-LAST:event_LogoutMouseClicked

    private void ApplyPenIntButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ApplyPenIntButtonActionPerformed
    {//GEN-HEADEREND:event_ApplyPenIntButtonActionPerformed
        GUI.MasterTable.InterestAndPenaltiesTeller();
        GUI.dataout.exportDB(GUI.MasterTable);
        JOptionPane.showMessageDialog(null, "Success! Interest and penalties have been applied \n"
                + "globally to all existing Bank Accounts.", "Bank 42", 1, GUI.icon);
    }//GEN-LAST:event_ApplyPenIntButtonActionPerformed

    private void SearchUserButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_SearchUserButtonActionPerformed
    {//GEN-HEADEREND:event_SearchUserButtonActionPerformed
        Object name = JOptionPane.showInputDialog(
                null, "Please Enter User Account: ", "Bank 42", JOptionPane.INFORMATION_MESSAGE, GUI.icon, null, null);

        if (name != null)
        {
            GUI.currentUserAccount = GUI.MasterTable.findUserAccount(name.toString());

            if (GUI.currentUserAccount != null)
            {
                mainGUI.getTellerAP().update();
                CardLayout layout = (CardLayout) (MainPanel.getLayout());
                layout.show(MainPanel, "TellerAP");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "User Accout Not Found", "Bank 42", 1, GUI.icon);
            }
        }
    }//GEN-LAST:event_SearchUserButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ApplyPenIntButton;
    private javax.swing.JPanel BGPanel;
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Bank42;
    private javax.swing.JPanel ButtonPanel;
    private javax.swing.JButton InterestPenaltyButton;
    private javax.swing.JButton Logout;
    private javax.swing.JButton SearchUserButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
