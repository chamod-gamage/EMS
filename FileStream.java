/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 618062
 */

import java.util.*;
import java.io.*;

public class FileStream {
    private FileStream(){}
    private static String filename = "src/RWMemory.txt";
    private static String backup = "Backup.txt";
    public static void readFromFile() {
        try {
            BufferedReader myFile = new BufferedReader(new FileReader(filename));
            int length = Integer.parseInt(myFile.readLine());
            for (int i = 0; i < length; i++) {
                String dataType = myFile.readLine();
                if (dataType.equals("f")) {
                    // Full time employee
                    FullTimeEmployee employeeToAdd = new FullTimeEmployee();
                    employeeToAdd.setFirstName(myFile.readLine());
                    employeeToAdd.setLastName(myFile.readLine());
                    employeeToAdd.setEmployeeNumber(Integer.parseInt(myFile.readLine()));
                    employeeToAdd.setGender(myFile.readLine());
                    employeeToAdd.setWorkLocation(myFile.readLine());
                    employeeToAdd.setDeductionRate(Double.parseDouble(myFile.readLine()));
                    employeeToAdd.setYearlySalary(Double.parseDouble(myFile.readLine()));
                    MainJFrame.getTheHT().addToTable(employeeToAdd);
                }
                if (dataType.equals("p")) {
                    // Part time employee
                    PartTimeEmployee employeeToAdd = new PartTimeEmployee();
                    employeeToAdd.setFirstName(myFile.readLine());
                    employeeToAdd.setLastName(myFile.readLine());
                    employeeToAdd.setEmployeeNumber(Integer.parseInt(myFile.readLine()));
                    employeeToAdd.setGender(myFile.readLine());
                    employeeToAdd.setWorkLocation(myFile.readLine());
                    employeeToAdd.setDeductionRate(Double.parseDouble(myFile.readLine()));
                    employeeToAdd.setHourlyWage(Double.parseDouble(myFile.readLine()));
                    employeeToAdd.setHoursPerWeek(Double.parseDouble(myFile.readLine()));
                    employeeToAdd.setWeeksPerYear(Double.parseDouble(myFile.readLine()));
                    MainJFrame.getTheHT().addToTable(employeeToAdd);
                }
            }
            myFile.close();
        }
        catch (Exception e) {
            
            if (e instanceof FileNotFoundException) {
                System.out.println("File Not Found");
                // Add option to restore from backup
                return;
            }
            // ADD POPUP 
        }
    }
    public static void writeToFile() {
        try {
            BufferedWriter myFile = new BufferedWriter(new FileWriter(filename));
            EmployeeInfo currentEmployee;
            myFile.write(Integer.toString(MainJFrame.getTheHT().getNumInTable())); myFile.newLine();
            while (true) {
                currentEmployee = MainJFrame.getTheHT().iterate();
                if (currentEmployee == null) {
                    break;
                }
                if (currentEmployee instanceof PartTimeEmployee) {
                    myFile.write("p"); myFile.newLine();
                    myFile.write(currentEmployee.getFirstName()); myFile.newLine();
                    myFile.write(currentEmployee.getLastName()); myFile.newLine();
                    myFile.write(Integer.toString(currentEmployee.getEmployeeNumber())); myFile.newLine();
                    myFile.write(currentEmployee.getGender()); myFile.newLine();
                    myFile.write(currentEmployee.getWorkLocation()); myFile.newLine();
                    myFile.write(Double.toString(currentEmployee.getDeductionRate())); myFile.newLine();
                    PartTimeEmployee currentPTEmployee = (PartTimeEmployee)currentEmployee;
                    myFile.write(Double.toString(currentPTEmployee.getHourlyWage())); myFile.newLine();
                    myFile.write(Double.toString(currentPTEmployee.getHoursPerWeek())); myFile.newLine();
                    myFile.write(Double.toString(currentPTEmployee.getWeeksPerYear())); myFile.newLine();
                }
                else {
                    myFile.write("f"); myFile.newLine();
                    myFile.write(currentEmployee.getFirstName()); myFile.newLine();
                    myFile.write(currentEmployee.getLastName()); myFile.newLine();
                    myFile.write(Integer.toString(currentEmployee.getEmployeeNumber())); myFile.newLine();
                    myFile.write(currentEmployee.getGender()); myFile.newLine();
                    myFile.write(currentEmployee.getWorkLocation()); myFile.newLine();
                    myFile.write(Double.toString(currentEmployee.getDeductionRate())); myFile.newLine();
                    FullTimeEmployee currentFTEmployee = (FullTimeEmployee)currentEmployee;
                    myFile.write(Double.toString(currentFTEmployee.getYearlySalary())); myFile.newLine();
                }
            }
            // Iterate through hashtable using employee numbers and write them all to the file
            myFile.close();
        }
        catch (IOException e) {
            System.out.println("Error Writing to Memeory");
        }
    }
    public static void restoreFromBackup () throws Exception {
        try {
            BufferedReader myFile = new BufferedReader(new FileReader(backup));
            int length = Integer.parseInt(myFile.readLine());
            for (int i = 0; i < length; i++) {
                String dataType = myFile.readLine();
                if (dataType.equals("f")) {
                    // Full time employee
                    FullTimeEmployee employeeToAdd = new FullTimeEmployee();
                    employeeToAdd.setFirstName(myFile.readLine());
                    employeeToAdd.setLastName(myFile.readLine());
                    employeeToAdd.setEmployeeNumber(Integer.parseInt(myFile.readLine()));
                    employeeToAdd.setGender(myFile.readLine());
                    employeeToAdd.setWorkLocation(myFile.readLine());
                    employeeToAdd.setDeductionRate(Double.parseDouble(myFile.readLine()));
                    employeeToAdd.setYearlySalary(Double.parseDouble(myFile.readLine()));
                    MainJFrame.getTheHT().addToTable(employeeToAdd);
                }
                if (dataType.equals("p")) {
                    // Part time employee
                    PartTimeEmployee employeeToAdd = new PartTimeEmployee();
                    employeeToAdd.setFirstName(myFile.readLine());
                    employeeToAdd.setLastName(myFile.readLine());
                    employeeToAdd.setEmployeeNumber(Integer.parseInt(myFile.readLine()));
                    employeeToAdd.setGender(myFile.readLine());
                    employeeToAdd.setWorkLocation(myFile.readLine());
                    employeeToAdd.setDeductionRate(Double.parseDouble(myFile.readLine()));
                    employeeToAdd.setHourlyWage(Double.parseDouble(myFile.readLine()));
                    employeeToAdd.setWeeksPerYear(Double.parseDouble(myFile.readLine()));
                    MainJFrame.getTheHT().addToTable(employeeToAdd);
                }
            }
            myFile.close();
        }
        catch (Exception e) {
            throw e;
        }
    }
}
