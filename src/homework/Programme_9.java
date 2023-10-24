package homework;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */
public class Programme_9 {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter aphabet from A to F :");
        String alphabet = s1.nextLine();

        cityMethod(alphabet);
        s1.close();
    }

    public static void cityMethod(String city){
        switch (city){
            case "a":
                System.out.println("Ahmadabad");
                break;
            case "b":
                System.out.println("Bhavnagar");
                break;
            case "c":
                System.out.println("Chandigarh");
                break;
            case "d":
                System.out.println("Dwarka");
                break;
            case "e":
                System.out.println("Edlapadu(Andhra Pradesh");
            case "f":
                System.out.println("Faridabad");
                break;
            default:
                System.out.println("Enter valid alpahabet");
        }
    }
}
