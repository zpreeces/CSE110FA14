/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLayer;

import java.awt.CardLayout;
import java.awt.LayoutManager;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Ryan
 */
public class PenaltyInterestPanel extends javax.swing.JPanel
{

    private GUI mainGUI;
    private JPanel MainPanel;

    public PenaltyInterestPanel()
    {
        initComponents();
    }

    public PenaltyInterestPanel(JPanel MainPanel, GUI mainGUI)
    {
        this.mainGUI = mainGUI;
        this.MainPanel = MainPanel;
        initComponents();
    }

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

        PanelDescLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        CheckingAccountRatesPanel = new javax.swing.JPanel();
        BalanceLabelTop = new javax.swing.JLabel();
        BalanceLabelMid = new javax.swing.JLabel();
        BalanceLabelBot = new javax.swing.JLabel();
        BalanceLabel = new javax.swing.JLabel();
        Checking_1000_2000_Label = new javax.swing.JLabel();
        Checking_2000_3000_Label = new javax.swing.JLabel();
        Checking_More_Than_3000_Label = new javax.swing.JLabel();
        CurrentCheckingRateLabel = new javax.swing.JLabel();
        CheckingNewRateLabel = new javax.swing.JLabel();
        Checking_1000_2000_Field = new javax.swing.JTextField();
        Checking_2000_3000_Field = new javax.swing.JTextField();
        Checking_More_Than_3000_Field = new javax.swing.JTextField();
        SavingsAccountRatesPanel = new javax.swing.JPanel();
        Savings_1000_2000_Label = new javax.swing.JLabel();
        Savings_2000_3000_Label = new javax.swing.JLabel();
        Savings_More_Than_3000_Label = new javax.swing.JLabel();
        CurrentSavingsRateLabel = new javax.swing.JLabel();
        SavingsNewRateLabel = new javax.swing.JLabel();
        Savings_1000_2000_Field = new javax.swing.JTextField();
        Savings_2000_3000_Field = new javax.swing.JTextField();
        Savings_More_Than_3000_Field = new javax.swing.JTextField();
        ConfirmButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        PenaltyButton = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setLayout(new java.awt.GridBagLayout());

