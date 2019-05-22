/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author P0068839
 */

import java.awt.Desktop;
import java.io.*;

public class MainJFrame extends javax.swing.JFrame {
    
    // ATTRIBUTES
    private static MyHashTable theHT; //Static hash table
    private static MenuFrame theMenu; //Static menuFrame
    
    
    // CONSTRUCTORS
    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() { //Instantiates frame with a hash table containing 10 buckets
        initComponents();
        invalidLabel.setVisible(false);
        theHT = new MyHashTable(10);
    }
    
    
    // METHODS   
    
    public static MyHashTable getTheHT() { //Returns the hash table
        return theHT;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        enterButton = new javax.swing.JButton();
        viewUserGuideButton = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        headerLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        invalidLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(325, 225));
        setPreferredSize(new java.awt.Dimension(410, 210));
        setResizable(false);

        enterButton.setText("Enter");
        enterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterButtonActionPerformed(evt);
            }
        });

        viewUserGuideButton.setText("View User Guide");
        viewUserGuideButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewUserGuideButtonActionPerformed(evt);
            }
        });

        jPasswordField1.setText("jPasswordField1");
        jPasswordField1.setMinimumSize(new java.awt.Dimension(119, 22));
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        headerLabel.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        headerLabel.setText("Welcome to the Employee Management System!");

        passwordLabel.setText("Password");

        invalidLabel.setText("PASSWORD IS INVALID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(invalidLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(passwordLabel)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(enterButton)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(viewUserGuideButton)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(headerLabel)
                        .addGap(19, 19, 19))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(headerLabel)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(invalidLabel)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(enterButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(viewUserGuideButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private static boolean isPasswordCorrect(char[] input) { //Determines whether user's entry is the password
       
        
        char[] correct = { 'I', 'N', 'V', 'A', 'L', 'I', 'D' };
        boolean isCorrect = true;
        if (input.length != correct.length) {
            isCorrect = false;
        } else {
            for (int i = 0; i < input.length; i++) {
                if (input[i] != correct[i]) {
                    isCorrect = false;
                }
            }
        }

    //Zero out the password.
        for (int i = 0; i < correct.length; i++) {
            correct[i] = 0;
        }

        return isCorrect;
    }
    
    
    private void enterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterButtonActionPerformed
        // TODO add your handling code here:
        //Proceeds to MenuFrame if password is correct, reading from file for info
        invalidLabel.setVisible(false);
        char[] input = jPasswordField1.getPassword(); 
        
        if (isPasswordCorrect(input) == true) {
            boolean alert = false;
            try {
                FileStream.readFromFile();
            }
            catch(Exception e) {
                // Create pop-up
                alert = true;
            }
            theMenu = new MenuFrame(alert);
            theMenu.setVisible(true);
            this.dispose();
        
        } 
        else { //Invalid label is set visible
            invalidLabel.setVisible(true);
        }
    }//GEN-LAST:event_enterButtonActionPerformed

    private void viewUserGuideButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewUserGuideButtonActionPerformed
        // TODO add your handling code here:
        //Opens user guide if possible and found
        File userGuide = new File("UserGuide.pdf");
        try {
            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().open(userGuide);
            }
        }
        catch (IOException e) {
            
        }      
    }//GEN-LAST:event_viewUserGuideButtonActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
        //User presses enter key
        //Proceeds to MenuFrame if password is correct, reading from file for info
        invalidLabel.setVisible(false);
        char[] input = jPasswordField1.getPassword(); 
        
        if (isPasswordCorrect(input) == true) {
            boolean alert = false;
            try {
                FileStream.readFromFile();
            }
            catch(Exception e) {
                // Create pop-up
                alert = true;
            }
            theMenu = new MenuFrame(alert);
            theMenu.setVisible(true);
            this.dispose();
        
        } 
        else {
            invalidLabel.setVisible(true);
        }
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    public static void setMenuVisibility(boolean isVisible) { //Sets visibility of MenuFrame
        theMenu.setVisible(isVisible);
        if (theMenu.isVisible()) {
            theMenu.fillTable();
        }
    }
    
    public static void setMenuEnabled(boolean isActive) {//Sets interactability of MenuFrame
        theMenu.setEnabled(isActive);
        if (theMenu.isEnabled()) {
            theMenu.fillTable();
        }
    }
    
    public static void setMenuLabel(boolean isVisible) { 
        theMenu.setLabelVisibility(isVisible);
    }
    
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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton enterButton;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JLabel invalidLabel;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton viewUserGuideButton;
    // End of variables declaration//GEN-END:variables
}
