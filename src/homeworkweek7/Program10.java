package homeworkweek7;

import java.util.Scanner;

/*
10.Write a java program to input any two number and ask user to enter their symbol (+, -, /, *) find addition, Subtraction, multiplication and division according to their symbol (using if else)
 */
public class Program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int first = sc.nextInt();
        System.out.println("Enter Second number:");
        int second = sc.nextInt();
        System.out.println("Enter Any Symbol +,- *,/");
        char ch = sc.next().charAt(0);

        int add, subtract, multiply;
        float divide;
        add = first + second;
        subtract = first - second;
        multiply = first * second;
        divide = first / second;
        if (ch == '+') {
            System.out.println("Addition : " + add);
        } else if (ch == '-') {
            System.out.println("Substraction : " + subtract);
        } else if (ch == '*') {
            System.out.println("Multiplication : " + multiply);
        } else if (ch == '/') {
            System.out.println("Division : " + divide);
        } else {
            System.out.println("Invalid Value");
        }
        sc.close();

    }
}