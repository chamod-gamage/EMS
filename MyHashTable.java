package com.mycompany.ems;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 567882
 */
import java.util.*;

public class MyHashTable {

    // ATTRIBUTES

    // buckets is an array of ArrayList. Each item in an ArrayList is a EmployeeInfo
    // object holding a reference value pointing to a employee.

    private ArrayList<EmployeeInfo>[] buckets;
    private int numInTable;
    // Used in interate method
    private int iterateHash;
    private int iterateIndex;

    // CONSTRUCTOR

    public MyHashTable(int howManyBuckets) {
        // Construct the hash table (open hashing/closed addressing) as an array of
        // howManyBuckets ArrayLists.
        // Instantiate an array to have an ArrayList as each element of the array.
        buckets = new ArrayList[howManyBuckets];
        // For each element in the array, instantiate its ArrayList.
        for (int i = 0; i < howManyBuckets; i++) {
                buckets[i] = new ArrayList(); // Instantiate the ArrayList for bucket i.
        }
    }

    // METHODS

    public int getNumInTable(){
        return numInTable;
    }

    public ArrayList<EmployeeInfo>[] getBuckets() {
        return buckets;
    }

    public int calcBucket(int employeeNumber) { // Determines bucket based on EmployeeInfo.employeeNumber
        return (employeeNumber % buckets.length);
    }

    public void addToTable(EmployeeInfo theEmployee) {
        int position = calcBucket(theEmployee.employeeNumber);
        buckets[position].add(theEmployee);
        numInTable++;
        // Add the employee referenced by the employee to the hash table.
    }

    public EmployeeInfo readFromTable(int employeeNumber) {
        int position = calcBucket(employeeNumber); // Calculate bucket
        for (int i = 0; i < buckets[position].size(); i++) { // Iterate through bucket to search for employee number
            if (buckets[position].get(i).employeeNumber == employeeNumber) {
                return buckets[position].get(i); // return employee if found
            }
        }
        return null;
    }

    public EmployeeInfo removeFromTable(int employeeNumber) {
        // Same method as readFrom table, just removes the employee
        int position = calcBucket(employeeNumber);
        for (int i = 0; i < buckets[position].size(); i++) {
            if (buckets[position].get(i).employeeNumber == employeeNumber) {
                numInTable--;
                return buckets[position].remove(i);
            }
        }
        return null;
        // Remove that employee from the hash table and return the reference value for
        // that employee.
    }

    public boolean isInTable(int employeeNumber) {
        // Same method as readFromTable, just returns a boolean
        int position = calcBucket(employeeNumber);
        for (int i = 0; i < buckets[position].size(); i++) {
            if (buckets[position].get(i).employeeNumber == employeeNumber) {
                return true;
            }
        }
        return false;
        // Return true if that employee is in the hash table, false otherwise.
    }

    public void displayTable() {  // Displays hashtable
        for (int i = 0; i < buckets.length; i ++) {
            for (int j = 0; j < buckets[i].size(); j++) {
                buckets[i].get(j).print();
            }
        }
    }
    
    public EmployeeInfo iterate() { // Used to iterate through hashtable
        while (iterateIndex >= buckets[iterateHash].size()) { // Checks that the index is within bounds, if not switches buckets
            iterateIndex = 0;
            iterateHash++;
            if (iterateHash >= buckets.length) { // Reset iterator if the last bucket has been processed
                iterateHash = 0;
                iterateIndex = 0;
                return null;
            }
        }
        EmployeeInfo toReturn = buckets[iterateHash].get(iterateIndex); // Get next employee in bucket
        iterateIndex++;
        return toReturn; // Return employee
    }
    
    public Integer[] sortedNumbers(boolean ascending) { // Returns an array of sorted employee numbers
        if (numInTable == 0) {
            return null;
        }
        Integer[] employeeNumbers = new Integer[numInTable]; // Create array for employee numbers
        int index = 0;
        for (int i = 0; i < buckets.length; i ++) { // Fill array from hashtable
            for (int j = 0; j < buckets[i].size(); j++) {
                employeeNumbers[index] = buckets[i].get(j).getEmployeeNumber();
                index++;
            }
        }
        if (ascending) { // Sort ascending
            Arrays.sort(employeeNumbers);
        }
        else { // Sort decending
            Arrays.sort(employeeNumbers, Collections.reverseOrder());
        }
        return employeeNumbers; // Return sorted array
    }
    
    public String[][] sortedFirstNames(boolean ascending) { // Returns 2d array with employees sorted by first name
        if (numInTable == 0) {
            return null;
        }
        String [][] names = new String[numInTable][2]; // [x][0] is for names, [x][1] for employee numbers
        int index = 0;
        for (int i = 0; i < buckets.length; i ++) { // Iterates through hashtable and builds array
            for (int j = 0; j < buckets[i].size(); j++) {
                names[index][0] = buckets[i].get(j).getFirstName().toLowerCase();
                names[index][1] = Integer.toString(buckets[i].get(j).getEmployeeNumber());
                index++;
            }
        }
        names = StringConverter.sortTwoDimentionalArray(names); // Sort array by ascending names
        if (!ascending) {
            names = StringConverter.reverseTwoDimentionalArray(names); // Reverse sorted array
        }
        return names;
    }
    
