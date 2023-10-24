package homework;

import java.util.Scanner;

/**
 * 12. Write a program that tells us input value is number or an alphabet or symbol.
 */
public class Programme_12 {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter number or alphabet or symbol");
        char ch = s1.next().charAt(0);
        myMethod(ch);
        s1.close();
    }

    public static void myMethod(char c){
        if((c>='a' && c<='z') || (c>='A' && c<='Z')){
            System.out.println("it is a Alphabet : "+c);
        }
        else if(c>='0' && c<='9'){
            System.out.println("it is a Number : "+c);
        }
        else{
            System.out.println("it is a Symbol : "+c);
        }
    }
}
