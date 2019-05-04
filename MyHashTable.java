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
    
    public int getIterateHash() {
        return iterateHash;
    }
    
    public int getIterateIndex() {
        return iterateIndex;
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
        // Add the employee referenced by theemployee to the hash table.
    }

    public EmployeeInfo readFromTable(int employeeNumber) {
        int position = calcBucket(employeeNumber);
        for (int i = 0; i < buckets[position].size(); i++) {
            if (buckets[position].get(i).employeeNumber == employeeNumber) {
                return buckets[position].get(i);
            }
        }
        System.out.println("No EmployeeInfo found");
        return null;
    }

    public EmployeeInfo removeFromTable(int employeeNumber) {
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
        int position = calcBucket(employeeNumber);
        for (int i = 0; i < buckets[position].size(); i++) {
            if (buckets[position].get(i).employeeNumber == employeeNumber) {
                return true;
            }
        }
        return false;
        // Return true if that employee is in the hash table, false otherwise.
    }

    public void displayTable() {
        for (int i = 0; i < buckets.length; i ++) {
            for (int j = 0; j < buckets[i].size(); j++) {
                buckets[i].get(j).print();
            }
        }
    }
    
    public EmployeeInfo iterate() {
        if (iterateIndex >= buckets[iterateHash].size()) {
            iterateIndex = 0;
            iterateHash++;
            if (iterateHash >= buckets.length) {
                iterateHash = 0;
                iterateIndex = 0;
                return null;
            }
        }
        EmployeeInfo toReturn = buckets[iterateHash].get(iterateIndex);
        iterateIndex++;
        return toReturn;
    }
    
    public Integer[] sortedNumbers(boolean ascending) {
        if (numInTable == 0) {
            return null;
        }
        Integer[] employeeNumbers = new Integer[numInTable];
        int index = 0;
        for (int i = 0; i < buckets.length; i ++) {
            for (int j = 0; j < buckets[i].size(); j++) {
                employeeNumbers[index] = buckets[i].get(j).getEmployeeNumber();
                index++;
            }
        }
        if (ascending) {
            Arrays.sort(employeeNumbers);
        }
        else {
            Arrays.sort(employeeNumbers, Collections.reverseOrder());
        }
        return employeeNumbers;
    }
}

