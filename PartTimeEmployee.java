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
public class PartTimeEmployee extends EmployeeInfo { //class for parttime employees
    private double hourlyWage; //hourly wage
    private double hoursPerWeek; //hours per week
    private double weeksPerYear;//weeks per year

    public PartTimeEmployee () { //automatic constructor without any parameters
        super();
        hourlyWage = 14;
        hoursPerWeek = 20;
        weeksPerYear = 52;
    }

    public PartTimeEmployee (int empNum, String fName, String lName, int gen, String loc, double ded, double hWage, double hPer, double wPer) { //constructor with all parameters
        super(empNum, fName, lName, gen, loc, ded);
        hourlyWage = hWage;
        hoursPerWeek = hPer;
        weeksPerYear = wPer;
    }

    public PartTimeEmployee (String fName, String lName, int gen, String loc, double ded, double hWage, double hPer, double wPer) { //constructor with all parameters except emp Number
        super(fName, lName, gen, loc, ded);
        hourlyWage = hWage;
        hoursPerWeek = hPer;
        weeksPerYear = wPer;
    }
    
    // Getters
    
    public double getHourlyWage() {return hourlyWage;}
    public double getHoursPerWeek() {return hoursPerWeek;}
    public double getWeeksPerYear() {return weeksPerYear;}
    
    // Setters
    
    public boolean setHourlyWage(double wage){
        if (wage <= 0) {
            return false;
        }
        hourlyWage = wage;
        return true;
    }
    
    public boolean setHoursPerWeek(double hours){
        if (hours <= 0) {
            return false;
        }
        hoursPerWeek = hours;
        return true;
    }
    
    public boolean setWeeksPerYear(double weeks){
        if (weeks <= 0) {
            return false;
        }
        weeksPerYear = weeks;
        return true;
    }
//Other methods
    public double calcAnnualGrossIncome () {
            return (hourlyWage*hoursPerWeek*weeksPerYear);
    }

    public double calcAnnualNetIncome () {
            return ((1-deductionRate) * calcAnnualGrossIncome());
    }

    public void print() { //prints info of employee to console
            super.print();
            System.out.println("Hourly Wage: " + hourlyWage);
            System.out.println("Hours Per Week: " + hoursPerWeek);
            System.out.println("Weeks Per Year: " + weeksPerYear);
    }
}
