/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 618062
 */
public class ViewEmployeeFrame extends javax.swing.JFrame {

    /**
     * Creates new form ViewEmployeeFrame
     */
    public ViewEmployeeFrame(EmployeeInfo employee) {
        initComponents();
        employeeNumberField.setText(StringConverter.empNumberToString(employee.getEmployeeNumber()));
        firstNameField.setText(employee.getFirstName());
        lastNameField.setText(employee.getLastName());
        genderTextField.setText(employee.getGender());
        locationField.setText(employee.getWorkLocation());
        deductionRateField.setText(Double.toString(employee.getDeductionRate()));
        if (employee instanceof PartTimeEmployee) {
            PartTimeEmployee partEmployee = (PartTimeEmployee)employee;
            yearlySalaryField.setText(Double.toString(partEmployee.calcAnnualGrossIncome()));
            netIncomeField.setText(Double.toString(partEmployee.calcAnnualNetIncome()));
            hourlyWageField.setText(Double.toString(partEmployee.getHourlyWage()));
            hoursPerWeekField.setText(Double.toString(partEmployee.getHoursPerWeek()));
            weeksPerYearField.setText(Double.toString(partEmployee.getWeeksPerYear()));
        }
        else if (employee instanceof FullTimeEmployee) {
            FullTimeEmployee partEmployee = (FullTimeEmployee)employee;
            yearlySalaryField.setText(Double.toString(partEmployee.calcAnnualGrossIncome()));
            netIncomeField.setText(Double.toString(partEmployee.calcAnnualNetIncome()));
            hourlyWageLabel.setVisible(false);
            hourlyWageField.setVisible(false);
            hoursPerWeekLabel.setVisible(false);
            hoursPerWeekField.setVisible(false);
            weeksPerYearLabel.setVisible(false);
            weeksPerYearField.setVisible(false);
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

        titleLabel = new javax.swing.JLabel();
        employeeNumberLabel = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        typeLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        workLocationLabel = new javax.swing.JLabel();
        deductionRateLabel = new javax.swing.JLabel();
        yearlySalaryLabel = new javax.swing.JLabel();
        netIncomeLabel = new javax.swing.JLabel();
        hourlyWageLabel = new javax.swing.JLabel();
        hoursPerWeekLabel = new javax.swing.JLabel();
        weeksPerYearLabel = new javax.swing.JLabel();
        returnButton = new javax.swing.JButton();
        employeeNumberField = new javax.swing.JLabel();
        firstNameField = new javax.swing.JLabel();
        lastNameField = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        genderTextField = new javax.swing.JLabel();
        locationField = new javax.swing.JLabel();
        deductionRateField = new javax.swing.JLabel();
        yearlySalaryField = new javax.swing.JLabel();
        netIncomeField = new javax.swing.JLabel();
        hourlyWageField = new javax.swing.JLabel();
        hoursPerWeekField = new javax.swing.JLabel();
        weeksPerYearField = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("View Employee");

        employeeNumberLabel.setText("Employee Number");

        firstNameLabel.setText("First Name");

        lastNameLabel.setText("Last Name");

        typeLabel.setText("Type");

        genderLabel.setText("Gender");

        workLocationLabel.setText("Work Location");

        deductionRateLabel.setText("Deduction Rate");

        yearlySalaryLabel.setText("Yearly Salary");

        netIncomeLabel.setText("Net Income");

        hourlyWageLabel.setText("Hourly Wage");

        hoursPerWeekLabel.setText("Hours Per Week");

        weeksPerYearLabel.setText("Weeks Per Year");

        returnButton.setText("Return");
        returnButton.setPreferredSize(new java.awt.Dimension(100, 32));
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });

        employeeNumberField.setText("000000");

        firstNameField.setText("Default");

        lastNameField.setText("Name");

        jLabel1.setText("Full-Time");

        genderTextField.setText("Other");

        locationField.setText("Null Location");

        deductionRateField.setText("0.2");

        yearlySalaryField.setText("50000");

        netIncomeField.setText("50000");

        hourlyWageField.setText("14");

        hoursPerWeekField.setText("20");

        weeksPerYearField.setText("50");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(weeksPerYearLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hoursPerWeekLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hourlyWageLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(netIncomeLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(yearlySalaryLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deductionRateLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(workLocationLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(genderLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(typeLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lastNameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(firstNameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(employeeNumberLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(employeeNumberField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(firstNameField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lastNameField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(genderTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(locationField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deductionRateField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(yearlySalaryField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(netIncomeField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hourlyWageField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hoursPerWeekField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(weeksPerYearField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(titleLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeeNumberLabel)
                    .addComponent(employeeNumberField))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel)
                    .addComponent(firstNameField))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameLabel)
                    .addComponent(lastNameField))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typeLabel)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderLabel)
                    .addComponent(genderTextField))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(workLocationLabel)
                    .addComponent(locationField))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deductionRateLabel)
                    .addComponent(deductionRateField))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearlySalaryLabel)
                    .addComponent(yearlySalaryField))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(netIncomeLabel)
                    .addComponent(netIncomeField))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hourlyWageLabel)
                    .addComponent(hourlyWageField))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hoursPerWeekLabel)
                    .addComponent(hoursPerWeekField))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(weeksPerYearLabel)
                    .addComponent(weeksPerYearField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        MainJFrame.setMenuVisibility(true);
    }//GEN-LAST:event_returnButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ViewEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewEmployeeFrame(new EmployeeInfo()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel deductionRateField;
    private javax.swing.JLabel deductionRateLabel;
    private javax.swing.JLabel employeeNumberField;
    private javax.swing.JLabel employeeNumberLabel;
    private javax.swing.JLabel firstNameField;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel genderTextField;
    private javax.swing.JLabel hourlyWageField;
    private javax.swing.JLabel hourlyWageLabel;
    private javax.swing.JLabel hoursPerWeekField;
    private javax.swing.JLabel hoursPerWeekLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lastNameField;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JLabel locationField;
    private javax.swing.JLabel netIncomeField;
    private javax.swing.JLabel netIncomeLabel;
    private javax.swing.JButton returnButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel typeLabel;
    private javax.swing.JLabel weeksPerYearField;
    private javax.swing.JLabel weeksPerYearLabel;
    private javax.swing.JLabel workLocationLabel;
    private javax.swing.JLabel yearlySalaryField;
    private javax.swing.JLabel yearlySalaryLabel;
    // End of variables declaration//GEN-END:variables
}