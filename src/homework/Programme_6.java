package homework;

import java.util.Scanner;

/**
 * Write a java program to input any number and find out if it’s odd or even
 */
public class Programme_6 {
    // main method
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = s1.nextInt();
        //calling method
        oddEvenMethod(num);
        //closing scanner
        s1.close();

    }

    public static void oddEvenMethod(int num1){
        if(num1%2==0){
            System.out.println("Your number is even : "+num1);
        }
        else{
            System.out.println("Your number is odd : "+num1);
        }
    }
}
