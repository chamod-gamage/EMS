/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 567882
 */
public class AddFTEmpFrame extends javax.swing.JFrame {

    /**
     * Creates new form AddFTEmpFrame
     */
    //Frame to add part time and full time employees
    
    public AddFTEmpFrame() {
        initComponents();
        jComboBox2.removeAllItems();
        for (int x = 0; x < EmployeeInfo.locations.size(); x++) { //Adds locations to ComboBox
            jComboBox2.addItem(EmployeeInfo.locations.get(x));
        }
        //Everything except radio buttons and cancel is hidden initially
        jTextField8.setVisible(false);
        jTextField9.setVisible(false);
        jTextField10.setVisible(false);
        jTextField11.setVisible(false);
        jComboBox2.setVisible(false);

        jComboBox1.setVisible(false);
        jTextField14.setVisible(false);
        jTextField15.setVisible(false);
        employeeNumberInput.setVisible(false);
        jLabel8.setVisible(false);
        
        
        jLabel9.setVisible(false);
        
       
        jLabel10.setVisible(false);
        
        jLabel11.setVisible(false);
       
        jLabel12.setVisible(false);
      
        jLabel13.setVisible(false);
        jLabel14.setVisible(false);
       
        jLabel15.setVisible(false);
        jLabel16.setVisible(false);
       
        jLabel17.setVisible(false);
        
        jLabel19.setVisible(false);
      
        submitButton.setVisible(false);
        jLabel21.setVisible(true);
    
    }
    
    private MyHashTable mainHT = MainJFrame.getTheHT();  // This contains the ref value for theHT of MainJFrame.

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        fTButton = new javax.swing.JRadioButton();
        pTButton = new javax.swing.JRadioButton();
        submitButton = new javax.swing.JButton();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        employeeNumberInput = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();

        jLabel8.setText("Yearly Salary:");

        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("EMS - Add");
        setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        setResizable(false);

        jLabel10.setText("Deductions Rate:");

        jLabel11.setText("Hourly Wage:");

        jLabel12.setText("Employee Number:");

        jLabel13.setText("First Name:");

        jLabel14.setText("Last Name:");

        jLabel16.setText("Hours / Week:");

        jLabel17.setText("Weeks/Year:");

