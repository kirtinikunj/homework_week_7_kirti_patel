package homework;

import java.util.Arrays;

/**
 * 17. Write a Java program to sort a numeric array and a string array.
 */
public class Programme_17 {

    public static void main(String[] args) {
        sortMethod();
    }

    public static void sortMethod(){
        int array[] = {12,65,02,56,87,77,67};
        String arraystring[] = {"Java","Python","PHP","C#","C Programming","C++"};
        System.out.println("Original numeric array : "+ Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("sorted numeric array : "+Arrays.toString(array));
        System.out.println("Orignal string array : "+Arrays.toString(arraystring));
        Arrays.sort(arraystring);
        System.out.println("Sorted string array : "+Arrays.toString(arraystring));
    }
}
