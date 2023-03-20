package homeworkweek7;

import java.util.Scanner;

/*
16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO”
 */
public class Program16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number");
        int number = sc.nextInt();
        if(number > 0){
            System.out.println("Number is Positive");
        } else if (number<0) {
            System.out.println("Number is Negative");
        }
        else{
            System.out.println("Number is equal to Zero");
        }
        sc.close();
    }
}
