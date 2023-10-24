package homework;

/**
 * 20. Write a Java program to test if an array contains a specific value.
 */
public class Programme_20 {
    public static void main(String[] args) {
        int arrays [] = {9876,2013,5456,7890,1234,2015};
        System.out.println(myMethod(arrays,2013));
    }

    public static boolean myMethod(int arr[],int item){

        for (int n : arr){
            if(item == n){
                return true;
            }
        }
        return false;
    }
}
