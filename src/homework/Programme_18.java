package homework;

/**
 * 18. Write a Java program to sum values of an array.
 */
public class Programme_18 {

    public static void main(String[] args) {
        sumMethod();
    }
    public static void sumMethod(){
        int array[] = {23,12,78,34,87,43,33};
                int sum = 0;

        for (int a : array)
            sum += a;
        System.out.println("The sum is : "+sum);
    }
}
