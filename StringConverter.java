/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 618062
 */

import java.util.ArrayList;
import java.util.List;
public final class StringConverter {
    
    private StringConverter(){}
    
    public static boolean stringChecker (String name){
        if (name.length() == 0){
            return false;
        }
        for (int x = 0; x < name.length(); x++) {
            int ascii = name.charAt(x);
            if ((ascii < 32) || (ascii > 32 && ascii < 65) || (ascii > 90 && ascii < 97) || (ascii > 122)) {
                return false;
            }
        }
        return true;
    }
    
    public static List<Character> stringToChars (String text) {
        
        List<Character> chars = new ArrayList<>();

        for (int i = 0; i < text.length(); i++) {
            chars.add(text.charAt(i));
	}
        return chars;
    }
    
    public static String stripTrailingSpaces (String name) {
        return name.trim();
    }
    
    public static int stringToInteger(String employeeNumber) {
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
        for (int x = 0; x < doub.length(); x++) {
            int ascii = doub.charAt(x);
            if ((ascii < 48 || ascii > 57) && ascii != 46) {
                return -1;
            }
        }
        double num = Double.parseDouble(doub);
        return num;
    }
}