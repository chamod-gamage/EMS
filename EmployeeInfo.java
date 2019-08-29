package com.mycompany.ems;

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

public class EmployeeInfo { //Super class for all employees
    protected int employeeNumber;
    protected String firstName;
    protected String lastName;
    protected int gender;
    protected String workLocation;
    protected double deductionRate;
    public static String[] genders = {"Other", "Female", "Male"}; //Array of strings for 3 gender options
    public static ArrayList<String> locations = new ArrayList<String>() {{add("Toronto");}}; //Arraylist with locations in system (automatically adds Toronto)
    public static ArrayList<String> locationsInUse = new ArrayList<String>() ; //Arraylist containing locations in use by employees

    protected EmployeeInfo () { //Constructor with no parameters
        employeeNumber = generateEmployeeNumber();
        firstName = "Default";
        lastName = "Name";
        gender = 0;
        workLocation = "Toronto";
        deductionRate = 0.2;
    }

    protected EmployeeInfo (int employeeNum, String fName, String lName, int gen, String workLoc, double dedRate) { //Constructor with all parameters
        if (MainJFrame.getTheHT().isInTable(employeeNum)) {
                employeeNumber = generateEmployeeNumber();
        }
        else {
                employeeNumber = employeeNum;
        }
        firstName = fName;
        lastName = lName;
        gender = gen;
        workLocation = workLoc;
        deductionRate = dedRate;
    }

    protected EmployeeInfo (String fName, String lName, int gen, String workLoc, double dedRate) { //Constructor with all parameters but eNum
        employeeNumber = generateEmployeeNumber();
        firstName = fName;
        lastName = lName;
        gender = gen;
        workLocation = workLoc;
        deductionRate = dedRate;
    }
    
    // Getters
    
    public int getEmployeeNumber() {return employeeNumber;}
    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public String getGender() {return genders[gender];}
    public String getWorkLocation() {return workLocation;}
    public double getDeductionRate() {return deductionRate;}
    
    // Setters
    
    public boolean setEmployeeNumber(int num) {
        if (num < 0 || MainJFrame.getTheHT().isInTable(num)){
            return false;
        }
        employeeNumber = num;
        return true;
    }
    
    public boolean setFirstName(String fName) {
        firstName = fName;
        return true;
    }
    
    public boolean setLastName(String lName) {
        lastName = lName;
        return true;
    }
    
    public boolean setGender(String gen){ //Sets gneder to respective integer
        List<Character> genChar = StringConverter.stringToChars(gen);
        if (genChar.get(0) == 'M' || genChar.get(0) == 'm') {
            gender = 2;
            return true;
        }
        else if (genChar.get(0) == 'F' || genChar.get(0) == 'f'){
            gender = 1;
            return true;
        }
        else {
            gender = 0;
            return true;
        }   
    }
    
    public boolean setWorkLocation (String location){ //Sets work location if location is found in arraylist
        if (locations.contains(location)){
            workLocation = location;
        }
        else{
            return false;
        }
        return true;
    }
    
    public boolean setDeductionRate(double rate){ //Sets deduction rate if >0 and <1
        if (rate < 0 || rate >= 1){
            return false;
        }
        deductionRate = rate;
        return true;
    }
    //Other methods
    
    public static void addWorkLocation(String location){ //Adds location to arraylist
        locations.add(location);
    }

    private static int generateEmployeeNumber () { //Generates random employee number
            Random getNum = new Random();
            int number = 0;
            do {
                    number = getNum.nextInt(899999) + 100000;
            } while (MainJFrame.getTheHT().isInTable(number) == true);
            return number;
    }
    public static void updateLocationsInUse() { //Method to update locationsInUse arraylist
        locationsInUse.clear();
        EmployeeInfo employee;
        while (true) {
            employee = MainJFrame.getTheHT().iterate();
            if (employee == null) {
                break;
            }
            if (!locationsInUse.contains(employee.getWorkLocation())) {
                locationsInUse.add(employee.getWorkLocation());
            }
            if (locationsInUse.size() == locations.size()) {
                break;
            }
        }
    }

    public void print() { //Prints general info for employee to console
            System.out.println("Employee Number: " + employeeNumber);
            System.out.println("First Name: " + firstName);
            System.out.println("Last Name: " + lastName);
            System.out.println("Gender: " + genders[gender]);
            System.out.println("Work Location: " + workLocation);
            System.out.println("DeductionRate: " + deductionRate);
    }

    public double calcAnnualGrossIncome () {
            return 0.0;
    }

    public double calcAnnualNetIncome () {
            return 0.0;
    }
}