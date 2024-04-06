/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;


/**
 *
 * @author phuctrann <phuctgse172360@fpt.edu.vn>
 */
public class MyValidation {
    
    ////////////////// STRING

    /**
     * Check if string s matches the given pattern
     * @param s String to check
     * @param pattern pattern to compare
     * @return true if s matches the given pattern
     */
    public static boolean checkString(String s, String pattern)
    {
        return s.matches(pattern);
    }

    /**
     * Check if string s and string x are the same
     * @param s String number 1
     * @param x String number 2
     * @return true if s and x is equal
     */
    public static boolean checkEqualString(String s, String x)
    {
        return s.equals(x);
    }
    
    /**
     * Check if a string is empty
     * @param s string to check
     * @return true if s is an empty string
     */
    public static boolean isEmptyString(String s)
    {
        return s.trim().isEmpty();
    }
    
    /**
     * Enter a string and check if a string matches a pattern
     * @param pattern Pattern to match
     * @return Matched String or Exception if not match pattern
     * @throws java.lang.Exception
     */
    public static String inputString(String pattern) throws Exception
    {
        String text = "";
        Scanner sc = new Scanner(System.in);
        text = sc.nextLine();
        if (!text.matches(pattern))
            throw new Exception("Text is invalid");
        return text;
    }
    
    /**
     * Enter a string and check if it is empty or not
     * @return string that is not empty
     * @throws Exception
     */
    public static String inputString() throws Exception
    {
        String text = "";
        Scanner sc = new Scanner(System.in);
        text = sc.nextLine();
        if (isEmptyString(text))
            throw new Exception("Empty String!");
        return text;
    }
    
    /**
     * Check if a string is "m" (male) or "f" (female)
     * @param gender
     * @return true if it matches
     */
    public static boolean isGender(String gender)
    {
        return gender.toLowerCase().matches("m|f|male|female");
    }
    
    /**
     * Check if a string is a valid email
     * @param email
     * @return true if it is a valid email
     */
    public static boolean isEmail(String email)
    {
        String pattern = "^[a-zA-Z]([a-zA-Z0-9_.-])+{4,31}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$";
        return checkString(email, pattern);
    }
    
    public static boolean isPhone(String phone)
    {
        return checkString(phone, "^0(([0-9]){9,11})");
    }
    
    ////////////////// NUMBER
    
    // Integer
    /**
     * Check if an integer number is in the domain of [min, max]
     * @param num number to check
     * @param min minimum value
     * @param max maximum value
     * @return true if num is in [min, max]
     */

    public static boolean checkIntNumber(int num, int min, int max)
    {
        return num >= min && num <= max;
    }
    
    /**
     * Check if an integer number is smaller or equal to a maximum value
     * @param num number to check
     * @param max maximum value to compare
     * @return true if num is smaller or equal to max
     */
    public static boolean checkIntNumMax(int num, int max)
    {
        return num <= max;
    }
    
    /**
     * Check if an integer number is equal or bigger to a minimum value
     * @param num number to check
     * @param min minimum value to compare
     * @return true if num is equal or bigger than min
     */
    public static boolean checkIntNumMin(int num, int min)
    {
        return num >= min;
    }

    /**
     * Check if a date is valid or not
     * @param year the year
     * @param month the month
     * @param day the day
     * @return true if the given date is valid
     */
    public static boolean isValidDate(int year, int month, int day)
    {
        return isValidDate(day + "/" + month + "/" + year, "dd/MM/yyyy") && (year < 2020 || (year == 2020 && month <= 9 && day <= 30)) ;
    }
    
