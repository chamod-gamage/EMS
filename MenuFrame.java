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
    private boolean sortedUp = false;
    private class HeaderEvent extends java.awt.event.MouseAdapter {
        @Override
        public void mouseClicked(java.awt.event.MouseEvent e) {
            int column = mainTable.columnAtPoint(e.getPoint());
            if (MainJFrame.getTheHT().getNumInTable() > 5000) {
                if (column != 0) {
                    return;
                }
            }
            switch (column) {
                case 0:
                    fillByEmployeeNumber();
                    break;
                case 2:
                    fillByFirstName();
                    break;
                case 3:
                    fillByLastName();
                    break;
                case 5:
                    fillByLocation();
                    break;
                case 6:
                    fillByDeductionRate();
                    break;
                default:
                    break;
            }
        }
    }

    public MenuFrame() {
        initComponents();
        initializeModel();
        mainTable.getTableHeader().addMouseListener(new HeaderEvent());
        EmployeeInfo test;
        for (int i = 0; i < 100000; i++) {
            test = new PartTimeEmployee();
            MainJFrame.getTheHT().addToTable(test);
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
        mainTable.getTableHeader().setResizingAllowed(false);
        mainTable.getTableHeader().setReorderingAllowed(false);
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
        searchBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBarActionPerformed(evt);
            }
        });

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
    
    public void cleanTable() {
        mainModel.setNumRows(0);
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
    
    public void addRow(EmployeeInfo employee) {
        mainModel.setNumRows(mainModel.getRowCount() + 1);
        mainTable.setModel(mainModel);
        mainTable.getTableHeader().setReorderingAllowed(false);
        mainTable.getColumnModel().getColumn(0).setResizable(false);
        mainTable.getColumnModel().getColumn(1).setResizable(false);
        mainTable.getColumnModel().getColumn(2).setResizable(false);
        mainTable.getColumnModel().getColumn(3).setResizable(false);
        mainTable.getColumnModel().getColumn(4).setResizable(false);
        mainTable.getColumnModel().getColumn(5).setResizable(false);
        mainTable.getColumnModel().getColumn(6).setResizable(false);
        fillRow(employee, mainModel.getRowCount() - 1);
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
    
    private void fillByEmployeeNumber() {
        if (MainJFrame.getTheHT().getNumInTable() == 0) {
            return;
        }
        Integer[] sortedList = MainJFrame.getTheHT().sortedNumbers(!sortedUp); // Does the opposit sort of whatever currently exists
        EmployeeInfo employee;
        for (int i = 0; i < sortedList.length; i++) {
            employee = MainJFrame.getTheHT().readFromTable(sortedList[i]);
            fillRow(employee, i);
        }
        if (sortedUp) {
            sortedUp = false;
        }
        else {
            sortedUp = true;
        }
    }
    
    private void fillByFirstName() {
        if (MainJFrame.getTheHT().getNumInTable() == 0) {
            return;
        }
        String [][] sortedList = MainJFrame.getTheHT().sortedFirstNames(!sortedUp); // Does the opposit sort of whatever currently exists
        EmployeeInfo employee;
        for (int i = 0; i < sortedList.length; i++) {
            employee = MainJFrame.getTheHT().readFromTable(Integer.parseInt(sortedList[i][1]));
            fillRow(employee, i);
        }
        if (sortedUp) {
            sortedUp = false;
        }
        else {
            sortedUp = true;
        }
    }
    
    private void fillByLastName() {
        if (MainJFrame.getTheHT().getNumInTable() == 0) {
            return;
        }
        String [][] sortedList = MainJFrame.getTheHT().sortedLastNames(!sortedUp); // Does the opposit sort of whatever currently exists
        EmployeeInfo employee;
        for (int i = 0; i < sortedList.length; i++) {
            employee = MainJFrame.getTheHT().readFromTable(Integer.parseInt(sortedList[i][1]));
            fillRow(employee, i);
        }
        if (sortedUp) {
            sortedUp = false;
        }
        else {
            sortedUp = true;
        }
    }
    
    private void fillByLocation() {
        if (MainJFrame.getTheHT().getNumInTable() == 0) {
            return;
        }
        String [][] sortedList = MainJFrame.getTheHT().sortedLocations(!sortedUp); // Does the opposit sort of whatever currently exists
        EmployeeInfo employee;
        for (int i = 0; i < sortedList.length; i++) {
            employee = MainJFrame.getTheHT().readFromTable(Integer.parseInt(sortedList[i][1]));
            fillRow(employee, i);
        }
        if (sortedUp) {
            sortedUp = false;
        }
        else {
            sortedUp = true;
        }
    }
    
    private void fillByDeductionRate() {
        if (MainJFrame.getTheHT().getNumInTable() == 0) {
            return;
        }
        double [][] sortedList = MainJFrame.getTheHT().sortedDeductionRates(!sortedUp); // Does the opposit sort of whatever currently exists
        EmployeeInfo employee;
        for (int i = 0; i < sortedList.length; i++) {
            employee = MainJFrame.getTheHT().readFromTable((int)sortedList[i][1]);
            fillRow(employee, i);
        }
        if (sortedUp) {
            sortedUp = false;
        }
        else {
            sortedUp = true;
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

    private void searchBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBarActionPerformed
        // TODO add your handling code here:
        String search = searchBar.getText();
        cleanTable();
        EmployeeInfo currentEmployee;
        if (search.equals("")) {
            fillTable();
        }
        else if (StringConverter.stringToInteger(search) != -1) {
            if (search.length() == 6) {
                currentEmployee = MainJFrame.getTheHT().readFromTable(StringConverter.stringToInteger(search));
                if (currentEmployee == null) {
                    return;
                }
                addRow(currentEmployee);
                return;
            }
            while (true) {
                currentEmployee = MainJFrame.getTheHT().iterate();
                if (currentEmployee == null) {
                    break;
                }
                if (Integer.toString(currentEmployee.getEmployeeNumber()).contains(search)) {
                    addRow(currentEmployee);
                }
            }
        }
        else if (StringConverter.stringChecker(search)) {
            while (true) {
                currentEmployee = MainJFrame.getTheHT().iterate();
                if (currentEmployee == null) {
                    break;
                }
                if (currentEmployee.getFirstName().toLowerCase().contains(search.toLowerCase()) || currentEmployee.getLastName().toLowerCase().contains(search.toLowerCase()) || currentEmployee.getWorkLocation().toLowerCase().contains(search.toLowerCase())) {
                    addRow(currentEmployee);
                }
            }
        }
        else if (StringConverter.stringToDouble(search) != -1) {
            while (true) {
                currentEmployee = MainJFrame.getTheHT().iterate();
                if (currentEmployee == null) {
                    break;
                }
                if (Double.toString(currentEmployee.getDeductionRate()).contains(search)) {
                    addRow(currentEmployee);
                }
            }
        }
    }//GEN-LAST:event_searchBarActionPerformed

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
