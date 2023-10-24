package homework;

/**
 * 11. Write a java program to print the numbers between 1 to 100 which can be divided by 3
 * and 5 separately.
 */
public class Programme_11 {

    public static void main(String[] args) {
        int a;
        for (a =1; a<100; a++){
            if(a%3==0){
                System.out.println("Numbers divided by 3 : "+a);
            }
        }

        for (a=1; a<100; a++){
            if(a%5==0){
                System.out.println("Numbers divided by 5 : ");
            }
        }
    }
}
