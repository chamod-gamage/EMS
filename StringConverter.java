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

public final class StringConverter {
    
    private StringConverter(){}
    
    public static String empNumberToString (int num) {
        int zeroes;
        zeroes = 6 - Integer.toString(num).length();
        String output = Integer.toString(num);
        String sixZero = "000000";
        
        char[] actualArray = sixZero.toCharArray();
        
        for (int x = zeroes; x < 6; x++) {
            int pos = x - zeroes;
            actualArray[x] = output.charAt(pos);
      
                 
        }
        String toReturn = new String(actualArray);
        return toReturn;   
    }
    
    public static boolean stringChecker (String name){
        if (name.length() == 0){
            return false;
        }
        for (int x = 0; x < name.length(); x++) {
            int ascii = name.charAt(x);
            if (((ascii < 32) || (ascii > 32 && ascii < 65) || (ascii > 90 && ascii < 97) || (ascii > 122)) && ascii != 46) {
                return false;
            }
        }
        return true;
    }
    
    public static String stripTrailingSpaces (String name) {
        return name.trim();
    }
    
    public static List<Character> stringToChars (String text) {
        List<Character> chars = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            chars.add(text.charAt(i));
	}
        return chars;
    }
    
    public static int stringToInteger(String employeeNumber) {
        if (employeeNumber.length() == 0){
            return -1;
        }
        for (int x = 0; x < employeeNumber.length(); x++) {
            int ascii = employeeNumber.charAt(x);
            if (ascii < 48 || ascii > 57) {
                return -1;
            }
        }
        int num = Integer.parseInt(employeeNumber);
        return num;
    }
    
    public static double stringToDouble (String doub) {
        if (doub.length() == 0){
            return -1;
        }
        int perCounter = 0;
        
        for (int x = 0; x < doub.length(); x++) {
            int ascii = doub.charAt(x);
            if ((ascii < 48 || ascii > 57) && ascii != 46) {
                
                return -1;
            }
            if (ascii == 46){
                perCounter++;
            }
        }
        if (perCounter > 1){
            return -1;
        }
        double num = Double.parseDouble(doub);
        return num;
    }
    
    public static double stringToDollars (String doub) {
        if (doub.length() == 0){
            return -1;
        }
        int perCounter = 0;
        boolean hasSign = false;
        for (int x = 0; x < doub.length(); x++) {
            int ascii = doub.charAt(x);
            if ((ascii < 48 || ascii > 57) && ascii != 46) {
                if (ascii == 36 && x == 0){
                    hasSign = true;
                    continue;
                }
                return -1;
            }
            if (ascii == 46){
                perCounter++;
            }
        }
        if (perCounter > 1){
            return -1;
        }
        if (hasSign){
            String doubTwo = doub.substring(1);
            double num = Double.parseDouble(doubTwo);
            return num;
        }
        double num = Double.parseDouble(doub);
        return num;
    }
    
    public static double stringToPercent (String doub) {
        if (doub.length() == 0){
            return -1;
        }
        int perCounter = 0;
        boolean hasSign = false;
        for (int x = 0; x < doub.length(); x++) {
            int ascii = doub.charAt(x);
            if ((ascii < 48 || ascii > 57) && ascii != 46) {
                if (ascii == 37 && x == doub.length() - 1){
                    hasSign = true;
                    continue;
                }
                return -1;
            }
            if (ascii == 46){
                perCounter++;
            }
        }
        if (perCounter > 1){
            return -1;
        }
        if (hasSign){
            String doubTwo = doub.substring(0, doub.length() - 1);
            double num = Double.parseDouble(doubTwo);
            return num/100;
        }
        double num = Double.parseDouble(doub);
        return num;
    } 
    
    public static String[][] sortTwoDimentionalArray(String[][] array) {
        if (array.length < 2) {
            return array;
        }
        boolean isIdentical;
        String [][] first;
        String [][] second;
        int firstLength = 0;
        int secondLength = 0;
        int keyIndex = array.length/2;
        String keyValue = array[keyIndex][0];
        String keyNumber = array[keyIndex][1];
        for (int i = 0; i < array.length; i++){
            isIdentical = true;
            if (i == keyIndex) {
                continue;
            }
            if (keyValue.length() < array[i][0].length()) {
                for (int x = 0; x < keyValue.length(); x++) {
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
            else {
                for (int x = 0; x < array[i][0].length(); x++) {
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
        first = new String[firstLength][2];
        second = new String[secondLength][2];
        int firstIndex = 0;
        int secondIndex = 0;
        for (int i = 0; i < array.length; i++){
            isIdentical = true;
            if (i == keyIndex) {
                continue;
            }
            if (keyValue.length() < array[i][0].length()) {
                for (int x = 0; x < keyValue.length(); x++) {
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
    
    public static double [][] sortTwoDimentionalArray(double [][] array) {
        if (array.length < 2) {
            return array;
        }
        double [][] first;
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
    
    public static String [][] reverseTwoDimentionalArray(String [][] array) {
        String [][] toReturn = new String[array.length][2];
        for (int i = 0; i < array.length; i++) {
            toReturn[array.length - 1 - i][0] = array[i][0];
            toReturn[array.length - 1 - i][1] = array[i][1];
        }
        return toReturn;
    }
    
    public static double [][] reverseTwoDimentionalArray(double [][] array) {
        double [][] toReturn = new double[array.length][2];
        for (int i = 0; i < array.length; i++) {
            toReturn[array.length - 1 - i][0] = array[i][0];
            toReturn[array.length - 1 - i][1] = array[i][1];
        }
        return toReturn;
    }
}