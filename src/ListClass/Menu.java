/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListClass;
import Validation.MyValidation;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author phuctrann <phuctgse172360@fpt.edu.vn>
 */
public class Menu extends ArrayList<String> {
    public int getUserChoice() {
        Scanner sc = new Scanner(System.in);
        boolean cont = true;
        int choice = 0;
        do {
            System.out.println("----------------------");
            System.out.println("Menu to choose:");
            for (int i = 0; i < this.size(); i++) {
                System.out.println((i+1) + ". " + this.get(i) + ".");
            }
            System.out.print("\tChoose an option: ");
            try {
                sc = new Scanner(System.in);
                choice = sc.nextInt();
                if (choice < 1 || choice > this.size())
                    throw new Exception();
                cont = false;
            } catch (Exception e) {
                System.out.println("Please enter number between 1 and " + this.size() + "!");
                cont = true;
                MyValidation.getEnter("Press Enter to enter again...");
            }
        } while (cont);
        
        return choice;
    }
}