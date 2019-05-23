/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 618062
 */
public class FullTimeEmployee extends EmployeeInfo {
    //Class for full time employees
    private double yearlySalary; //Yearly salary

    public FullTimeEmployee () { //Constructor
        super();
        yearlySalary = 55806.40;
    }

    public FullTimeEmployee (int empNum, String fName, String lName, int gen, int loc, double ded, double yearlySal) { //Constructor with various attributes  
        super(empNum, fName, lName, gen, loc, ded);
        yearlySalary = yearlySal;
    }

    public FullTimeEmployee (String fName, String lName, int gen, int loc, double ded, double yearlySal) { //Like above but automatically set employee number
        super(fName, lName, gen, loc, ded);
        yearlySalary = yearlySal;
    }
    
    // Getters
    
    public double getYearlySalary() { //returns yearly salary
        return yearlySalary;
    }
    
    // Setters
    
    public boolean setYearlySalary(double sal) { //sets yearly salary if positive double
        if (sal <= 0) {
            return false;
        }
        yearlySalary = sal;
        return true;
    }
   
    public double calcAnnualGrossIncome () { //calculates annual gross income
            return (yearlySalary);
    }

    public double calcAnnualNetIncome () { //calcs annual net income
            return ((1-deductionRate) * calcAnnualGrossIncome());
    }

    public void print() { //Prints information for emplyoee onto console
            super.print();
            System.out.println("Yearly Salary: " + yearlySalary);
    }
}
