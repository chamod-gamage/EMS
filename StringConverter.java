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

// Static class used only for methods, cannot be instantiated or extended

public final class StringConverter {
    
    private StringConverter(){}
    
    public static String empNumberToString (int num) { // Converts an employee number to a string for display
        int zeroes; // Number of zeroes to add at the start
        zeroes = 6 - Integer.toString(num).length();
        String output = Integer.toString(num); // Convert number to string
        String sixZero = "000000";
        
        char[] actualArray = sixZero.toCharArray(); //character array that will contain employee number characters
        
        for (int x = zeroes; x < 6; x++) { //Changes actualArray to actual employee number 
            int pos = x - zeroes;
            actualArray[x] = output.charAt(pos);
        }
        String toReturn = new String(actualArray); //Changes the array containing the employee number back into a string
        return toReturn;   
    }
    
    public static boolean stringChecker (String name){ // Checks that a string is a valid name input, returns false if not
        if (name.length() == 0){
            return false;
        }
        for (int x = 0; x < name.length(); x++) { // Iterate through characters in string
            int ascii = name.charAt(x); // Gets ascii code for character
            if (((ascii < 32) || (ascii > 32 && ascii < 65) || (ascii > 90 && ascii < 97) || (ascii > 122)) && ascii != 46) { // Checks that the character is valid
                return false;
            }
        }
        return true;
    }
    
