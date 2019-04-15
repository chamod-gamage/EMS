/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 567882
 */
import java.util.ArrayList;

public class MyHashTable {

	// ATTRIBUTES

	// buckets is an array of ArrayList. Each item in an ArrayList is a EmployeeInfo
	// object holding a reference value pointing to a employee.

	private ArrayList<EmployeeInfo>[] buckets;
        private int numInTable;

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

	public int calcBucket(int empNumber) { // Determines bucket based on EmployeeInfo.empNumber
		return (empNumber % buckets.length);
	}

	public void addToTable(EmployeeInfo theEmployee) {
		int position = calcBucket(theEmployee.empNumber);
		buckets[position].add(theEmployee);
                numInTable++;

		// Add the employee referenced by theemployee to the hash table.
	}

	public EmployeeInfo readFromTable(int empNumber) {
		int position = calcBucket(empNumber);
		for (int i = 0; i < buckets[position].size(); i++) {
			if (buckets[position].get(i).empNumber == empNumber) {
				
				return buckets[position].get(i);
			}
		
		
		
		}
		System.out.println("No EmployeeInfo found");
		return null;
	}

	public EmployeeInfo removeFromTable(int empNumber) {
		int position = calcBucket(empNumber);
		for (int i = 0; i < buckets[position].size(); i++) {
			if (buckets[position].get(i).empNumber == empNumber) {
                                numInTable--;
				return buckets[position].remove(i);

			}
		}

		return null;
		// Remove that employee from the hash table and return the reference value for
		// that employee.
	}

	public boolean isInTable(int empNumber) {

		int position = calcBucket(empNumber);
		for (int i = 0; i < buckets[position].size(); i++) {
			if (buckets[position].get(i).empNumber == empNumber) {
				return true;
			}
		}
		return false;
		// Return true if that employee is in the hash table, false otherwise.
	}

	public void displayHorizontal() {
		// Displays the Hash table line by line with each bucket item taking up a
		// horizontal line
		for (int i = 0; i < buckets.length; i++) {
			for (int j = 0; j < buckets[i].size(); j++) {
				System.out.println(buckets[i].get(j).returnLine());
			}
			System.out.println("BUCKET/BUCKET/BUCKET/BUCKET/BUCKET/BUCKET");
		}

	}
	
	
	public void displayTable() {
		for (int i = 0; i < buckets.length; i ++) {
			for (int j = 0; j < buckets[i].size(); j++) {
				buckets[i].get(j).printInfo();
			}
		}
	}

	public void displayTableColumns() {
		// Displays HashTable with each bucket being a column
		int maxChar = 10; // Variable that will determine the characters in a column width

		for (int i = 0; i < buckets.length; i++) {
			for (int j = 0; j < buckets[i].size(); j++) {
				if (maxChar < buckets[i].get(j).returnLine().length()) {
					maxChar = buckets[i].get(j).returnLine().length();
				}
			}

		}
		maxChar += 1;

		int greatest = 0; // Variable that will determine EmployeeInfo with most characters
		for (int i = 0; i < buckets.length; i++) {

			String stringBucket = "Bucket " + i + ": ";

			System.out.print(stringBucket);
			for (int j = 0; j < maxChar - stringBucket.length(); j++)

				System.out.print(' ');

			if (buckets[i].size() > greatest) {
				greatest = buckets[i].size();
			}
		}

		for (int i = 0; i < greatest; i++) { // Prints out the Hash Table in the method's format
			System.out.println(' ');
			for (int j = 0; j < buckets.length; j++) {
				if (i < buckets[j].size()) {

					int len = maxChar - buckets[j].get(i).returnLine().length();
					System.out.print(buckets[j].get(i).returnLine());
					for (int k = 0; k < len; k++) {
						System.out.print(' ');
					}
				}

				else {
					for (int k = 0; k < maxChar; k++) {
						System.out.print(' ');
					}

				}

			}

		}

		System.out.println(' ');
	}

}

