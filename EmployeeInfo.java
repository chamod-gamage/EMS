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
        workLocation = 0;
        locations.add("Null Location");
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
        locations.add("Null Location");
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
        locations.add("Null Location");
        deductionRate = dedRate;
        genders[0] = "Other"; 
        genders[1] = "Female"; 
        genders[2] = "Male";
    }
    
    // Getters
    
    public int getEmployeeNumber() {return employeeNumber;}
    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public String getGender() {return genders[gender];}
    public String getWorkLocation() {return locations.get(workLocation);}
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