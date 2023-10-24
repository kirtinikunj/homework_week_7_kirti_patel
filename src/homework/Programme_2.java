package homework;

import java.util.Scanner;

/**
 * Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not
 */
public class Programme_2 {
    //main method
    public static void main(String[] args) {
        //creating scanner
        Scanner s1 = new Scanner(System.in);
        //getting year from user
        System.out.println("Enter any Year :");
        int year = s1.nextInt();

        //calling method
        myMethod(year);

        //closing scanner
        s1.close();
    }

    //declaring static method
    public static void myMethod(int a) {
        if (a % 4 == 0) {
            System.out.println("Entered year is Leap Year : " + a);
        } else
            System.out.println("Entered year is not Leap Year : " + a);
    }
}
