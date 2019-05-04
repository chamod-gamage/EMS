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
}