package homework;

import java.util.Scanner;

/**
 *Write a java program input sales id, seller's name, sales amount, and salary basic and
 * then fined this sales
 * Commission
 */
public class Programme_7 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter Sales Id");
        int id = s1.nextInt();
        s1.nextLine();
        System.out.println("Enter Seller's Name ");
        String name = s1.nextLine();
        System.out.println("Enter Sales Amount");
        int amount = s1.nextInt();
        System.out.println("Enter Basic Salary");
        int salary = s1.nextInt();

        commisionMethod(amount,salary);
    }

    public static void commisionMethod(double amt,double comm){
        if(amt >= 50000){
            comm = amt*35/(float)100;
        }
        else if(amt >=30000 && amt <50000){
            comm = amt*20/(float)100;
        }
        else if (amt>=20000 && amt<30000){
            comm = amt*10/(float)100;
        }
        else if(amt>=10000 && amt <20000){
            comm = amt*5/(float)100;
        }
        else if(amt<10000){
            comm = amt*2/(float)100;
        }
        else{
            System.out.println("Not Eligible for commision");
        }

        System.out.println("Your Sales Amount is : "+amt);
        System.out.println("Your Commision is : "+comm);
    }
}
