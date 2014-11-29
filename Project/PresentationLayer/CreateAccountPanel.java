package PresentationLayer;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 11/9 Michio Takemoto
 * Uses import/export now, but we have a FEW issues
 ** 1) When invalid input, we have to reset all the buttons or reset the page itself
 that all the fields will reset as well. As of now, if we tried to submit something
 invalid, but we correct it and submit, it will still be invalid as the old data
 doesn't leave

 */
/**
 *
 * @author asharda
 */
public class CreateAccountPanel extends javax.swing.JPanel
{

    private JPanel MainPanel;
    private GUI mainGUI;

    /**
     * Creates new form CreateAccount
     */
    public CreateAccountPanel()
    {
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

        ERRORPOP = new java.awt.PopupMenu();
        firstName = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        createUserAccount = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        dismissView = new javax.swing.JButton();
        username = new javax.swing.JTextField();
        lastName = new javax.swing.JTextField();
        confirmPassword = new javax.swing.JPasswordField();
        email = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        errorMessage = new javax.swing.JLabel();

        ERRORPOP.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ERRORPOPActionPerformed(evt);
            }
        });

        setOpaque(false);

        firstName.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                firstNameFocusGained(evt);
            }
        });

        password.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                passwordFocusGained(evt);
            }
        });

        createUserAccount.setText("Create User Account");
        createUserAccount.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                createUserAccountActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 48)); // NOI18N
        jLabel1.setText("Bank 42");

        dismissView.setText("Back");
        dismissView.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                dismissViewMouseClicked(evt);
            }
        });

        username.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                usernameFocusGained(evt);
            }
        });

        lastName.setMinimumSize(new java.awt.Dimension(6, 35));
        lastName.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                lastNameFocusGained(evt);
            }
        });

        confirmPassword.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                confirmPasswordFocusGained(evt);
            }
        });

        email.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                emailFocusGained(evt);
            }
        });

        phone.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                phoneFocusGained(evt);
            }
        });
        phone.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                phoneActionPerformed(evt);
            }
        });

        jLabel2.setText("First Name:");

        jLabel3.setText("Last Name:");

        jLabel4.setText("Password:");

        jLabel5.setText("Username:");

        jLabel6.setText("Confirm Password:");

        jLabel7.setText("Email:");

        jLabel15.setText("Phone:");

        errorMessage.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        errorMessage.setForeground(new java.awt.Color(255, 102, 102));
        errorMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errorMessage.setText("Please fill in the field below to create an account.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(dismissView, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(errorMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(phone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
                        .addComponent(email, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lastName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(firstName, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(password, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(username, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(confirmPassword, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(createUserAccount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(dismissView, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(errorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(createUserAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    public CreateAccountPanel(JPanel MainPanel, GUI mainGUI)
    {
        this.mainGUI = mainGUI;
        this.MainPanel = MainPanel;
        initComponents();
    }

    private void createUserAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createUserAccountActionPerformed

        boolean operationSuccessful = false;

        //know which field is incorrect
        //make phone number more versatile
        errorMessage.setForeground(Color.red);

        String name1 = firstName.getText();
        String name2 = lastName.getText();
        String user = username.getText();
        char[] input1 = password.getPassword();
        String pass1 = new String(input1);
        char[] input2 = confirmPassword.getPassword();
        String input3 = email.getText();
        String pass2 = new String(input2);

        if ((name1.length() > 0) && (validateFirstName(name1) == true))
        {
            System.out.println("firstname");
            if ((name2.length() > 0) && (validateLastName(name2) == true))
            {
                System.out.println("lastname");
                if ((user.length() > 0) && (validate(user) == true))
                {
                    System.out.println("username");

                    // if (((password.getText().length()) > 0) && ((password.getText()).equals(confirmPassword.())))
                    if (((pass1.length()) > 0) && (pass1.equals(pass2)) && (validatePassword(pass1) == true))
                    {
                        System.out.println("test1");
                        if ((input3.length() > 0) && (isValidEmailAddress(input3)))
                        {
                            System.out.println("email");
                            System.out.println("test2");

                            if (validatePhoneNumber(phone.getText()))
                            {
                                System.out.println("phone");
                                System.out.println("test3");
                                System.out.println("test4");

                                GUI.currentUserAccount = GUI.MasterTable.insertUserAccount(user, input3);
                                if (GUI.currentUserAccount != null)
                                {
                                    GUI.currentUserAccount.setFirstName(firstName.getText());
                                    GUI.currentUserAccount.setLastName(name2);
                                    GUI.currentUserAccount.setUserName(user);
                                    GUI.currentUserAccount.setPassword(pass1);
                                    GUI.currentUserAccount.setEmail(input3);
                                    GUI.currentUserAccount.setPhone(phone.getText());
                                    System.out.println("You have successfully created your user account!");
                                    JOptionPane.showMessageDialog(null, "You have successfully created your user account!", "Success!",
                                            JOptionPane.INFORMATION_MESSAGE);
                                    operationSuccessful = true;
                                    CardLayout layout = (CardLayout) (MainPanel.getLayout());
                                    //send the layout of MainPanel to new display of JPanel "MainMenu"
                                    layout.show(MainPanel, "Login");
                                }

                                /*else
                                 {
                                 //print a pop up error
                                 System.out.println("Error creating an account!");
                                 JOptionPane.showMessageDialog(null, "Error creating an account!", "IN USE",
                                 JOptionPane.INFORMATION_MESSAGE);
                                 }
                                 UserAccount retVal = GUI.MasterTable.findUserAccount(username.getText());
                                 if (retVal == null){

                                 UserAccount newUser = new UserAccount();

                                 newUser.setFirstName(firstName.getText());
                                 newUser.setLastName(name2);
                                 newUser.setUserName(user);
                                 //newUser.setPassword(password.getText());
                                 newUser.setPassword(pass1);
                                 newUser.setEmail(input3);
                                 newUser.setPhone(phone.getText());
                                 newUser = GUI.MasterTable.insertUserAccount(user);*/
                                //  System.out.print("\nnewUser pass inserting to MasterTable: " newUser.getPassword()+ "\n");
                            }
                            else
                            {
                                //phone wrong
                                errorMessage.setText("Your phone number was entered\n incorrectly.");
                            }

                            //UserAccount currentUserAccount = new UserAccount(firstName.getText(),lastName.getText(),username.getText(),password.getText(),email.getText(), phone.getText(), "");
                        }
                        else
                        {
                            //email wrong
                            errorMessage.setText("Your email was entered\n incorrectly.");
                        }
                    }
                    else
                    {
                        //pass wrong
                        errorMessage.setText("Your password was entered\n incorrectly.");
                    }
                }
                else
                {
                    //username wrong
                    errorMessage.setText("Your password was entered \nincorrectly.");
                }
            }
            else
            {
                //last name wrong
                errorMessage.setText("Your last name was entered\n incorrectly.");
            }
        }
        else
        {
            //first name wrong
            errorMessage.setText("Your first name was entered incorrectly.");
        }
        //}

        if (!operationSuccessful)
        {
            System.out.println("Error with input format!");
            JOptionPane.showMessageDialog(null, "Error creating an account! INVALID FORMAT", "INVALID FORMAT", JOptionPane.INFORMATION_MESSAGE);
        }

        /*//If we reach here, user name was 100% successfully inserted into table.
         //ANY TIME THERE's DATA CHANGING (viewing information doesn't count as changing EXPORT!
         else
         {
         ImportExport dataout = new ImportExport();
         if (dataout.exportDB(GUI.MasterTable))
         {
         System.out.println("\nExported file to local source file"
         + " THROUGH CREATE ACCOUNT GUI\n");

         }
         else
         {
         System.err.println("\n\nCould not export THROUGH CREATE ACCOUNT GUI, ERROR\n\n");
         }

         }*/
    }//GEN-LAST:event_createUserAccountActionPerformed

    private void dismissViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dismissViewMouseClicked
        CardLayout layout = (CardLayout) (MainPanel.getLayout());
        layout.show(MainPanel, "Login");
    }//GEN-LAST:event_dismissViewMouseClicked

    private void firstNameFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_firstNameFocusGained
    {//GEN-HEADEREND:event_firstNameFocusGained
        firstName.setText("");
    }//GEN-LAST:event_firstNameFocusGained

    private void lastNameFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_lastNameFocusGained
    {//GEN-HEADEREND:event_lastNameFocusGained
        lastName.setText("");
    }//GEN-LAST:event_lastNameFocusGained

    private void usernameFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_usernameFocusGained
    {//GEN-HEADEREND:event_usernameFocusGained
        username.setText("");
    }//GEN-LAST:event_usernameFocusGained

    private void passwordFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_passwordFocusGained
    {//GEN-HEADEREND:event_passwordFocusGained
        password.setText("");
    }//GEN-LAST:event_passwordFocusGained

    private void confirmPasswordFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_confirmPasswordFocusGained
    {//GEN-HEADEREND:event_confirmPasswordFocusGained
        confirmPassword.setText("");
    }//GEN-LAST:event_confirmPasswordFocusGained

    private void emailFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_emailFocusGained
    {//GEN-HEADEREND:event_emailFocusGained
        email.setText("");
    }//GEN-LAST:event_emailFocusGained

    private void phoneFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_phoneFocusGained
    {//GEN-HEADEREND:event_phoneFocusGained
        phone.setText("");
    }//GEN-LAST:event_phoneFocusGained

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneActionPerformed

    private void ERRORPOPActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ERRORPOPActionPerformed
    {//GEN-HEADEREND:event_ERRORPOPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ERRORPOPActionPerformed

    private static boolean validatePhoneNumber(String phoneNo)
    {
        //validate phone numbers of format "1234567890"
        if (phoneNo.matches("\\d{10}"))
            return true;

        //validating phone number with -, . or spaces
        else if (phoneNo.matches("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}"))
            return true;

        //validating phone number with extension length from 3 to 5
        else if (phoneNo.matches("\\d{3}-\\d{3}-\\d{4}\\s(x|(ext))\\d{3,5}"))
            return true;

        //validating phone number where area code is in braces ()
        else if (phoneNo.matches("\\(\\d{3}\\)-\\d{3}-\\d{4}"))
            return true;

        //return false if nothing matches the input
        else
            return false;
    }

    private static boolean isValidEmailAddress(String email)
    {
        String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
        java.util.regex.Matcher m = p.matcher(email);
        return m.matches();
    }

    public static boolean validateFirstName(String firstName)
    {
        return firstName.matches("[A-Z][a-zA-Z]*");
    } // end method validateFirstName

    // validate last name
    public static boolean validateLastName(String lastName)
    {
        return lastName.matches("[a-zA-z]+([ '-][a-zA-Z]+)*");
    } // end method validateLastName

    public boolean validate(final String username)
    {
        String USERNAME_PATTERN = "^[a-z0-9_-]{3,20}$";
        Pattern pattern = Pattern.compile(USERNAME_PATTERN);
        Matcher matcher = pattern.matcher(username);
        return matcher.matches();
    }

    public boolean validatePassword(final String username)
    {
        String passwd = "aaZZa44@";
        String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{5,10}";
        return passwd.matches(pattern);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.PopupMenu ERRORPOP;
    private javax.swing.JPasswordField confirmPassword;
    private javax.swing.JButton createUserAccount;
    private javax.swing.JButton dismissView;
    private javax.swing.JTextField email;
    private javax.swing.JLabel errorMessage;
    private javax.swing.JTextField firstName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField lastName;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
