package GUI;

/****************************************************************************

                                                        Michio Takemoto
                                                        CSE 110, Fall 2014
                                          Last Updated: November 3, 2014

                                Team 42

File Name:      LoginPanel.java
Description:    This class will define what our Login Page will look like and 
                how it will behave.
 ****************************************************************************/

import Backend.UserAccount;
import javax.swing.*;
import java.awt.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginPanel extends javax.swing.JPanel
{

    // VERY IMPORTANT !! YOU MUST MAKE SURE THAT YOU GIVE EACH NEW PANEL THAT 
    // YOU DECLARE A PRIVATE VARIABLE THAT WILL STORE THE MAIN PANEL FROM GUI 
    private JPanel MainPanel;
    private GUI mainGUI;
    private static final String USERNAME_PATTERN = "^[a-z0-9_-]{1,15}$";
    
    public LoginPanel()
    {
        initComponents();
    }
    
    /* THIS CONSTRUCTOR IS EXTREMELY IMPORTANT. WRITE A CONSTRUCTOR LIKE THIS
    FOR ALL OTHER PANELS
    
    This constructor takes in MainPanel from GUI.java which gives us access to
    the main panel where all of our GUI elements will eventually be located. */
    public LoginPanel(JPanel MainPanel, GUI mainGUI)
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

        UsernameField = new javax.swing.JTextField();
        PasswordField = new javax.swing.JTextField();
        CreateAccButton = new javax.swing.JButton();
        LoginButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();

        setOpaque(false);

        UsernameField.setText("Username");
        UsernameField.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                UsernameFieldFocusGained(evt);
            }
        });
        UsernameField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                UsernameFieldActionPerformed(evt);
            }
        });

        PasswordField.setText("Password");
        PasswordField.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                PasswordFieldFocusGained(evt);
            }
        });
        PasswordField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                PasswordFieldActionPerformed(evt);
            }
        });

        CreateAccButton.setText("Create Account");
        CreateAccButton.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                CreateAccButtonMouseClicked(evt);
            }
        });

        LoginButton.setText("Login");
        LoginButton.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                LoginButtonMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 48)); // NOI18N
        jLabel1.setText("Bank 42");

        jPasswordField.setText("jPasswordField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CreateAccButton, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(UsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addGap(331, 331, 331))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(UsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CreateAccButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(168, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void UsernameFieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_UsernameFieldActionPerformed
    {//GEN-HEADEREND:event_UsernameFieldActionPerformed
        UsernameField.setText("");
    }//GEN-LAST:event_UsernameFieldActionPerformed
    
    // Creates an event for the LoginButton that will fire any time the button
    // is clicked. This is just an example to get you started.
    private void LoginButtonMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_LoginButtonMouseClicked
    {//GEN-HEADEREND:event_LoginButtonMouseClicked
        
        //if ((UsernameField.getText().length() > 0) && (PasswordField.getPassword.length() > 0) && (validate(UsernameField.getText())))
        //{
            String username = UsernameField.getText();
            //char[] passwordarray = jPasswordField.getPassword();
            //String password = passwordarray.toString();
            String password = PasswordField.getText();
            
            if((username.equals("teller"))&&(password.equals("teller")))
            {
                CardLayout layout = (CardLayout) (MainPanel.getLayout());
                layout.show(MainPanel,"TellerMainMenu");
                return;
            }
            
            GUI.currentUserAccount = GUI.MasterTable.findUserAccount(UsernameField.getText());
            
            if (GUI.currentUserAccount.equals(null))
            {
                JOptionPane.showMessageDialog(null, "Not found!", "Error!",
                                        JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                if(password.compareTo(GUI.currentUserAccount.getPassword()) == 0) {
                    mainGUI.getAccList().update();
                    // This line grabs the layout from MainPanel from the GUI class so that
                    // we can show a new panel on it
                    CardLayout layout = (CardLayout) (MainPanel.getLayout());
                    // This will show the next panel when the button is clicked. Notice 
                    // the parameters here. MainPanel is passed in, which is the panel from 
                    // GUI.java with the CardLayout that our next panel will appear on,
                    //  and "AccList" is the name of the panel that will be shown. 
                    // "AccList" matches up to the name that we gave the AccountsListPanel
                    // in GUI.java. Giving our instance of AccountsListPanel in GUI.java
                    // this name and adding that object to MainPanel has allowed us 
                    // to access and show that panel from outside of the class as long
                    //  as we pass in MainPanel
                    layout.show(MainPanel, "AccList");    
                }
                else {
                    JOptionPane.showMessageDialog(null, "Invalid Username Password Combination");
                }
                //move the following code in here, for demoing and when we're done testing. 
            }           
        //}
    }//GEN-LAST:event_LoginButtonMouseClicked
        
    private void CreateAccButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateAccButtonMouseClicked
        
        //retrieve MainPanel to transfer it's layout to CreateAccountPanel
        CardLayout layout = (CardLayout) (MainPanel.getLayout());
        
         //send the layout of MainPanel to new display of JPanel "CreateAcc"
        layout.show(MainPanel, "CreateAcc");
        
    }//GEN-LAST:event_CreateAccButtonMouseClicked

    private void UsernameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsernameFieldFocusGained
        UsernameField.setText("");
    }//GEN-LAST:event_UsernameFieldFocusGained

    private void PasswordFieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_PasswordFieldActionPerformed
    {//GEN-HEADEREND:event_PasswordFieldActionPerformed
        UsernameField.setText("");
    }//GEN-LAST:event_PasswordFieldActionPerformed

    private void PasswordFieldFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_PasswordFieldFocusGained
    {//GEN-HEADEREND:event_PasswordFieldFocusGained
        PasswordField.setText("");
    }//GEN-LAST:event_PasswordFieldFocusGained

    public boolean validate(final String username){
                   
                  Pattern pattern = Pattern.compile(USERNAME_PATTERN);
		  Matcher matcher = pattern.matcher(username);
                  
                  if (matcher.matches() == false)
                      JOptionPane.showMessageDialog(null, "Your username contains illegal characters!", "Error!",
                                        JOptionPane.INFORMATION_MESSAGE);
		  return matcher.matches();
	  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateAccButton;
    private javax.swing.JButton LoginButton;
    private javax.swing.JTextField PasswordField;
    private javax.swing.JTextField UsernameField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPasswordField;
    // End of variables declaration//GEN-END:variables
    
}
