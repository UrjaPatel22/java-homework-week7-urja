package homeworkweek7;

/*
6. Write a java program to input any number and find out if it’s odd or even
 */
import java.util.Scanner;

public class Program6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        if ((n | 1) > n) {

            // Print statement
            System.out.println("Number is Even");
        } else {

            // Print statement
            System.out.println("Number is Odd");
            sc.close();
        }
    }
}