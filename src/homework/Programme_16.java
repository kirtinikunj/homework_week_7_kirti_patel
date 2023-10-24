package homework;

import java.util.Scanner;

/**
 * 16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */
public class Programme_16 {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter any number");
        double num = s1.nextDouble();

        checkMethod(num);
        s1.close();
    }

    public static void checkMethod(double num1){
        if (num1 <0){
            System.out.println("Your number is Negative : "+num1);
        }
        else if (num1>0){
            System.out.println("your number is Positive : "+num1);
        }
        else{
            System.out.println("Your number is Zero : "+num1);
        }
    }
}
