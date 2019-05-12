/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 567882
 */
public class EditEmployeeFrame extends javax.swing.JFrame {

    /**
     * Creates new form EditEmployeeFrame
     */
    private boolean valid = true;
    private boolean done = false;
    private static MyHashTable mainHT = MainJFrame.getTheHT(); // REMOVE LATER, PLACEHOLDER HASH TABLE
    private EmployeeInfo employeeToEdit;
    public EditEmployeeFrame(EmployeeInfo employee) {
        initComponents();
        jComboBox2.removeAllItems();
        for (int x = 0; x < EmployeeInfo.locations.size(); x++) {
            jComboBox2.addItem(EmployeeInfo.locations.get(x));
        }
        employeeToEdit = employee;
        if (employee instanceof PartTimeEmployee){
            partTimeButton.setSelected(true);
            partTimeButtonActionPerformed(null);
        }
        
        else if (employee instanceof FullTimeEmployee){
            fullTimeButton.setSelected(true);
            fullTimeButtonActionPerformed(null);
        }
        setTextFields();
        invalidLabel.setVisible(false);
    }
    
    private void setTextFields(){ // DEFAULT VALUES ARE USED IF INFO IS BLANK, EXCEPTION IF IT CAN BE CALCULATED
        firstNameInput.setText(employeeToEdit.getFirstName());
        lastNameInput.setText(employeeToEdit.getLastName());
        String empNum = Integer.toString(employeeToEdit.getEmployeeNumber());
        employeeNumberInput.setText(empNum);
        jComboBox1.setSelectedItem(employeeToEdit.getWorkLocation());
        jComboBox2.setSelectedItem(employeeToEdit.getGender());
        String deduction = Double.toString(employeeToEdit.getDeductionRate());
        deductionRateInput.setText(deduction);
        if (employeeToEdit instanceof PartTimeEmployee){
            PartTimeEmployee temp = (PartTimeEmployee)employeeToEdit;
            hourlyWageInput.setText(Double.toString(temp.getHourlyWage()));
            hoursPerWeekInput.setText(Double.toString(temp.getHoursPerWeek()));
            weeksPerYearInput.setText(Double.toString(temp.getWeeksPerYear()));
            //yearlySalaryInput.setText(Double.toString(temp.calcAnnualGrossIncome()));
        }
        else {
            FullTimeEmployee temp = (FullTimeEmployee)employeeToEdit;
            hourlyWageInput.setText(Double.toString(temp.getYearlySalary()));
            //weeksPerYearInput.setText("52");
            //hoursPerWeekInput.setText("20");
            //double wage = (((temp.getYearlySalary())/52)/20);
            //hourlyWageInput.setText(Double.toString(wage));
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

        lastNameLabel = new javax.swing.JLabel();
        firstNameInput = new javax.swing.JTextField();
        hoursPerWeekLabel = new javax.swing.JLabel();
        employeeNumberInput = new javax.swing.JTextField();
        weeksPerYear = new javax.swing.JLabel();
        invalidLabel = new javax.swing.JLabel();
        fullTimeButton = new javax.swing.JRadioButton();
        partTimeButton = new javax.swing.JRadioButton();
        workLocationLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        genderLabel = new javax.swing.JLabel();
        weeksPerYearInput = new javax.swing.JTextField();
        deductionRateLabel = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        hoursPerWeekInput = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        hourlyWageLabel = new javax.swing.JLabel();
        hourlyWageInput = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        employeeNumberLabel = new javax.swing.JLabel();
        deductionRateInput = new javax.swing.JTextField();
        firstNameLabel = new javax.swing.JLabel();
        lastNameInput = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lastNameLabel.setText("Last Name:");

        firstNameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameInputActionPerformed(evt);
            }
        });

        hoursPerWeekLabel.setText("Hours / Week:");

        employeeNumberInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeNumberInputActionPerformed(evt);
            }
        });

        weeksPerYear.setText("Weeks/Year:");

        invalidLabel.setText("INVALID INFORMATION");

        fullTimeButton.setText("Full-Time");
        fullTimeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullTimeButtonActionPerformed(evt);
            }
        });

        partTimeButton.setText("Part-Time");
        partTimeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                partTimeButtonActionPerformed(evt);
            }
        });

        workLocationLabel.setText("Work Location:");

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        genderLabel.setText("Gender:");

        weeksPerYearInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weeksPerYearInputActionPerformed(evt);
            }
        });

        deductionRateLabel.setText("Deductions Rate:");

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel21.setText("EDIT EMPLOYEE");

        hoursPerWeekInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hoursPerWeekInputActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        hourlyWageLabel.setText("Hourly Wage:");

        hourlyWageInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hourlyWageInputActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        employeeNumberLabel.setText("Employee Number:");

        deductionRateInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deductionRateInputActionPerformed(evt);
            }
        });

        firstNameLabel.setText("First Name:");

        lastNameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameInputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(invalidLabel)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(partTimeButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fullTimeButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(employeeNumberLabel)
                                    .addComponent(firstNameLabel)
                                    .addComponent(lastNameLabel)
                                    .addComponent(genderLabel)
                                    .addComponent(workLocationLabel)
                                    .addComponent(deductionRateLabel)
                                    .addComponent(hourlyWageLabel)
                                    .addComponent(hoursPerWeekLabel)
                                    .addComponent(weeksPerYear))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(weeksPerYearInput, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hoursPerWeekInput, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hourlyWageInput, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(deductionRateInput, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lastNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(firstNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(employeeNumberInput, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(invalidLabel)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(partTimeButton)
                    .addComponent(fullTimeButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeeNumberInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(employeeNumberLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genderLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2)
                    .addComponent(workLocationLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deductionRateInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deductionRateLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hourlyWageInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hourlyWageLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hoursPerWeekInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hoursPerWeekLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(weeksPerYearInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(weeksPerYear))
                .addGap(11, 11, 11)
                .addComponent(jButton1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstNameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameInputActionPerformed

    private void employeeNumberInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeNumberInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employeeNumberInputActionPerformed

    private void fullTimeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullTimeButtonActionPerformed
        // TODO add your handling code here:
        fullTimeButton.setSelected(true);
        partTimeButton.setSelected(false);

        weeksPerYearInput.setVisible(false);
        hoursPerWeekInput.setVisible(false);
        hourlyWageInput.setVisible(true);
        deductionRateInput.setVisible(true);
        jComboBox2.setVisible(true);

        jComboBox1.setVisible(true);
        lastNameInput.setVisible(true);
        firstNameInput.setVisible(true);
        employeeNumberInput.setVisible(true);


        workLocationLabel.setVisible(true);

        deductionRateLabel.setVisible(true);

        hourlyWageLabel.setVisible(true);
        hourlyWageLabel.setText("Yearly Salary: ");

        employeeNumberLabel.setVisible(true);

        firstNameLabel.setVisible(true);
        lastNameLabel.setVisible(true);

        genderLabel.setVisible(true);
        hoursPerWeekLabel.setVisible(false);

        weeksPerYear.setVisible(false);

        jButton1.setVisible(true);

    }//GEN-LAST:event_fullTimeButtonActionPerformed

    private void partTimeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_partTimeButtonActionPerformed
        // TODO add your handling code here:
        fullTimeButton.setSelected(false);
        partTimeButton.setSelected(true);
        weeksPerYearInput.setVisible(true);
        hoursPerWeekInput.setVisible(true);
        hourlyWageInput.setVisible(true);
        deductionRateInput.setVisible(true);
        jComboBox2.setVisible(true);

        jComboBox1.setVisible(true);
        lastNameInput.setVisible(true);
        firstNameInput.setVisible(true);
        employeeNumberInput.setVisible(true);


        workLocationLabel.setVisible(true);

        deductionRateLabel.setVisible(true);

        hourlyWageLabel.setVisible(true);
        hourlyWageLabel.setText("Hourly Wage: ");

        employeeNumberLabel.setVisible(true);

        firstNameLabel.setVisible(true);
        lastNameLabel.setVisible(true);

        genderLabel.setVisible(true);
        hoursPerWeekLabel.setVisible(true);

        weeksPerYear.setVisible(true);

        jButton1.setVisible(true);

    }//GEN-LAST:event_partTimeButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        valid = true;
        if (done == true) {
            MainJFrame.setMenuVisibility(true);
            this.dispose();
        }
        int oldEmployeeNum = employeeToEdit.getEmployeeNumber();
        if (fullTimeButton.isSelected() && done != true) {
            FullTimeEmployee empToAdd = (FullTimeEmployee)employeeToEdit;
            if (StringConverter.stringToInteger(employeeNumberInput.getText()) != -1 && StringConverter.stringToInteger(employeeNumberInput.getText()) < 1000000) {
                 boolean returned = empToAdd.setEmployeeNumber(StringConverter.stringToInteger(employeeNumberInput.getText()));
                 if (!returned && StringConverter.stringToInteger(employeeNumberInput.getText()) != oldEmployeeNum) {
                     valid = false;
                 }
            } else {
                valid = false;
            }

            if (StringConverter.stringChecker(firstNameInput.getText())) {
                empToAdd.setFirstName(firstNameInput.getText());
            } else {
                valid = false;
            }
            if (StringConverter.stringChecker(lastNameInput.getText())) {
                empToAdd.setLastName( lastNameInput.getText());
            } else {
                valid = false;
            }
            empToAdd.setGender(jComboBox1.getSelectedItem().toString());

            empToAdd.setWorkLocation(jComboBox2.getSelectedItem().toString());

            if (StringConverter.stringToPercent(deductionRateInput.getText()) != -1) {
                empToAdd.setDeductionRate(StringConverter.stringToPercent(deductionRateInput.getText()));
            } else {
                valid = false;
            }
            if (StringConverter.stringToDollars(hourlyWageInput.getText()) != -1) {
                empToAdd.setYearlySalary(StringConverter.stringToDollars(hourlyWageInput.getText()));
            } else {
                valid = false;
            }
            if (valid == true) {
                mainHT.removeFromTable(oldEmployeeNum);
                mainHT.addToTable(empToAdd);

                invalidLabel.setVisible(false);
                jLabel21.setText("EMPLOYEE ADDED!");
                jButton1.setText("Done");
                done = true;
            } else {

                invalidLabel.setVisible(true);
            }
        }
        if (partTimeButton.isSelected() && done != true) {
            PartTimeEmployee empToAdd = (PartTimeEmployee)employeeToEdit;
            System.out.println(empToAdd.getEmployeeNumber());
            if (StringConverter.stringToInteger(employeeNumberInput.getText()) != -1 && StringConverter.stringToInteger(employeeNumberInput.getText()) < 1000000) {
                boolean returned = empToAdd.setEmployeeNumber(StringConverter.stringToInteger(employeeNumberInput.getText()));
                if (!returned && StringConverter.stringToInteger(employeeNumberInput.getText()) != oldEmployeeNum) {
                    valid = false;
                }
            } else {
                valid = false;
            }

            if (StringConverter.stringChecker(firstNameInput.getText())) {
                empToAdd.setFirstName(firstNameInput.getText());
            } else {
                valid = false;
            }
            if (StringConverter.stringChecker(lastNameInput.getText())) {
                empToAdd.setLastName( lastNameInput.getText());
            } else {
                valid = false;
            }
            empToAdd.setGender(jComboBox1.getSelectedItem().toString());

            empToAdd.setWorkLocation(jComboBox2.getSelectedItem().toString());

            if (StringConverter.stringToPercent(deductionRateInput.getText()) != -1) {
                empToAdd.setDeductionRate(StringConverter.stringToPercent(deductionRateInput.getText()));
            } else {
                valid = false;
            }
            if (StringConverter.stringToDollars(hourlyWageInput.getText()) != -1) {
                empToAdd.setHourlyWage(StringConverter.stringToDollars(hourlyWageInput.getText()));

            } else {
                valid = false;
            }
            if (StringConverter.stringToDollars(hoursPerWeekInput.getText()) != -1) {
                empToAdd.setHoursPerWeek(StringConverter.stringToDouble(hoursPerWeekInput.getText()));

            } else {
                valid = false;
            }
            if (StringConverter.stringToDollars(weeksPerYearInput.getText()) != -1) {
                empToAdd.setWeeksPerYear(StringConverter.stringToDouble(weeksPerYearInput.getText()));

            } else {
                valid = false;
            }
            if (valid == true) {
                mainHT.removeFromTable(oldEmployeeNum);
                mainHT.addToTable(empToAdd);

                invalidLabel.setVisible(false);
                jLabel21.setText("EMPLOYEE ADDED!");
                jButton1.setText("Done");
                done = true;
            } else {

                invalidLabel.setVisible(true);
            }

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void weeksPerYearInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weeksPerYearInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_weeksPerYearInputActionPerformed

    private void hoursPerWeekInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hoursPerWeekInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hoursPerWeekInputActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void hourlyWageInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hourlyWageInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hourlyWageInputActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void deductionRateInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deductionRateInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deductionRateInputActionPerformed

    private void lastNameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameInputActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        FullTimeEmployee myEmployee = new FullTimeEmployee();
        EditEmployeeFrame theFrame = new EditEmployeeFrame(myEmployee);
        theFrame.setVisible(true);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField deductionRateInput;
    private javax.swing.JLabel deductionRateLabel;
    private javax.swing.JTextField employeeNumberInput;
    private javax.swing.JLabel employeeNumberLabel;
    private javax.swing.JTextField firstNameInput;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JRadioButton fullTimeButton;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JTextField hourlyWageInput;
    private javax.swing.JLabel hourlyWageLabel;
    private javax.swing.JTextField hoursPerWeekInput;
    private javax.swing.JLabel hoursPerWeekLabel;
    private javax.swing.JLabel invalidLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JTextField lastNameInput;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JRadioButton partTimeButton;
    private javax.swing.JLabel weeksPerYear;
    private javax.swing.JTextField weeksPerYearInput;
    private javax.swing.JLabel workLocationLabel;
    // End of variables declaration//GEN-END:variables
}
