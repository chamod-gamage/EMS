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
    
    private double yearlySalary;

    public FullTimeEmployee () {
        super();
        yearlySalary = 55806.40;
    }

    public FullTimeEmployee (int empNum, String fName, String lName, int gen, int loc, double ded, double yearlySal) {
        super(empNum, fName, lName, gen, loc, ded);
        yearlySalary = yearlySal;
    }

    public FullTimeEmployee (String fName, String lName, int gen, int loc, double ded, double yearlySal) {
        super(fName, lName, gen, loc, ded);
        yearlySalary = yearlySal;
    }
    
    // Getters
    
    public double getYearlySalary() {
        return yearlySalary;
    }
    
    // Setters
    
    public boolean setYearlySalary(double sal) {
        if (sal <= 0) {
            return false;
        }
        yearlySalary = sal;
        return true;
    }
   
    public double calcAnnualGrossIncome () {
            return (yearlySalary);
    }

    public double calcAnnualNetIncome () {
            return ((1-deductionRate) * calcAnnualGrossIncome());
    }

    public void print() {
            super.print();
            System.out.println("Yearly Salary: " + yearlySalary);
    }
}
