package homeworkweek7;

import java.util.Scanner;

/*
1. Write a java program that tells us that Input number is odd or even?
HINT: use ternary operator (? :)
 */
public class Program1 {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number");
        int number = sc.nextInt();
        if(number%2==0){
            System.out.println("Number is an Even Number");
        }
        else{
            System.out.println("Number is an Odd Number");
        }
        sc.close();
    }
}
