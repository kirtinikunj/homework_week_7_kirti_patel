package homework;

import java.util.Scanner;

/**
 * 10.Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */
public class Programme_10 {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter 1st number ");
        int num1 = s1.nextInt();
        System.out.println("Enter 2nd number ");
        int num2 = s1.nextInt();
        System.out.println("Enter symbol ex: +,-,/,*");
        char opretor = s1.next().charAt(0);

        myMethod(num1,num2,opretor);
        s1.close();
    }

    public static void myMethod(int number1,int number2,double op){
        double result;
        if(op == '+'){
            System.out.println(result = number1+number2);
        }
        else if(op =='-'){
            System.out.println(result = number1 - number2);
        }
        else if (op == '*'){
            System.out.println(result=number1*number2);
        }
        else if(op == '/'){
            System.out.println(result=number1/(float)number2);
        }
        else{
            System.out.println("Enter valid opretor");
        }
    }
}
