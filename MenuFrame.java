/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 567882
 */

public class MenuFrame extends javax.swing.JFrame {

    /**
     * Creates new form MenuFrame
     */
    
    private javax.swing.table.DefaultTableModel mainModel;
    
    public MenuFrame() {
        initComponents();
        initializeModel();
        for (int i = 0; i < 50; i++) {
            MainJFrame.getTheHT().addToTable(new PartTimeEmployee());
        }
        fillTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addEmployeeButton = new javax.swing.JButton();
        removeEmployeeButton = new javax.swing.JButton();
        editEmployeeButton = new javax.swing.JButton();
        viewEmployeeButton = new javax.swing.JButton();
        addLocationButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        mainTable = new javax.swing.JTable();
        searchBar = new javax.swing.JTextField();
        userGuideButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addEmployeeButton.setText("Add Employees");
        addEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmployeeButtonActionPerformed(evt);
            }
        });

        removeEmployeeButton.setText("Remove Employees");
        removeEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeEmployeeButtonActionPerformed(evt);
            }
        });

        editEmployeeButton.setText("Edit Employee Information");
        editEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editEmployeeButtonActionPerformed(evt);
            }
        });

        viewEmployeeButton.setText("View Employee Information");
        viewEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewEmployeeButtonActionPerformed(evt);
            }
        });

        addLocationButton.setText("Add Work Location");
        addLocationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addLocationButtonActionPerformed(evt);
            }
        });

        mainTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Employee #", "Type", "First Name", "Last Name", "Gender", "Location", "Deduction"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(mainTable);
        if (mainTable.getColumnModel().getColumnCount() > 0) {
            mainTable.getColumnModel().getColumn(0).setResizable(false);
            mainTable.getColumnModel().getColumn(1).setResizable(false);
            mainTable.getColumnModel().getColumn(2).setResizable(false);
            mainTable.getColumnModel().getColumn(3).setResizable(false);
            mainTable.getColumnModel().getColumn(4).setResizable(false);
            mainTable.getColumnModel().getColumn(5).setResizable(false);
            mainTable.getColumnModel().getColumn(6).setResizable(false);
        }

        searchBar.setText("Search...");

        userGuideButton.setText("User Guide");
        userGuideButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userGuideButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(removeEmployeeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(addEmployeeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userGuideButton, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editEmployeeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(viewEmployeeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(addLocationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(addEmployeeButton)
                .addGap(18, 18, 18)
                .addComponent(removeEmployeeButton)
                .addGap(18, 18, 18)
                .addComponent(editEmployeeButton)
                .addGap(18, 18, 18)
                .addComponent(viewEmployeeButton)
                .addGap(18, 18, 18)
                .addComponent(addLocationButton)
                .addGap(18, 18, 18)
                .addComponent(userGuideButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void resizeTable() {
        mainModel.setNumRows(MainJFrame.getTheHT().getNumInTable());
        mainTable.setModel(mainModel);
        mainTable.getTableHeader().setReorderingAllowed(false);
        mainTable.getColumnModel().getColumn(0).setResizable(false);
        mainTable.getColumnModel().getColumn(1).setResizable(false);
        mainTable.getColumnModel().getColumn(2).setResizable(false);
        mainTable.getColumnModel().getColumn(3).setResizable(false);
        mainTable.getColumnModel().getColumn(4).setResizable(false);
        mainTable.getColumnModel().getColumn(5).setResizable(false);
        mainTable.getColumnModel().getColumn(6).setResizable(false);
    }
    
    public void initializeModel() {
        mainModel = (new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Employee #", "Type", "First Name", "Last Name", "Gender", "Location", "Deduction"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(mainTable);
        if (mainTable.getColumnModel().getColumnCount() > 0) {
            mainTable.getColumnModel().getColumn(0).setResizable(false);
            mainTable.getColumnModel().getColumn(1).setResizable(false);
            mainTable.getColumnModel().getColumn(2).setResizable(false);
            mainTable.getColumnModel().getColumn(3).setResizable(false);
            mainTable.getColumnModel().getColumn(4).setResizable(false);
            mainTable.getColumnModel().getColumn(5).setResizable(false);
            mainTable.getColumnModel().getColumn(6).setResizable(false);
        }
    }
    
    private void fillRow(EmployeeInfo employee, int row) {
        mainTable.setValueAt(Integer.toString(employee.getEmployeeNumber()), row, 0);
        if (employee instanceof PartTimeEmployee) {
            mainTable.setValueAt("Part-Time", row, 1);
        }
        else {
            mainTable.setValueAt("Full-Time", row, 1);
        }
        mainTable.setValueAt(employee.getFirstName(), row, 2);
        mainTable.setValueAt(employee.getLastName(), row, 3);
        mainTable.setValueAt(employee.getGender(), row, 4);
        mainTable.setValueAt(employee.getWorkLocation(), row, 5);
        mainTable.setValueAt(employee.getDeductionRate(), row, 6);
    }
    
    public void fillTable() {
        resizeTable();
        if (MainJFrame.getTheHT().getNumInTable() == 0) {
            return;
        }
        EmployeeInfo employee;
        int i = 0;
        while (true) {
            employee = MainJFrame.getTheHT().iterate();
            if (employee == null) {
                break;
            }
            fillRow(employee, i);
            i++;
        }
    }
    
    private void fillByEmployeeNumber(boolean sortUp) {
        if (MainJFrame.getTheHT().getNumInTable() == 0) {
            return;
        }
        Integer[] sortedList = MainJFrame.getTheHT().sortedNumbers(sortUp);
        EmployeeInfo employee;
        for (int i = 0; i < sortedList.length; i++) {
            employee = MainJFrame.getTheHT().readFromTable(sortedList[i]);
            fillRow(employee, i);
        }
    }
    
    private void editEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editEmployeeButtonActionPerformed
        // TODO add your handling code here:
        if (mainTable.getSelectedRowCount() == 1) {
            EmployeeInfo employeeToEdit = MainJFrame.getTheHT().readFromTable(Integer.parseInt(mainTable.getValueAt(mainTable.getSelectedRow(), 0).toString()));
            EditStudentFrame editFrame = new EditStudentFrame(employeeToEdit);
            editFrame.setVisible(true);
            this.setVisible(false);
            fillRow(employeeToEdit, mainTable.getSelectedRow());
        }
    }//GEN-LAST:event_editEmployeeButtonActionPerformed

    private void viewEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewEmployeeButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewEmployeeButtonActionPerformed

    private void addLocationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addLocationButtonActionPerformed
        // TODO add your handling code here:
        AddLoc theLocFrame = new AddLoc();
        theLocFrame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addLocationButtonActionPerformed

    private void removeEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeEmployeeButtonActionPerformed
        // TODO add your handling code here:
        int[] employees = mainTable.getSelectedRows();
        for (int i = 0; i < employees.length; i++) {
            Object employeeNumber = mainTable.getValueAt(employees[i], 0);
            if (employeeNumber != null) {
                MainJFrame.getTheHT().removeFromTable(Integer.parseInt(employeeNumber.toString()));
            }
        }
        fillTable();
    }//GEN-LAST:event_removeEmployeeButtonActionPerformed

    private void addEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmployeeButtonActionPerformed
        // TODO add your handling code here:
        AddFTEmpFrame theAddFrame = new AddFTEmpFrame();
        theAddFrame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addEmployeeButtonActionPerformed

    private void userGuideButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userGuideButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userGuideButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addEmployeeButton;
    private javax.swing.JButton addLocationButton;
    private javax.swing.JButton editEmployeeButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable mainTable;
    private javax.swing.JButton removeEmployeeButton;
    private javax.swing.JTextField searchBar;
    private javax.swing.JButton userGuideButton;
    private javax.swing.JButton viewEmployeeButton;
    // End of variables declaration//GEN-END:variables
}
