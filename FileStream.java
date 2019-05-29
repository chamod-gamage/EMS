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
    //Class that handles the reading and writing to files
    private FileStream(){}
    private static String filename = "src/RWMemory.txt"; //Contains main text file
    private static String backup = "Backup.txt"; //Contains backup text file (currently not functional)
    public static void readFromFile() throws Exception { //Reads information from file if it is found
        try {
            BufferedReader myFile = new BufferedReader(new FileReader(filename));
            if (myFile.readLine().equals("loc")) { //Reading location info
                    int numLoc = Integer.parseInt(myFile.readLine()); //Number of locations
                    for (int x =0; x < numLoc; x++) { //Adds location in text file to static array locations
                        String loc = myFile.readLine();
                        if (!EmployeeInfo.locations.contains(loc)) {
                            EmployeeInfo.locations.add(loc);
                        }
                    }
                }
            int length = Integer.parseInt(myFile.readLine()); //Number of employees
            for (int i = 0; i < length; i++) { 
                String dataType = myFile.readLine(); //Checks whether the employee is fulltime or parttime
                if (dataType.equals("f")) {
                    // Full time employee info reading
                    FullTimeEmployee employeeToAdd = new FullTimeEmployee();
                    employeeToAdd.setFirstName(myFile.readLine());
                    employeeToAdd.setLastName(myFile.readLine());
                    employeeToAdd.setEmployeeNumber(Integer.parseInt(myFile.readLine()));
                    employeeToAdd.setGender(myFile.readLine());
                    String locToAdd = myFile.readLine();
                    employeeToAdd.setWorkLocation(locToAdd);
                    
                    employeeToAdd.setDeductionRate(Double.parseDouble(myFile.readLine()));
                    employeeToAdd.setYearlySalary(Double.parseDouble(myFile.readLine()));
                    MainJFrame.getTheHT().addToTable(employeeToAdd);
                }
                if (dataType.equals("p")) {
                    // Part time employee info reading
                    PartTimeEmployee employeeToAdd = new PartTimeEmployee();
                    employeeToAdd.setFirstName(myFile.readLine());
                    employeeToAdd.setLastName(myFile.readLine());
                    employeeToAdd.setEmployeeNumber(Integer.parseInt(myFile.readLine()));
                    employeeToAdd.setGender(myFile.readLine());
                    String locToAdd = myFile.readLine();
                    employeeToAdd.setWorkLocation(locToAdd);
                    
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
                throw e;
            }
            // ADD POPUP 
        }
    }
    public static void writeToFile() throws Exception { //Writes info to file if it is found
        try {
            BufferedWriter myFile = new BufferedWriter(new FileWriter(filename));
            EmployeeInfo currentEmployee;
            myFile.write("loc"); myFile.newLine();
            myFile.write(Integer.toString(EmployeeInfo.locations.size())); myFile.newLine();
            for (int x = 0; x < EmployeeInfo.locations.size(); x++) { //Writing location info
                myFile.write(EmployeeInfo.locations.get(x)); myFile.newLine();
            }
            myFile.write(Integer.toString(MainJFrame.getTheHT().getNumInTable())); myFile.newLine();
            while (true) {
                currentEmployee = MainJFrame.getTheHT().iterate();
                if (currentEmployee == null) {
                    break;
                }
                if (currentEmployee instanceof PartTimeEmployee) { //Writing part time employee infos
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
                    myFile.write("f"); myFile.newLine(); //Writing full time employee infos
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
            throw e;
        }
    }
}
