package project;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ahmed
 */
public class Student_Login extends javax.swing.JFrame {

    /**
     * Creates new form Students
     */
    public String username;
    public String password;
    public Student_Login() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TextfieldUsername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Button_SignUp = new javax.swing.JButton();
        Button_Login = new javax.swing.JButton();
        TextfieldPassword = new javax.swing.JPasswordField();
        ButtonShowPassword = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        ButtonBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 258, 83));

        jLabel2.setText("Username");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 80, 20));

        TextfieldUsername.setToolTipText("enter your username");
        TextfieldUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextfieldUsernameActionPerformed(evt);
            }
        });
        jPanel1.add(TextfieldUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 250, -1));

        jLabel3.setText("Password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, -1, -1));

        Button_SignUp.setBackground(new java.awt.Color(102, 204, 255));
        Button_SignUp.setText("sign up");
        Button_SignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_SignUpActionPerformed(evt);
            }
        });
        jPanel1.add(Button_SignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, 229, -1));

        Button_Login.setBackground(new java.awt.Color(102, 204, 255));
        Button_Login.setText("Login");
        Button_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_LoginActionPerformed(evt);
            }
        });
        jPanel1.add(Button_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, 229, -1));

        TextfieldPassword.setToolTipText("enter your password");
        TextfieldPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextfieldPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(TextfieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 250, -1));

        ButtonShowPassword.setToolTipText("show password");
        ButtonShowPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eye.jpg"))); // NOI18N
        ButtonShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonShowPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonShowPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, 20, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/academy2_2x (menu).jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 370, 140));

        ButtonBack.setBackground(new java.awt.Color(255, 255, 255));
        ButtonBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/back-button (1) (1).jpg"))); // NOI18N
        ButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBackActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextfieldUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextfieldUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextfieldUsernameActionPerformed

    
    
    
    
    
    
    
    private void Button_SignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_SignUpActionPerformed
        Student_registration s2 = new Student_registration();
        this.setVisible(false);
        s2.setVisible(true);
    }//GEN-LAST:event_Button_SignUpActionPerformed

    private void Button_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_LoginActionPerformed
        Scanner obj=null;
        try {
             obj =new Scanner (new File ("Student_Data.txt"));
        }
        catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(this,"error with file") ;       
        }
        username=TextfieldUsername.getText();
        password=TextfieldPassword.getText();
        String x=null;
        boolean y=false;
        while(obj.hasNextLine()){ 
            x=obj.nextLine();
            if(username.equals(x)){
                x=obj.nextLine();
                if(password.equals(x)){
                    y=true;
                    break;
                }
            }
        }
        obj.close();
        if(y==true){
            student_name s1=new student_name();
            s1.setName(username);
            Payment_process p1=new Payment_process();
            this.setVisible(false);
            p1.setVisible(true);
        }
        else{JOptionPane.showMessageDialog(this,"invalid");}
    }//GEN-LAST:event_Button_LoginActionPerformed

    private void TextfieldPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextfieldPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextfieldPasswordActionPerformed

    private void ButtonShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonShowPasswordActionPerformed
        char[] password=TextfieldPassword.getPassword();
        String passwordString = new String(password);
        JOptionPane.showMessageDialog(null, passwordString);
    }//GEN-LAST:event_ButtonShowPasswordActionPerformed

    private void ButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBackActionPerformed
    Menu m2=new Menu();
    this.setVisible(false);
    m2.setVisible(true);
    }//GEN-LAST:event_ButtonBackActionPerformed

    
    
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Student_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBack;
    private javax.swing.JButton ButtonShowPassword;
    private javax.swing.JButton Button_Login;
    private javax.swing.JButton Button_SignUp;
    private javax.swing.JPasswordField TextfieldPassword;
    private javax.swing.JTextField TextfieldUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}