    public String [][] sortedLastNames(boolean ascending) { // Same as sorteFirstNames, just using the last names
        if (numInTable == 0) {
            return null;
        }
        String [][] names = new String[numInTable][2];
        int index = 0;
        for (int i = 0; i < buckets.length; i ++) {
            for (int j = 0; j < buckets[i].size(); j++) {
                names[index][0] = buckets[i].get(j).getLastName().toLowerCase();
                names[index][1] = Integer.toString(buckets[i].get(j).getEmployeeNumber());
                index++;
            }
        }
        names = StringConverter.sortTwoDimentionalArray(names);
        if (!ascending) {
            names = StringConverter.reverseTwoDimentionalArray(names);
        }
        return names;
    }
    
    public String [][] sortedLocations(boolean ascending) { // Same as sortedFirstNames, using locations
        if (numInTable == 0) {
            return null;
        }
        String [][] locations = new String[numInTable][2];
        int index = 0;
        for (int i = 0; i < buckets.length; i ++) {
            for (int j = 0; j < buckets[i].size(); j++) {
                locations[index][0] = buckets[i].get(j).getWorkLocation();
                locations[index][1] = Integer.toString(buckets[i].get(j).getEmployeeNumber());
                index++;
            }
        }
        locations = StringConverter.sortTwoDimentionalArray(locations);
        if (!ascending) {
            locations = StringConverter.reverseTwoDimentionalArray(locations);
        }
        return locations;
    }
    
    public double [][] sortedDeductionRates(boolean ascending) { // Returns a 2d array sorted by deduction rate
        if (numInTable == 0) {
            return null;
        }
        double temp;
        double [][] rates = new double[numInTable][2]; // [x][0] for deduction rate, [x][1] is for employee numbers
        int index = 0;
        for (int i = 0; i < buckets.length; i ++) { // Fill array
            for (int j = 0; j < buckets[i].size(); j++) {
                rates[index][0] = buckets[i].get(j).getDeductionRate();
                rates[index][1] = buckets[i].get(j).getEmployeeNumber();
                index++;
            }
        }
        rates = StringConverter.sortTwoDimentionalArray(rates); // Sort array
        if (!ascending) {
            rates = StringConverter.reverseTwoDimentionalArray(rates); // Reverse sorted array 
        }
        return rates;
    }
    
    public int[] sortedTypes (boolean ascending) {
        int[] toReturn = new int[numInTable];
        int frontIndex = 0;
        int backIndex = toReturn.length - 1;
        for (int i = 0; i < buckets.length; i++) {
            for (int x = 0; x < buckets[i].size(); x++) {
                if (buckets[i].get(x) instanceof FullTimeEmployee) {
                    if (ascending) {
                        toReturn[frontIndex] = buckets[i].get(x).getEmployeeNumber();
                        frontIndex++;
                    }
                    else {
                        toReturn[backIndex] = buckets[i].get(x).getEmployeeNumber();
                        backIndex--;
                    }
                }
                else {
                    if (!ascending) {
                        toReturn[frontIndex] = buckets[i].get(x).getEmployeeNumber();
                        frontIndex++;
                    }
                    else {
                        toReturn[backIndex] = buckets[i].get(x).getEmployeeNumber();
                        backIndex--;
                    }
                }
            }
        }
        return toReturn;
    }
    
    public int[] sortedGenders(boolean ascending) { // Returns an array of employee numbers sorted by gender
        int[] toReturn = new int[numInTable];
        int frontIndex = 0; // Front of array
        int backIndex = numInTable - 1; // Back of array
        ArrayList<Integer> middle = new ArrayList(); // List to hold Male employees
        for (int i = 0; i < buckets.length; i++) {
            for (int x = 0; x < buckets[i].size(); x++) {
                if ("Female".equals(buckets[i].get(x).getGender())) { // If the order is acending, the order will always be Female, Male, Other
                    if (ascending) {
                        toReturn[frontIndex] = buckets[i].get(x).getEmployeeNumber(); // Set to current front index
                        frontIndex++; // Move front index in one
                    }
                    else { // Descending is always Other, Male, Female
                        toReturn[backIndex] = buckets[i].get(x).getEmployeeNumber(); // Set to current back index
                        backIndex--; // Move back index in one
                    }
                }
                else if ("Other".equals(buckets[i].get(x).getGender())) { // Same idea as with female, but using other
                    if (!ascending) {
                        toReturn[frontIndex] = buckets[i].get(x).getEmployeeNumber();
                        frontIndex++;
                    }
                    else {
                        toReturn[backIndex] = buckets[i].get(x).getEmployeeNumber();
                        backIndex--;
                    }
                }
                else { // Add male employees to list of employees to be added to the middle
                    middle.add(buckets[i].get(x).getEmployeeNumber());
                }
            }
        }
        for (int i = 0; i < middle.size(); i++) { // Fill the middle with the male employees
            toReturn[frontIndex] = middle.get(i);
            frontIndex++;
        }
        return toReturn;
    }
}

