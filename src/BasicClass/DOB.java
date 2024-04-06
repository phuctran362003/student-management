/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BasicClass;

import Validation.MyValidation;


/**
 *
 * @author phuctrann <phuctgse172360@fpt.edu.vn>
 */
public class DOB {
    
    int day;
    int month;
    int year;

    public DOB() {
        day = month = year = 1;
    }

    public DOB(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public DOB(String date) throws Exception {
        if (!MyValidation.isValidDate(date, "dd/MM/yyyy")) 
            throw new Exception("Invalid Date of Birth!");
        else {
            String[] arr = date.split("/");
            if (arr.length != 3)
                throw new Exception("Invalid Date of Birth!");
            else if ((Integer.parseInt(arr[2]) == 2020 && Integer.parseInt(arr[1]) >= 10) || Integer.parseInt(arr[2]) > 2020)
                throw new Exception("Invalid Date of Birth!");
            else {
                this.day = Integer.parseInt(arr[0]);
                this.month = Integer.parseInt(arr[1]);
                this.year = Integer.parseInt(arr[2]);
            }
        }
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return day + "/" + month + "/" + year;
    }
    
    
    

}
