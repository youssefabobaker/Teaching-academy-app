/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project;

import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.time.LocalDate;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author amwah
 */
public class Student_Page extends javax.swing.JFrame {

    
    public Student_Page() {
        initComponents();
        TextFieldLink.setVisible(false);
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
        ButtonViewAssignments = new javax.swing.JButton();
        ButtonViewLectures = new javax.swing.JButton();
        TextFieldLink = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ButtonLogOut = new javax.swing.JButton();
        ButtonOpen = new javax.swing.JButton();
        ButtonExam = new javax.swing.JButton();
        ButtonBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Student Page");

        ButtonViewAssignments.setBackground(new java.awt.Color(255, 255, 255));
        ButtonViewAssignments.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ButtonViewAssignments.setText("View Assigments");
        ButtonViewAssignments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonViewAssignmentsActionPerformed(evt);
            }
        });

        ButtonViewLectures.setBackground(new java.awt.Color(255, 255, 255));
        ButtonViewLectures.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ButtonViewLectures.setText("View Lectures");
        ButtonViewLectures.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonViewLecturesActionPerformed(evt);
            }
        });

        TextFieldLink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldLinkActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/academy2_2x(teacherPage).jpg"))); // NOI18N

        ButtonLogOut.setText("Log Out");
        ButtonLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLogOutActionPerformed(evt);
            }
        });

        ButtonOpen.setText("open");
        ButtonOpen.setEnabled(false);
        ButtonOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonOpenActionPerformed(evt);
            }
        });

        ButtonExam.setBackground(new java.awt.Color(255, 255, 255));
        ButtonExam.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ButtonExam.setText("Exam");
        ButtonExam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonExamActionPerformed(evt);
            }
        });

        ButtonBack.setText("back");
        ButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ButtonLogOut))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ButtonViewAssignments, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ButtonViewLectures, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ButtonExam, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(203, 203, 203)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(427, 427, 427)
                                .addComponent(ButtonBack, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)))))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(TextFieldLink, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(168, 168, 168))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(ButtonOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(287, 287, 287))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ButtonLogOut)
                                .addGap(18, 18, 18)
                                .addComponent(ButtonBack)))
                        .addGap(39, 39, 39)
                        .addComponent(ButtonViewLectures, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonViewAssignments, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonExam, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(TextFieldLink, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(ButtonOpen)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    
    
    private void ButtonViewAssignmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonViewAssignmentsActionPerformed
        TextFieldLink.setVisible(true);
        ButtonViewLectures.setVisible(false);
        ButtonOpen.setEnabled(true);
        ButtonExam.setVisible(false);
        try { 
           Scanner in = new Scanner(new File("newFile.txt"));
           while(in.hasNext()){ 
                String link = in.nextLine();
                 TextFieldLink.setText(link);
            }
        } 
        catch (FileNotFoundException ex) {
            Logger.getLogger(Student_Page.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ButtonViewAssignmentsActionPerformed

    private void TextFieldLinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldLinkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldLinkActionPerformed

    private void ButtonLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLogOutActionPerformed
        Menu m1=new Menu();
        this.setVisible(false);
        m1.setVisible(true);

    }//GEN-LAST:event_ButtonLogOutActionPerformed

    private void ButtonOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonOpenActionPerformed
        if (Desktop.isDesktopSupported()) {
            try {
                // URL url = getClass().getResource("C:\\Users\\ahmed\\Downloads\\ahmed led.PDF");
                File myFile = new File(TextFieldLink.getText());
                Desktop.getDesktop().open(myFile);
            } 
            catch (IOException e) {
                // no application registered for PDFs
            }
        }
    }//GEN-LAST:event_ButtonOpenActionPerformed

    private void ButtonViewLecturesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonViewLecturesActionPerformed
        TextFieldLink.setVisible(true);
        ButtonViewLectures.setVisible(true);
        ButtonOpen.setEnabled(true);
        ButtonExam.setVisible(false);
        ButtonViewAssignments.setVisible(false);
        try { 
            Scanner in = new Scanner(new File("newVideoFile.txt"));
            while(in.hasNext()){
                String link = in.nextLine();
                TextFieldLink.setText(link);
            }  
        } 
        catch (FileNotFoundException ex) {
            Logger.getLogger(Student_Page.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ButtonViewLecturesActionPerformed

    private void ButtonExamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonExamActionPerformed
        LocalDate currentDate = LocalDate.now();
        try {
            FileWriter fileWriter = null;
            Scanner scan = null;
            File file = new File("lastentrydate.txt");
            if (file.exists()) {
                scan = new Scanner(file);
                if (scan.hasNext()) {
                    // String str1=scan.nextLine();
                    LocalDate dt=LocalDate.parse(scan.nextLine());
                    if(dt.isEqual(LocalDate.now())) {
                        JOptionPane.showMessageDialog(null, "You have already entered the quiz today. Try again tomorrow.");
                    }
                    else{
                        fileWriter = new FileWriter("lastentrydate.txt");
                        String str = currentDate.toString();
                        fileWriter.write(str);
                        fileWriter.close();
                        Exam ex = new Exam();
                        this.setVisible(false);
                        ex.setVisible(true);
                        ex.set_exam();    
                    }
                }
                scan.close();
            }
            else{
                fileWriter = new FileWriter("lastentrydate.txt");
                String str = currentDate.toString();
                fileWriter.write(str);
                fileWriter.close();
                Exam ex = new Exam();
                this.setVisible(false);
                ex.setVisible(true);
                ex.set_exam();
            }
        }
        catch (IOException e) {
            System.out.println("Error occurred while writing to file: " + e.getMessage());
        }
    }//GEN-LAST:event_ButtonExamActionPerformed

    private void ButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBackActionPerformed
        TextFieldLink.setVisible(false);
        ButtonViewLectures.setVisible(true);
        ButtonViewAssignments.setVisible(true);
        ButtonOpen.setEnabled(false);
        ButtonExam.setVisible(true);
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
            java.util.logging.Logger.getLogger(Student_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBack;
    private javax.swing.JButton ButtonExam;
    private javax.swing.JButton ButtonLogOut;
    private javax.swing.JButton ButtonOpen;
    private javax.swing.JButton ButtonViewAssignments;
    private javax.swing.JButton ButtonViewLectures;
    private javax.swing.JTextField TextFieldLink;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private int toString(LocalDate currentDate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