    public static boolean isValidDate(String date, String format) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        dateFormat.setLenient(false);
        try {
            dateFormat.parse(date.trim());
        } catch (ParseException pe) {
            return false;
        }
        return true;
    }
    
    /**
     * Enter an integer number
     * @param min minium value of the number
     * @param max maximum value of the number
     * @return Inputted number or error if the number is out of domain
     * @throws java.lang.Exception
     */
    public static int inputIntNumber(int min, int max) throws Exception
    {
        int result = min;
        Scanner sc = new Scanner(System.in);
        result = sc.nextInt();
        if (result < min || result > max)
            throw new Exception("Domain is invalid");
        return result;
    }
    
    /**
     * Enter an integer number
     * @param min minium value of the number
     * @return Inputted number or error if the number is out of domain
     * @throws java.lang.Exception
     */
    public static int inputIntNumberMin(int min) throws Exception
    {
        int result = min;
        Scanner sc = new Scanner(System.in);
        result = sc.nextInt();
        if (result < min)
            throw new Exception("Domain is invalid");
        return result;
    }
    
    /**
     * Enter an integer number
     * @param max maxium value of the number
     * @return Inputted number or error if the number is out of domain
     * @throws java.lang.Exception
     */
    public static int inputIntNumberMax(int max) throws Exception
    {
        int result = max;
        Scanner sc = new Scanner(System.in);
        result = sc.nextInt();
        if (result < max)
            throw new Exception("Domain is invalid");
        return result;
    }
    
    // Float
    /**
     * Check if a floating real number is in the domain of [min, max]
     * @param num number to check
     * @param min minimum value
     * @param max maximum value
     * @return true if num is in [min, max]
     */

    public static boolean checkFloatNumber(double num, double min, double max)
    {
        return num >= min && num <= max;
    }
    
    /**
     * Check if a floating real number is smaller or equal to a maximum value
     * @param num number to check
     * @param max maximum value to compare
     * @return true if num is smaller or equal to max
     */
    public static boolean checkFloatNumMax(double num, double max)
    {
        return num <= max;
    }
    
    /**
     * Check if a floating real number is equal or bigger to a minimum value
     * @param num number to check
     * @param min minimum value to compare
     * @return true if num is equal or bigger than min
     */
    public static boolean checkFloatNumMin(double num, double min)
    {
        return num >= min;
    }
    
    /**
     * Enter a floating real number
     * @param min minium value of the number
     * @param max maximum value of the number
     * @return Inputted number or error if the number is out of domain
     * @throws java.lang.Exception
     */
    public static double inputFloatNumber(double min, double max) throws Exception
    {
        double result = min;
        Scanner sc = new Scanner(System.in);
        result = sc.nextDouble();
        if (result < min || result > max)
            throw new Exception("Domain is invalid");
        return result;
    }
    
    /**
     * Enter a floating real number
     * @param min minium value of the number
     * @return Inputted number or error if the number is out of domain
     * @throws java.lang.Exception
     */
    public static double inputFloatNumberMin(double min) throws Exception
    {
        double result = min;
        Scanner sc = new Scanner(System.in);
        result = sc.nextDouble();
        if (result < min)
            throw new Exception("Domain is invalid");
        return result;
    }
    
    /**
     * Enter a floating real number
     * @param max maxium value of the number
     * @return Inputted number or error if the number is out of domain
     * @throws java.lang.Exception
     */
    public static double inputFloatNumberMax(double max) throws Exception
    {
        double result = max;
        Scanner sc = new Scanner(System.in);
        result = sc.nextFloat();
        if (result < max)
            throw new Exception("Domain is invalid");
        return result;
    }
    
    public static void getEnter() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Press Enter to continue...");
        do {
            if (isEmptyString(sc.nextLine()))
                return;
        } while (true);
    }
    
    public static void getEnter(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        do {
            if (isEmptyString(sc.nextLine()))
                return;
        } while (true);
    }
    
    public static boolean isName(String name) {
        return checkString(name, "([a-zA-z ]){1,40}");
    }
    
    public static String convertGender(String gender) {
        if (isGender(gender)) {
            if (gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("m"))
                return "m";
            else if (gender.equalsIgnoreCase("female") || gender.equalsIgnoreCase("f"))
                return "f";
        }
        return "";
    }
    
    public static int isContinue() {
        Scanner sc = new Scanner(System.in);
        boolean cont = true;
        int result = -1;
        do {
            System.out.print("Do you want to continue (y/n)? ");
            String answer = sc.nextLine();
            if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")) {
                result = 1;
                cont = false;
            }
            else if (answer.equalsIgnoreCase("n") || answer.equalsIgnoreCase("no")) {
                result = 0;
                cont = false;
            }
            else {
                cont = true;
            }
        } while (cont);
        return result;
    }
    
    public static int isContinue(String message) {
        Scanner sc = new Scanner(System.in);
        boolean cont = true;
        int result = -1;
        do {
            System.out.print(message);
            String answer = sc.nextLine();
            if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")) {
                result = 1;
                cont = false;
            }
            else if (answer.equalsIgnoreCase("n") || answer.equalsIgnoreCase("no")) {
                result = 0;
                cont = false;
            }
            else {
                cont = true;
            }
        } while (cont);
        return result;
    }
    
   

}
