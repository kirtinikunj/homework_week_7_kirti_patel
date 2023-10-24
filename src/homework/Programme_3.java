package homework;

import java.util.Scanner;

/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 */
public class Programme_3 {
    //main method
    public static void main(String[] args) {
        //creating scanner
        Scanner s1 = new Scanner(System.in);

        //Getting inputs from user
        System.out.println("Enter Student Name :");
        String name = s1.nextLine();
        System.out.println("Enter Roll No. :");
        int roll = s1.nextInt();
        System.out.println("Enter Maths Marks :");
        int maths = s1.nextInt();
        System.out.println("Enter Science Marks :");
        int science = s1.nextInt();
        System.out.println("Enter English Marks :");
        int english = s1.nextInt();

        //calling method
        markSheet(name, roll, maths, science, english);

        //closing scanner
        s1.close();
    }

    //declaring static method
    public static void markSheet(String name1, int rollno, int m, int s, int e) {
        int total = m + s + e;
        double percentage = total / (float) 300 * 100;
        String result1 = null;
        String grade = null;

        if (m < 0 || m > 100 || s < 0 || s > 100 || e < 0 || e > 100) {
            System.out.println("Invalid Input ");
        }
        else if (m < 35 || s < 35 || e < 35) {
            System.out.println(result1 = "fail");
            System.out.println(percentage);
        }
        else if (percentage >= 80) {
            System.out.println(percentage);
            System.out.println(result1 = "Pass");
            System.out.println(grade = "A+");
        }
        else if (percentage >= 60 && percentage < 80) {
            System.out.println(percentage);
            System.out.println(result1 = "Pass");
            System.out.println(grade = "A");
        }
        else if (percentage >= 50 && percentage < 60) {
            System.out.println(percentage);
            System.out.println(result1 = "Pass");
            System.out.println(grade = "B");
        }
        else if (percentage >= 35 && percentage < 50) {
            System.out.println(percentage);
            System.out.println(result1 = "Pass");
            System.out.println(grade = "c");
        }
        else {
            System.out.println(result1 = "fail");
        }

        System.out.println(" ________________________________");
        System.out.println("|                                |");
        System.out.println("|          Mark Sheet            |");
        System.out.println("|________________________________|");
        System.out.println("|   Name         :   " + name1 + "        |");
        System.out.println("|   Roll No      :   " + rollno + "            |");
        System.out.println("|________________________________|");
        System.out.println("|   Subject      :    Marks      |");
        System.out.println("|________________________________|");
        System.out.println("|   Maths        :   " + m + "          |");
        System.out.println("|   Science      :   " + s + "          |");
        System.out.println("|   English      :   " + e + "          |");
        System.out.println("|________________________________|");
        System.out.println("|   Total        :   " + total + "         |");
        System.out.println("|________________________________| ");
        System.out.println("|   Percentage   :   " + percentage + "        |");
        System.out.println("|   Result       :    "+result1+"       |");
        System.out.println("|   Grade        :    "+grade+"         |");
        System.out.println("|________________________________|");
    }
}
