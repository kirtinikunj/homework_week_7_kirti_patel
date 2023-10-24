package homework;

/**
 * 19. Write a Java program to calculate the average value of array elements.
 */
public class Programme_19 {

    public static void main(String[] args) {
        averageMethod();
    }

    public static void averageMethod(){
        int array [] = new int[]{20,30,35,25,16,60};

        int sum = 0;
        for (int a=0; a< array.length; a++)
            sum = sum + array[a];

        double average = sum/array.length;
        System.out.println("Average value of array is : "+average);
    }
}
