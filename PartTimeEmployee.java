/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 618062
 */
public class PartTimeEmployee extends EmployeeInfo {
    private double hourlyWage;
    private double hoursPerWeek;
    private double weeksPerYear;

    public PartTimeEmployee () {
        super();
        hourlyWage = 14;
        hoursPerWeek = 20;
        weeksPerYear = 52;
    }

    public PartTimeEmployee (int empNum, String fName, String lName, int gen, int loc, double ded, double hWage, double hPer, double wPer) {
        super(empNum, fName, lName, gen, loc, ded);
        hourlyWage = hWage;
        hoursPerWeek = hPer;
        weeksPerYear = wPer;
    }

    public PartTimeEmployee (String fName, String lName, int gen, int loc, double ded, double hWage, double hPer, double wPer) {
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

    public double calcAnnualGrossIncome () {
            return (hourlyWage*hoursPerWeek*weeksPerYear);
    }

    public double calcAnnualNetIncome () {
            return ((1-deductionRate) * calcAnnualGrossIncome());
    }

    public void print() {
            super.print();
            System.out.println("Hourly Wage: " + hourlyWage);
            System.out.println("Hours Per Week: " + hoursPerWeek);
            System.out.println("Weeks Per Year: " + weeksPerYear);
    }
}
