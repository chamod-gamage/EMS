package com.mycompany.ems;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 567882
 */
public class AddLoc extends javax.swing.JFrame {

    /**
     * Creates new form AddLoc
     */
    //Frame for user to add and remove locations
    public AddLoc() {
        initComponents();
        EmployeeInfo.updateLocationsInUse();
        mainLabel.setVisible(false);
        jComboBox1.removeAllItems(); 
        for (int x = 0; x < EmployeeInfo.locations.size(); x++) { //Adds currently stored locations to ComboBox
            jComboBox1.addItem(EmployeeInfo.locations.get(x));
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel21 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel9 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        removeButton = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        mainLabel = new javax.swing.JLabel();
        doneButton = new javax.swing.JButton();

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel21.setText("ADD EMPLOYEE");

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("EMS - Location Management");
        setResizable(false);

        jLabel9.setText("Add Location:");

        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        jLabel22.setText("LOCATION MANAGEMENT");

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        jLabel10.setText("Remove Location:");

        removeButton.setText("Remove");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        mainLabel.setText("Location Already Added");

        doneButton.setText("Done");
        doneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField12, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mainLabel)
                        .addGap(99, 99, 99)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(removeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(doneButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel22)
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(addButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(removeButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mainLabel)
                    .addComponent(doneButton))
                .addGap(3, 3, 3))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        mainLabel.setVisible(true);
        //Location adder
        if (StringConverter.stringChecker(jTextField12.getText()))   { //Checks whether the location to be added is a valid string and not already added
            if (EmployeeInfo.locations.contains(jTextField12.getText()) || EmployeeInfo.locations.contains(jTextField12.getText().toLowerCase())) {
                mainLabel.setText("Location Already Added");
            } else {
                EmployeeInfo.addWorkLocation(jTextField12.getText().trim());
                mainLabel.setText("Location Added!");
                resetBox();
                
            }
        }
        else { //Invalid label set visible
            mainLabel.setText("Invalid Input");
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        // TODO add your handling code here:
        if (EmployeeInfo.locations.size() == 0) {
            mainLabel.setText("No Locations in EMS");
            return;
        }
        String locationToRemove = jComboBox1.getSelectedItem().toString();
        
        //Remove locations iff they are not in use
        
        if (EmployeeInfo.locations.contains(locationToRemove) && !EmployeeInfo.locationsInUse.contains(locationToRemove)) {
            
            ConfirmationFrame check = new ConfirmationFrame(this, locationToRemove);
            check.setVisible(true);
        } else {
            
            mainLabel.setVisible(true);
            mainLabel.setText("Location In Use");
        }
        
    }//GEN-LAST:event_removeButtonActionPerformed

    private void resetBox() { //Removes all items from the box and reloads locations
        jComboBox1.removeAllItems();
        for (int x = 0; x < EmployeeInfo.locations.size(); x++) {
            jComboBox1.addItem(EmployeeInfo.locations.get(x));
        }
    }
    
    public void removeLocation(String locationToRemove) { //Method to remove locations
        EmployeeInfo.locations.remove(locationToRemove);
        mainLabel.setText("Location Removed!");
        mainLabel.setVisible(true);
        resetBox();
    }
    
    public void labelOff() {mainLabel.setVisible(false);} //turns label visibility off
    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void doneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneButtonActionPerformed
        // TODO add your handling code here:
        //Exits and disposes the frame
        MainJFrame.setMenuEnabled(true);
        this.dispose();
    }//GEN-LAST:event_doneButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AddLoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddLoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddLoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddLoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddLoc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton doneButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JLabel mainLabel;
    private javax.swing.JButton removeButton;
    // End of variables declaration//GEN-END:variables

}
