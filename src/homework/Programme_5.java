package homework;

import java.util.Scanner;

/**
 * 5. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
 * salary
 * HRA = basic salary 10%
 * DA = Basic salary 8%
 * TA = Basic salary 9%
 * PF= Basic salary 20%
 * Gross salary = basic salary + HRA + TA + DA –PF
 */
public class Programme_5 {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter your employee ID :");
        int id = s1.nextInt();
        s1.nextLine();
        System.out.println("Enter your Name : ");
        String name = s1.nextLine();
        System.out.println("Enter your basic Salary :");
        double salary = s1.nextInt();

        calculationMethod(id,name,salary);

        s1.close();
    }

    public static void calculationMethod(int id1,String name1,double sal){
        double hra = sal*10/(float)100;
        double da =  sal*8/(float)100;
        double ta =  sal*9/(float)100;
        double pf =  sal*20/(float)100;
        double gsalary = sal+hra+da+ta+pf;

        System.out.println(" ______________________________");
        System.out.println("|          Salary Slip         |");
        System.out.println("|______________________________|");
        System.out.println("| Employee ID    :  "+id1+"        |");
        System.out.println("| Employee Name  :  "+name1+"           |");
        System.out.println("|______________________________|");
        System.out.println("| Basic Salary   :  "+sal+"    |");
        System.out.println("| HRA 10%        :  "+hra+"     |");
        System.out.println("| DA 8%          :  "+da+"     |");
        System.out.println("| TA 9%          :  "+ta+"     |");
        System.out.println("| PF 20%         :  "+pf+"      |");
        System.out.println("|______________________________|");
        System.out.println("| Gross Salary   :  "+gsalary+"    |");
        System.out.println("===================================|");
    }
}