        fTButton.setText("Full-Time");
        fTButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fTButtonActionPerformed(evt);
            }
        });

        pTButton.setText("Part-Time");
        pTButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pTButtonActionPerformed(evt);
            }
        });

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });

        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });

        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });

        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });

        employeeNumberInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeNumberInputActionPerformed(evt);
            }
        });

        jLabel19.setText("INVALID INFORMATION");

        jLabel9.setText("Work Location:");

        jLabel15.setText("Gender:");

        jLabel21.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("ADD EMPLOYEE");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton3.setText("Cancel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jButton3))
                                    .addComponent(jLabel20))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextField15, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                            .addComponent(employeeNumberInput, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                            .addComponent(jTextField14)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel17))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(submitButton, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pTButton)
                                .addGap(200, 200, 200)
                                .addComponent(fTButton)))))
                .addGap(66, 66, 66))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(170, 170, 170))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(485, 485, 485)
                        .addComponent(jLabel20))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pTButton)
                            .addComponent(fTButton))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(employeeNumberInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jComboBox2))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButton)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fTButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fTButtonActionPerformed
        // TODO add your handling code here:
        //Full-time labels and text fields are made visible
        fTButton.setSelected(true);
        pTButton.setSelected(false);
        
        jTextField8.setVisible(false);
        jTextField9.setVisible(false);
        jTextField10.setVisible(true);
        jTextField11.setVisible(true);
        jComboBox2.setVisible(true);

        jComboBox1.setVisible(true);
        jTextField14.setVisible(true);
        jTextField15.setVisible(true);
        employeeNumberInput.setVisible(true);
        jLabel8.setVisible(false);
        
        
        jLabel9.setVisible(true);
        
       
        jLabel10.setVisible(true);
        
        jLabel11.setVisible(true);
        jLabel11.setText("Yearly Salary: ");
       
        jLabel12.setVisible(true);
      
        jLabel13.setVisible(true);
        jLabel14.setVisible(true);
       
        jLabel15.setVisible(true);
        jLabel16.setVisible(false);
       
        jLabel17.setVisible(false);
      
        submitButton.setVisible(true);
        
    }//GEN-LAST:event_fTButtonActionPerformed

    private void pTButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pTButtonActionPerformed
        // TODO add your handling code here:
        //Part time labels and text fields are made visible
        fTButton.setSelected(false);
        pTButton.setSelected(true);
        jTextField8.setVisible(true);
        jTextField9.setVisible(true);
        jTextField10.setVisible(true);
        jTextField11.setVisible(true);
        jComboBox2.setVisible(true);

        jComboBox1.setVisible(true);
        jTextField14.setVisible(true);
        jTextField15.setVisible(true);
        employeeNumberInput.setVisible(true);
        jLabel8.setVisible(true);
        
        
        jLabel9.setVisible(true);
        
       
        jLabel10.setVisible(true);
        
        jLabel11.setVisible(true);
        jLabel11.setText("Hourly Wage: ");
       
        jLabel12.setVisible(true);
      
        jLabel13.setVisible(true);
        jLabel14.setVisible(true);
       
        jLabel15.setVisible(true);
        jLabel16.setVisible(true);
       
        jLabel17.setVisible(true);
      
        submitButton.setVisible(true);
        
    }//GEN-LAST:event_pTButtonActionPerformed
    private boolean valid = true; //Determines validity of entered information
    private boolean done = false; //Determines whether user is ready to exit this frame
    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        valid = true;
        if (done == true) { //Exits out of frame
            MainJFrame.setMenuEnabled(true);
            MainJFrame.setMenuLabel(false);
            this.dispose();
        }
        if (fTButton.isSelected() && done != true) { //Adding full time
            FullTimeEmployee empToAdd = new FullTimeEmployee();
            //Checking validity of user entry for each attribute and adding to empToAdd if valid
            if (StringConverter.stringToInteger(employeeNumberInput.getText()) != -1 && StringConverter.stringToInteger(employeeNumberInput.getText()) < 1000000) {
                
                if (!mainHT.isInTable(Integer.parseInt(employeeNumberInput.getText()))){
                    empToAdd.setEmployeeNumber(StringConverter.stringToInteger(employeeNumberInput.getText()));
                }else {
                valid = false;
                }
            } else {
                valid = false;
            }

            if (StringConverter.stringChecker(jTextField15.getText())) {
                empToAdd.setFirstName(jTextField15.getText().trim());
            } else {
                valid = false;
            }
            if (StringConverter.stringChecker(jTextField14.getText())) {
                empToAdd.setLastName( jTextField14.getText().trim());
            } else {
                valid = false;
            }
            empToAdd.setGender(jComboBox1.getSelectedItem().toString());

            empToAdd.setWorkLocation(jComboBox2.getSelectedItem().toString());    
            
            if (StringConverter.stringToPercent(jTextField11.getText()) != -1) {
                empToAdd.setDeductionRate(StringConverter.stringToPercent(jTextField11.getText()));
            } else {
                valid = false;
            }
            if (StringConverter.stringToDollars(jTextField10.getText()) != -1) {
                empToAdd.setYearlySalary(StringConverter.stringToDollars(jTextField10.getText()));
            } else {
                valid = false;
            }
            if (valid == true) { //Adding employee to hash table when valid; invalid label shows if not
                mainHT.addToTable(empToAdd);
                
                jLabel19.setVisible(false);
                jLabel21.setText("EMPLOYEE ADDED!");
                submitButton.setText("Done");
                done = true; 
            } else {
                
                jLabel19.setVisible(true);
            }
        }
        if (pTButton.isSelected() && done != true) { //Adding parttime
            PartTimeEmployee empToAdd = new PartTimeEmployee();
             //Checking validity of user entry for each attribute and adding to empToAdd if valid
            if (StringConverter.stringToInteger(employeeNumberInput.getText()) != -1 && StringConverter.stringToInteger(employeeNumberInput.getText()) < 1000000) {
                
                if (!mainHT.isInTable(Integer.parseInt(employeeNumberInput.getText()))){
                    empToAdd.setEmployeeNumber(StringConverter.stringToInteger(employeeNumberInput.getText()));
                }else {
                valid = false;
                }
            } else {
                valid = false;
            }

            if (StringConverter.stringChecker(jTextField15.getText())) {
                empToAdd.setFirstName(jTextField15.getText().trim());
            } else {
                valid = false;
            }
            if (StringConverter.stringChecker(jTextField14.getText())) {
                empToAdd.setLastName( jTextField14.getText().trim());
            } else {
                valid = false;
            }
            empToAdd.setGender(jComboBox1.getSelectedItem().toString());
            
            empToAdd.setWorkLocation(jComboBox2.getSelectedItem().toString());
            
            if (StringConverter.stringToPercent(jTextField11.getText()) != -1) {
                empToAdd.setDeductionRate(StringConverter.stringToPercent(jTextField11.getText()));
            } else {
                valid = false;
            }
            if (StringConverter.stringToDollars(jTextField10.getText()) != -1) {
                empToAdd.setHourlyWage(StringConverter.stringToDollars(jTextField10.getText()));
                
            } else {
                valid = false;
            }
            if (StringConverter.stringToDollars(jTextField9.getText()) != -1) {
                empToAdd.setHoursPerWeek(StringConverter.stringToDouble(jTextField9.getText()));
               
            } else {
                valid = false;
            }
            if (StringConverter.stringToDollars(jTextField8.getText()) != -1) {
                empToAdd.setWeeksPerYear(StringConverter.stringToDouble(jTextField8.getText()));
                
            } else {
                valid = false;
            }
            
            if (valid == true) { //Adding employee to hash table when valid; invalid label shows if not
                mainHT.addToTable(empToAdd);
                jLabel19.setVisible(false);
                jLabel21.setText("EMPLOYEE ADDED!");
                submitButton.setText("Done");
                done = true;
                
                
                
            } else {
                
                jLabel19.setVisible(true);
            }
            
            

            
        }
        
        
        
    }//GEN-LAST:event_submitButtonActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void employeeNumberInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeNumberInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employeeNumberInputActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        MainJFrame.setMenuEnabled(true);
        MainJFrame.setMenuLabel(false);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(AddFTEmpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddFTEmpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddFTEmpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddFTEmpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddFTEmpFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField employeeNumberInput;
    private javax.swing.JRadioButton fTButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JRadioButton pTButton;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
