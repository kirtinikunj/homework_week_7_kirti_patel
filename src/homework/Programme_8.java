package homework;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */
public class Programme_8 {
    //main method
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter any alphabet from A to F to print their city name : ");
        char alphabet = s1.next().charAt(0);
        cityMethod(alphabet);
        s1.close();
    }

    public static void cityMethod(char city1){
        if(city1 == 'a'){
            System.out.println("Ahmadabad");
        }
        else if(city1=='b'){
            System.out.println("Bhavnagar");
        }
        else if(city1 == 'c'){
            System.out.println("Chandigarh");
        }
        else if(city1 == 'd'){
            System.out.println("Dwarka");
        }
        else if(city1 == 'e') {
            System.out.println("Edlapadu(Andhra Pradesh");
        }
        else if(city1 == 'f'){
            System.out.println("Faridabad");
        }
        else{
            System.out.println("Invalid Entry");
        }
    }
}