        PanelDescLabel.setText("Change Penalties and Interest");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 100, 0);
        add(PanelDescLabel, gridBagConstraints);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        CheckingAccountRatesPanel.setBackground(new java.awt.Color(204, 255, 204));
        CheckingAccountRatesPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Checking Account Rates", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        CheckingAccountRatesPanel.setLayout(new java.awt.GridBagLayout());

        BalanceLabelTop.setText("$1000-$2000");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(3, 5, 3, 5);
        CheckingAccountRatesPanel.add(BalanceLabelTop, gridBagConstraints);

        BalanceLabelMid.setText("$2000-$3000");
        BalanceLabelMid.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(3, 5, 3, 5);
        CheckingAccountRatesPanel.add(BalanceLabelMid, gridBagConstraints);
        BalanceLabelMid.getAccessibleContext().setAccessibleDescription("");

        BalanceLabelBot.setText("More than $3000");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(3, 5, 3, 5);
        CheckingAccountRatesPanel.add(BalanceLabelBot, gridBagConstraints);

        BalanceLabel.setText("Balance");
        BalanceLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(3, 5, 3, 5);
        CheckingAccountRatesPanel.add(BalanceLabel, gridBagConstraints);

        Checking_1000_2000_Label.setText((String.valueOf(GUI.MasterTable.getCHECKING_RATE_1000_TO_2000()*100)) + "%");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(3, 5, 3, 5);
        CheckingAccountRatesPanel.add(Checking_1000_2000_Label, gridBagConstraints);

        Checking_2000_3000_Label.setText((String.valueOf(GUI.MasterTable.getCHECKING_RATE_2000_TO_3000()*100)) + "%");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(3, 5, 3, 5);
        CheckingAccountRatesPanel.add(Checking_2000_3000_Label, gridBagConstraints);

        Checking_More_Than_3000_Label.setText((String.valueOf(GUI.MasterTable.getCHECKING_RATE_OVER_3000()*100)) + "%");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(3, 5, 3, 5);
        CheckingAccountRatesPanel.add(Checking_More_Than_3000_Label, gridBagConstraints);

        CurrentCheckingRateLabel.setText("Current Rate");
        CurrentCheckingRateLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(3, 5, 3, 5);
        CheckingAccountRatesPanel.add(CurrentCheckingRateLabel, gridBagConstraints);

        CheckingNewRateLabel.setText("New Rate");
        CheckingNewRateLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(3, 5, 3, 5);
        CheckingAccountRatesPanel.add(CheckingNewRateLabel, gridBagConstraints);

        Checking_1000_2000_Field.setMinimumSize(new java.awt.Dimension(59, 30));
        Checking_1000_2000_Field.setPreferredSize(new java.awt.Dimension(59, 30));
        Checking_1000_2000_Field.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                Checking_1000_2000_FieldActionPerformed(evt);
            }
        });
        Checking_1000_2000_Field.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                Checking_1000_2000_FieldFocusGained(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(3, 5, 3, 5);
        CheckingAccountRatesPanel.add(Checking_1000_2000_Field, gridBagConstraints);

        Checking_2000_3000_Field.setMinimumSize(new java.awt.Dimension(59, 30));
        Checking_2000_3000_Field.setPreferredSize(new java.awt.Dimension(59, 30));
        Checking_2000_3000_Field.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                Checking_2000_3000_FieldActionPerformed(evt);
            }
        });
        Checking_2000_3000_Field.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                Checking_2000_3000_FieldFocusGained(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(3, 5, 3, 5);
        CheckingAccountRatesPanel.add(Checking_2000_3000_Field, gridBagConstraints);

        Checking_More_Than_3000_Field.setMinimumSize(new java.awt.Dimension(59, 30));
        Checking_More_Than_3000_Field.setPreferredSize(new java.awt.Dimension(59, 30));
        Checking_More_Than_3000_Field.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                Checking_More_Than_3000_FieldActionPerformed(evt);
            }
        });
        Checking_More_Than_3000_Field.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                Checking_More_Than_3000_FieldFocusGained(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(3, 5, 3, 5);
        CheckingAccountRatesPanel.add(Checking_More_Than_3000_Field, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(CheckingAccountRatesPanel, gridBagConstraints);

        SavingsAccountRatesPanel.setBackground(new java.awt.Color(204, 255, 255));
        SavingsAccountRatesPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Savings Account Rates", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        SavingsAccountRatesPanel.setToolTipText("");
        SavingsAccountRatesPanel.setName(""); // NOI18N
        SavingsAccountRatesPanel.setLayout(new java.awt.GridBagLayout());

        Savings_1000_2000_Label.setText((String.valueOf(GUI.MasterTable.getSAVINGS_RATE_1000_TO_2000()*100)) + "%");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(3, 5, 3, 5);
        SavingsAccountRatesPanel.add(Savings_1000_2000_Label, gridBagConstraints);

        Savings_2000_3000_Label.setText((String.valueOf(GUI.MasterTable.getSAVINGS_RATE_2000_TO_3000()*100)) + "%");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(3, 5, 3, 5);
        SavingsAccountRatesPanel.add(Savings_2000_3000_Label, gridBagConstraints);

        Savings_More_Than_3000_Label.setText((String.valueOf(GUI.MasterTable.getSAVINGS_RATE_OVER_3000()*100)) + "%");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(3, 5, 3, 5);
        SavingsAccountRatesPanel.add(Savings_More_Than_3000_Label, gridBagConstraints);

        CurrentSavingsRateLabel.setText("Current Rate");
        CurrentSavingsRateLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(3, 5, 3, 5);
        SavingsAccountRatesPanel.add(CurrentSavingsRateLabel, gridBagConstraints);

        SavingsNewRateLabel.setText("New Rate");
        SavingsNewRateLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(3, 5, 3, 5);
        SavingsAccountRatesPanel.add(SavingsNewRateLabel, gridBagConstraints);

        Savings_1000_2000_Field.setMinimumSize(new java.awt.Dimension(59, 30));
        Savings_1000_2000_Field.setPreferredSize(new java.awt.Dimension(59, 30));
        Savings_1000_2000_Field.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                Savings_1000_2000_FieldActionPerformed(evt);
            }
        });
        Savings_1000_2000_Field.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                Savings_1000_2000_FieldFocusGained(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(3, 5, 3, 5);
        SavingsAccountRatesPanel.add(Savings_1000_2000_Field, gridBagConstraints);

        Savings_2000_3000_Field.setMinimumSize(new java.awt.Dimension(59, 30));
        Savings_2000_3000_Field.setPreferredSize(new java.awt.Dimension(59, 30));
        Savings_2000_3000_Field.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                Savings_2000_3000_FieldActionPerformed(evt);
            }
        });
        Savings_2000_3000_Field.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                Savings_2000_3000_FieldFocusGained(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(3, 5, 3, 5);
        SavingsAccountRatesPanel.add(Savings_2000_3000_Field, gridBagConstraints);

        Savings_More_Than_3000_Field.setMinimumSize(new java.awt.Dimension(59, 30));
        Savings_More_Than_3000_Field.setPreferredSize(new java.awt.Dimension(59, 30));
        Savings_More_Than_3000_Field.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                Savings_More_Than_3000_FieldActionPerformed(evt);
            }
        });
        Savings_More_Than_3000_Field.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                Savings_More_Than_3000_FieldFocusGained(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(3, 5, 3, 5);
        SavingsAccountRatesPanel.add(Savings_More_Than_3000_Field, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(SavingsAccountRatesPanel, gridBagConstraints);

        ConfirmButton.setText("Confirm");
        ConfirmButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ConfirmButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPanel1.add(ConfirmButton, gridBagConstraints);

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                BackButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPanel1.add(BackButton, gridBagConstraints);

        PenaltyButton.setText("Change Penalty");
        PenaltyButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                PenaltyButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPanel1.add(PenaltyButton, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 100, 0);
        add(jPanel1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private boolean changeRates()
    {
        boolean wasCorrect = true;
        String input = Checking_1000_2000_Field.getText();
        if (!input.equals(""))
        {
            if (isParsable(input))
            {
                GUI.MasterTable.setCHECKING_RATE_1000_TO_2000((Double.parseDouble(input) / 100));
                Checking_1000_2000_Label.setText(input + "%");
                Checking_1000_2000_Field.setText(null);
            }
            else
            {
                wasCorrect = false;
            }
        }
        input = Checking_2000_3000_Field.getText();
        if (!input.equals(""))
        {
            if (isParsable(input))
            {
                GUI.MasterTable.setCHECKING_RATE_2000_TO_3000((Double.parseDouble(input) / 100));
                Checking_2000_3000_Label.setText(input + "%");
                Checking_2000_3000_Field.setText(null);
            }
            else
            {
                wasCorrect = false;
            }
        }
        input = Checking_More_Than_3000_Field.getText();
        if (!input.equals(""))
        {
            if (isParsable(input))
            {
                GUI.MasterTable.setCHECKING_RATE_OVER_3000((Double.parseDouble(input) / 100));
                Checking_More_Than_3000_Label.setText(input + "%");
                Checking_More_Than_3000_Field.setText(null);
            }
            else
            {
                wasCorrect = false;
            }
        }

        input = Savings_1000_2000_Field.getText();
        if (!input.equals(""))
        {
            if (isParsable(input))
            {
                GUI.MasterTable.setSAVINGS_RATE_1000_TO_2000((Double.parseDouble(input) / 100));
                Savings_1000_2000_Label.setText(input + "%");
                Savings_1000_2000_Field.setText(null);
            }
            else
            {
                wasCorrect = false;
            }
        }
        input = Savings_2000_3000_Field.getText();
        if (!input.equals(""))
        {
            if (isParsable(input))
            {
                GUI.MasterTable.setSAVINGS_RATE_2000_TO_3000((Double.parseDouble(input) / 100));
                Savings_2000_3000_Label.setText(input + "%");
                Savings_2000_3000_Field.setText(null);
            }
            else
            {
                wasCorrect = false;
            }
        }
        input = Savings_More_Than_3000_Field.getText();
        if (!input.equals(""))
        {
            if (isParsable(input))
            {
                GUI.MasterTable.setSAVINGS_RATE_OVER_3000((Double.parseDouble(input) / 100));
                Savings_More_Than_3000_Label.setText(input + "%");
                Savings_More_Than_3000_Field.setText(null);
            }
            else
            {
                wasCorrect = false;
            }
        }
        if (!wasCorrect)
        {
            JOptionPane.showMessageDialog(null, "Please enter a valid number", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return wasCorrect;
    }

    private void Checking_1000_2000_FieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_Checking_1000_2000_FieldActionPerformed
    {//GEN-HEADEREND:event_Checking_1000_2000_FieldActionPerformed
        changeRates();
    }//GEN-LAST:event_Checking_1000_2000_FieldActionPerformed

    private void Checking_2000_3000_FieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_Checking_2000_3000_FieldActionPerformed
    {//GEN-HEADEREND:event_Checking_2000_3000_FieldActionPerformed
        changeRates();
    }//GEN-LAST:event_Checking_2000_3000_FieldActionPerformed

    private void Savings_More_Than_3000_FieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_Savings_More_Than_3000_FieldActionPerformed
    {//GEN-HEADEREND:event_Savings_More_Than_3000_FieldActionPerformed
        changeRates();
    }//GEN-LAST:event_Savings_More_Than_3000_FieldActionPerformed

    private void Savings_2000_3000_FieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_Savings_2000_3000_FieldActionPerformed
    {//GEN-HEADEREND:event_Savings_2000_3000_FieldActionPerformed
        changeRates();
    }//GEN-LAST:event_Savings_2000_3000_FieldActionPerformed

    private void Savings_1000_2000_FieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_Savings_1000_2000_FieldActionPerformed
    {//GEN-HEADEREND:event_Savings_1000_2000_FieldActionPerformed
        changeRates();
    }//GEN-LAST:event_Savings_1000_2000_FieldActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BackButtonActionPerformed
    {//GEN-HEADEREND:event_BackButtonActionPerformed
        CardLayout layout = (CardLayout) (MainPanel.getLayout());
        layout.show(MainPanel, "TellerMainMenu");
    }//GEN-LAST:event_BackButtonActionPerformed

    private void ConfirmButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ConfirmButtonActionPerformed
    {//GEN-HEADEREND:event_ConfirmButtonActionPerformed
        changeRates();
    }//GEN-LAST:event_ConfirmButtonActionPerformed

    private void Checking_More_Than_3000_FieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_Checking_More_Than_3000_FieldActionPerformed
    {//GEN-HEADEREND:event_Checking_More_Than_3000_FieldActionPerformed
        changeRates();
    }//GEN-LAST:event_Checking_More_Than_3000_FieldActionPerformed

    private void Checking_1000_2000_FieldFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_Checking_1000_2000_FieldFocusGained
    {//GEN-HEADEREND:event_Checking_1000_2000_FieldFocusGained
        Checking_1000_2000_Field.setText(null);
    }//GEN-LAST:event_Checking_1000_2000_FieldFocusGained

    private void Checking_2000_3000_FieldFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_Checking_2000_3000_FieldFocusGained
    {//GEN-HEADEREND:event_Checking_2000_3000_FieldFocusGained
        Checking_2000_3000_Field.setText(null);
    }//GEN-LAST:event_Checking_2000_3000_FieldFocusGained

    private void Checking_More_Than_3000_FieldFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_Checking_More_Than_3000_FieldFocusGained
    {//GEN-HEADEREND:event_Checking_More_Than_3000_FieldFocusGained
        Checking_More_Than_3000_Field.setText(null);
    }//GEN-LAST:event_Checking_More_Than_3000_FieldFocusGained

    private void Savings_1000_2000_FieldFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_Savings_1000_2000_FieldFocusGained
    {//GEN-HEADEREND:event_Savings_1000_2000_FieldFocusGained
        Savings_1000_2000_Field.setText(null);
    }//GEN-LAST:event_Savings_1000_2000_FieldFocusGained

    private void Savings_2000_3000_FieldFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_Savings_2000_3000_FieldFocusGained
    {//GEN-HEADEREND:event_Savings_2000_3000_FieldFocusGained
        Savings_2000_3000_Field.setText(null);
    }//GEN-LAST:event_Savings_2000_3000_FieldFocusGained

    private void Savings_More_Than_3000_FieldFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_Savings_More_Than_3000_FieldFocusGained
    {//GEN-HEADEREND:event_Savings_More_Than_3000_FieldFocusGained
        Savings_More_Than_3000_Field.setText(null);
    }//GEN-LAST:event_Savings_More_Than_3000_FieldFocusGained

    private void PenaltyButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_PenaltyButtonActionPerformed
    {//GEN-HEADEREND:event_PenaltyButtonActionPerformed
        double amount;
        String amountstring = JOptionPane.showInputDialog(
                null, "The current penalty is $" + GUI.MasterTable.PENALTY_AMOUNT
                + "\n" + "Please enter a new penalty amount");

        if (isParsable(amountstring))
            amount = Double.parseDouble(amountstring);
        else
        {
            JOptionPane.showMessageDialog(null, "Please Enter a Valid number");
            return;
        }

        if (amount < 0)
        {
            JOptionPane.showMessageDialog(null, "Please Enter a Valid number");
            return;
        }
        GUI.MasterTable.PENALTY_AMOUNT = amount;
        JOptionPane.showMessageDialog(null, "Success!\n $" + amount + " is the new penalty.");
    }//GEN-LAST:event_PenaltyButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel BalanceLabel;
    private javax.swing.JLabel BalanceLabelBot;
    private javax.swing.JLabel BalanceLabelMid;
    private javax.swing.JLabel BalanceLabelTop;
    private javax.swing.JPanel CheckingAccountRatesPanel;
    private javax.swing.JLabel CheckingNewRateLabel;
    private javax.swing.JTextField Checking_1000_2000_Field;
    private javax.swing.JLabel Checking_1000_2000_Label;
    private javax.swing.JTextField Checking_2000_3000_Field;
    private javax.swing.JLabel Checking_2000_3000_Label;
    private javax.swing.JTextField Checking_More_Than_3000_Field;
    private javax.swing.JLabel Checking_More_Than_3000_Label;
    private javax.swing.JButton ConfirmButton;
    private javax.swing.JLabel CurrentCheckingRateLabel;
    private javax.swing.JLabel CurrentSavingsRateLabel;
    private javax.swing.JLabel PanelDescLabel;
    private javax.swing.JButton PenaltyButton;
    private javax.swing.JPanel SavingsAccountRatesPanel;
    private javax.swing.JLabel SavingsNewRateLabel;
    private javax.swing.JTextField Savings_1000_2000_Field;
    private javax.swing.JLabel Savings_1000_2000_Label;
    private javax.swing.JTextField Savings_2000_3000_Field;
    private javax.swing.JLabel Savings_2000_3000_Label;
    private javax.swing.JTextField Savings_More_Than_3000_Field;
    private javax.swing.JLabel Savings_More_Than_3000_Label;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