    public static List<Character> stringToChars (String text) { // Not sure why this is here, but we're afraid to remove it
        List<Character> chars = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            chars.add(text.charAt(i));
	}
        return chars;
    }
    
    public static int stringToInteger(String employeeNumber) { // Converts a string to an employeeNumber, returns -1 if operation fails
        if (employeeNumber.length() == 0){
            return -1;
        }
        for (int x = 0; x < employeeNumber.length(); x++) { // Iterate through characters, check validity via ascii
            int ascii = employeeNumber.charAt(x);
            if (ascii < 48 || ascii > 57) {
                return -1;
            }
        }
        int num = Integer.parseInt(employeeNumber); // Convert to integer
        return num;
    }
    
    public static double stringToDouble (String doub) { // Converts a string to a double, returns -1 if it fails
        if (doub.length() == 0){
            return -1;
        }
        int perCounter = 0; // Counts number of periods, only one allowed
        for (int x = 0; x < doub.length(); x++) { // Check each character by ascii
            int ascii = doub.charAt(x);
            if ((ascii < 48 || ascii > 57) && ascii != 46) {
                return -1;
            }
            if (ascii == 46){
                perCounter++; // Number of periods updated
            }
        }
        if (perCounter > 1){ // Return -1 if more than one period
            return -1;
        }
        double num = Double.parseDouble(doub); // Convert to double
        return num;
    }
    
    public static double stringToDollars (String doub) { // This used to have seperate functionality, but now only exists so that we didn't have to rewrite other parts of the code
        double toReturn = stringToDouble(doub);
        return toReturn;
    }
    
    public static double stringToPercent (String doub) {  // Adds check to make sure double is between 0 and 1
        double toReturn = stringToDouble(doub);
        if (0 <= toReturn && 1 > toReturn) {
            return toReturn;
        }
        return -1;
    } 
    
    public static String[][] sortTwoDimentionalArray(String[][] array) { // Sorts a two dimensional array of strings in alphabetical order by strings in [x][0]
        if (array.length < 2) {
            return array;
        }
        boolean isIdentical; // If strings are the same
        String [][] first; // Array of strings less than the key
        String [][] second; // Array of strings greater than the key
        int firstLength = 0;
        int secondLength = 0;
        int keyIndex = array.length/2; // Index of the key
        String keyValue = array[keyIndex][0]; // Value of the key
        String keyNumber = array[keyIndex][1]; // Employee number associated with the key
        for (int i = 0; i < array.length; i++){ // Iterate through array
            isIdentical = true; // Assume the strings are identical to start
            if (i == keyIndex) { // Skip key
                continue;
            }
            if (keyValue.length() < array[i][0].length()) { // Check for shorter string, iterate based on its length
                for (int x = 0; x < keyValue.length(); x++) { // If non-key is shorter
                    int asciiKey = keyValue.charAt(x);
                    int asciiCurrent = array[i][0].charAt(x); // Compare letters by ascii values and update associated array length
                    if (asciiKey > asciiCurrent) {
                        firstLength++;
                        isIdentical = false;
                        break;
                    }
                    else if (asciiKey < asciiCurrent) {
                        secondLength++;
                        isIdentical = false;
                        break;
                    }
                }
                if (isIdentical) { // Case of identical strings
                    firstLength++;
                }
            }
            else {
                for (int x = 0; x < array[i][0].length(); x++) { // Same as last case, iterating using key length
                    int asciiKey = keyValue.charAt(x);
                    int asciiCurrent = array[i][0].charAt(x);
                    if (asciiKey > asciiCurrent) {
                        firstLength++;
                        isIdentical = false;
                        break;
                    }
                    else if (asciiKey < asciiCurrent) {
                        secondLength++;
                        isIdentical = false;
                        break;
                    }
                }
                if (isIdentical) {
                    firstLength++;
                }
            }
        }
        first = new String[firstLength][2]; // Created arrays now that sizes have been determined
        second = new String[secondLength][2];
        int firstIndex = 0; // Index currently being added to
        int secondIndex = 0;
        for (int i = 0; i < array.length; i++){ // Same as last loop, this time adding to the array instead of updating length
            isIdentical = true;
            if (i == keyIndex) {
                continue;
            }
            if (keyValue.length() < array[i][0].length()) {
                for (int x = 0; x < keyValue.length(); x++) {
                    int asciiKey = keyValue.charAt(x);
                    int asciiCurrent = array[i][0].charAt(x);
                    if (asciiKey > asciiCurrent) {
                        first[firstIndex][0] = array[i][0]; // Add string
                        first[firstIndex][1] = array[i][1]; // Add employee number
                        firstIndex++; // Update index
                        isIdentical = false;
                        break;
                    }
                    else if (asciiKey < asciiCurrent) {
                        second[secondIndex][0] = array[i][0];
                        second[secondIndex][1] = array[i][1];
                        secondIndex++;
                        isIdentical = false;
                        break;
                    }
                }
                if (isIdentical) {
                    first[firstIndex][0] = array[i][0];
                    first[firstIndex][1] = array[i][1];
                    firstIndex++;
                }
            }
            else {
                for (int x = 0; x < array[i][0].length(); x++) {
                    int asciiKey = keyValue.charAt(x);
                    int asciiCurrent = array[i][0].charAt(x);
                    if (asciiKey > asciiCurrent) {
                        first[firstIndex][0] = array[i][0];
                        first[firstIndex][1] = array[i][1];
                        firstIndex++;
                        isIdentical = false;
                        break;
                    }
                    else if (asciiKey < asciiCurrent) {
                        second[secondIndex][0] = array[i][0];
                        second[secondIndex][1] = array[i][1];
                        secondIndex++;
                        isIdentical = false;
                        break;
                    }
                }
                if (isIdentical) {
                    first[firstIndex][0] = array[i][0];
                    first[firstIndex][1] = array[i][1];
                    firstIndex++;
                }
            }
        }
        first = sortTwoDimentionalArray(first); // Recursively sort sub-arrays
        second = sortTwoDimentionalArray(second);
        for (int i = 0; i < firstLength; i++) { // Combine the two sorted arrays and key value
            array[i][0] = first[i][0];
            array[i][1] = first[i][1];
        }
        array[firstLength][0] = keyValue;
        array[firstLength][1] = keyNumber;
        for (int i = 0; i < secondLength; i++) {
            array[firstLength + 1 + i][0] = second[i][0];
            array[firstLength + 1 + i][1] = second[i][1];
        }
        return array;
    }
    
    public static double [][] sortTwoDimentionalArray(double [][] array) { // Sorts doubles
        if (array.length < 2) {
            return array;
        }
        double [][] first; // Uses same methods as last 2d sort, comparing by double instead of string and not having to iterate through a string
        double [][] second;
        int firstLength = 0;
        int secondLength = 0;
        int keyIndex = array.length/2;
        double keyValue = array[keyIndex][0];
        double keyNumber = array[keyIndex][1];
        for (int i = 0; i < array.length; i++) {
            if (keyIndex == i) {
                continue;
            }
            if (array[i][0] <= keyValue) {
                firstLength++;
            }
            else {
                secondLength++;
            }
        }
        first = new double[firstLength][2];
        second = new double[secondLength][2];
        int firstIndex = 0;
        int secondIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (keyIndex == i) {
                continue;
            }
            if (array[i][0] <= keyValue) {
                first[firstIndex][0] = array[i][0];
                first[firstIndex][1] = array[i][1];
                firstIndex++;
            }
            else {
                second[secondIndex][0] = array[i][0];
                second[secondIndex][1] = array[i][1];
                secondIndex++;
            }
        }
        first = sortTwoDimentionalArray(first);
        second = sortTwoDimentionalArray(second);
        for (int i = 0; i < firstLength; i++) {
            array[i][0] = first[i][0];
            array[i][1] = first[i][1];
        }
        array[firstLength][0] = keyValue;
        array[firstLength][1] = keyNumber;
        for (int i = 0; i < secondLength; i++) {
            array[firstLength + 1 + i][0] = second[i][0];
            array[firstLength + 1 + i][1] = second[i][1];
        }
        return array;
    }
    
    public static String [][] reverseTwoDimentionalArray(String [][] array) { // Reverses a 2d array of strings
        String [][] toReturn = new String[array.length][2];
        for (int i = 0; i < array.length; i++) {
            toReturn[array.length - 1 - i][0] = array[i][0]; // Iterate through one array forwards to get items, and backwards to add items
            toReturn[array.length - 1 - i][1] = array[i][1];
        }
        return toReturn;
    }
    
    public static double [][] reverseTwoDimentionalArray(double [][] array) { // Same as last method, using a 2d array of doubles
        double [][] toReturn = new double[array.length][2];
        for (int i = 0; i < array.length; i++) {
            toReturn[array.length - 1 - i][0] = array[i][0];
            toReturn[array.length - 1 - i][1] = array[i][1];
        }
        return toReturn;
    }
}