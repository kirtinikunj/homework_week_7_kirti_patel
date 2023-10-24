package homework;

import java.util.Scanner;

/**
 * Write a java program that tells us that Input number is odd or even
 * use ternary operator (? :)
 */
public class Programme_1 {

    //declaring main method
    public static void main(String[] args) {
        //creating scanner for input number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = sc.nextInt();

        //calling method
        oddEvenMethod(num);

        //closing scanner
        sc.close();
    }

    //declaring static method
    public static void oddEvenMethod(int num1) {
        //using ternary operator (? :)
        String num2 = ((num1 % 2 == 0) ? "Even" : "Odd");
        System.out.println("Your Number is " + num2);
    }
}
