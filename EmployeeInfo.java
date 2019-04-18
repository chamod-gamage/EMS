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

public class EmployeeInfo {
    protected int employeeNumber;
    protected String firstName;
    protected String lastName;
    protected int gender;
    protected int workLocation;
    protected double deductionRate;
    private static ArrayList<Integer> employeeNumbers = new ArrayList<Integer>();
    private static String[] genders = new String[3];
    private static ArrayList<String> locations = new ArrayList<String>();

    protected EmployeeInfo () {
        employeeNumber = generateEmployeeNumber();
        firstName = "Default";
        lastName = "Name";
        gender = 0;
        workLocation = -1;
        deductionRate = 0.2;
        genders[0] = "Other"; 
        genders[1] = "Female"; 
        genders[2] = "Male";
    }

    protected EmployeeInfo (int employeeNum, String fName, String lName, int gen, int workLoc, double dedRate) {
        if (employeeNumbers.contains(employeeNum)) {
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
        genders[0] = "Other"; 
        genders[1] = "Female"; 
        genders[2] = "Male";
    }

    protected EmployeeInfo (String fName, String lName, int gen, int workLoc, double dedRate) {
        employeeNumber = generateEmployeeNumber();
        firstName = fName;
        lastName = lName;
        gender = gen;
        workLocation = workLoc;
        deductionRate = dedRate;
        genders[0] = "Other"; 
        genders[1] = "Female"; 
        genders[2] = "Male";
    }
    
    // Getters
    
    public int getEmployeeNumber() {return employeeNumber;}
    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public int getGender() {return gender;}
    public int getWorkLocation() {return workLocation;}
    public double getDeductionRate() {return deductionRate;}
    
    // Setters
    
    public boolean setEmployeeNumber(int num) {
        if (num < 0 || employeeNumbers.contains(num)){
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
    
    public boolean setGender(String gen){
        if (gen == "Other" || gen == "other") {
            gender = 0;
            return true;
        }
        else if (gen == "Female" || gen == "female"){
            gender = 1;
            return true;
        }
        else if (gen == "Male" || gen == "male"){
            gender = 2;
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean setWorkLocation (String location){
        if (locations.contains(location)){
            workLocation = locations.indexOf(location);
        }
        else{
            addWorkLocation(location);
            workLocation = locations.indexOf(location);
        }
        return true;
    }
    
    public boolean setDeductionRate(double rate){
        if (rate < 0 || rate >= 1){
            return false;
        }
        deductionRate = rate;
        return true;
    }
    
    private static void addWorkLocation(String location){
        locations.add(location);
    }

    private static int generateEmployeeNumber () {
            Random getNum = new Random();
            int number = 0;
            do {
                    number = getNum.nextInt(899999) + 100000;
            } while (employeeNumbers.contains(number) == true);
            employeeNumbers.add(number);
            return number;
    }

    public void print() {
            System.out.println("Employee Number: " + employeeNumber);
            System.out.println("First Name: " + firstName);
            System.out.println("Last Name: " + lastName);
            System.out.println("Gender: " + genders[gender]);
            System.out.println("Work Location: " + locations.get(workLocation));
            System.out.println("DeductionRate: " + deductionRate);
    }

    public double calcAnnualGrossIncome () {
            return 0.0;
    }

    public double calcAnnualNetIncome () {
            return 0.0;
    }
}
