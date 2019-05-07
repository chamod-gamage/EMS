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
    private javax.swing.table.DefaultTableModel mainModel;
    
    public ViewEmployeeFrame(EmployeeInfo employeeInput) {
        initComponents();
        initModel();
        if (employeeInput instanceof PartTimeEmployee) {
            setRows(12);
            PartTimeEmployee employee = (PartTimeEmployee)employeeInput;
            mainTable.setValueAt("Employee Number", 0, 0);
            mainTable.setValueAt(StringConverter.empNumberToString(employee.getEmployeeNumber()), 0, 1);
            mainTable.setValueAt("First Name", 1, 0);
            mainTable.setValueAt(employee.getFirstName(), 1, 1);
            mainTable.setValueAt("Last Name", 2, 0);
            mainTable.setValueAt(employee.getLastName(), 2, 1);
            mainTable.setValueAt("Employee Type", 3, 0);
            mainTable.setValueAt("Part Time", 3, 1);
            mainTable.setValueAt("Gender", 4, 0);
            mainTable.setValueAt(employee.getGender(), 4, 1);
            mainTable.setValueAt("Location", 5, 0);
            mainTable.setValueAt(employee.getWorkLocation(), 5, 1);
            mainTable.setValueAt("Deduction Rate", 6, 0);
            mainTable.setValueAt(employee.getDeductionRate(), 6, 1);
            mainTable.setValueAt("Hourly Wage", 7, 0);
            mainTable.setValueAt(employee.getHourlyWage(), 7, 1);
            mainTable.setValueAt("Hours per Week", 8, 0);
            mainTable.setValueAt(employee.getHoursPerWeek(), 8, 1);
            mainTable.setValueAt("Weeks per Year", 9, 0);
            mainTable.setValueAt(employee.getWeeksPerYear(), 9, 1);
            mainTable.setValueAt("Annual Gross Income", 10, 0);
            mainTable.setValueAt(employee.calcAnnualGrossIncome(), 10, 1);
            mainTable.setValueAt("Annual Net Income", 11, 0);
            mainTable.setValueAt(employee.calcAnnualNetIncome(), 11, 1);
        }
        else if (employeeInput instanceof FullTimeEmployee) {
            FullTimeEmployee employee = (FullTimeEmployee)employeeInput;
            setRows(9);
            mainTable.setValueAt("Employee Number", 0, 0);
            mainTable.setValueAt(StringConverter.empNumberToString(employee.getEmployeeNumber()), 0, 1);
            mainTable.setValueAt("First Name", 1, 0);
            mainTable.setValueAt(employee.getFirstName(), 1, 1);
            mainTable.setValueAt("Last Name", 2, 0);
            mainTable.setValueAt(employee.getLastName(), 2, 1);
            mainTable.setValueAt("Employee Type", 3, 0);
            mainTable.setValueAt("Part Time", 3, 1);
            mainTable.setValueAt("Gender", 4, 0);
            mainTable.setValueAt(employee.getGender(), 4, 1);
            mainTable.setValueAt("Location", 5, 0);
            mainTable.setValueAt(employee.getWorkLocation(), 5, 1);
            mainTable.setValueAt("Deduction Rate", 6, 0);
            mainTable.setValueAt(employee.getDeductionRate(), 6, 1);
            mainTable.setValueAt("Yearly Salary", 7, 0);
            mainTable.setValueAt(employee.calcAnnualGrossIncome(), 7, 1);
            mainTable.setValueAt("Annual Net Income", 8, 0);
            mainTable.setValueAt(employee.calcAnnualNetIncome(), 8, 1);
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
        returnButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        mainTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("View Employee");

        returnButton.setText("Return");
        returnButton.setPreferredSize(new java.awt.Dimension(100, 32));
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });

        mainTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Attribute", "Value"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(mainTable);
        if (mainTable.getColumnModel().getColumnCount() > 0) {
            mainTable.getColumnModel().getColumn(0).setResizable(false);
            mainTable.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initModel() {
        mainModel = (new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Attribute", "Value"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(mainTable);
        if (mainTable.getColumnModel().getColumnCount() > 0) {
            mainTable.getColumnModel().getColumn(0).setResizable(false);
            mainTable.getColumnModel().getColumn(1).setResizable(false);
        }
    }
    
    private void setRows(int num) {
        mainModel.setNumRows(num);
        // TOOOOOOOOOOOO DOOOOOOOOOOOOOOO ADD RESIZE
        mainTable.setModel(mainModel);
    }
    
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable mainTable;
    private javax.swing.JButton returnButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
