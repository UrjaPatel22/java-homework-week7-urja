package homeworkweek7;

/*
7. Write a java program input sales id, seller's name, sales amount, and salary basic and then fined this sales
Commission Sales amount >= 50,000 35% Sales amount >= 30,000 20% >= 20,000 10% >= 10,000 5% < 10,000 2%
 */

import java.util.Scanner;

public class Program7 {

    static double commisionRate;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sales Id: ");
        int salId = sc.nextInt();
        System.out.println("Enter Sales Name: ");
        String salName = sc.next();
        System.out.println("Enter basic Sales amount : ");
        double salesAmount = sc.nextDouble();
        System.out.println("Enter Salary basic: ");
        double salaryBasic = sc.nextDouble();

        double commission = salesAmount * commisionRate;
        if (salesAmount >= 50000) {
            System.out.println("Commission Rate is : 0.35");
        } else if (salesAmount >= 30000) {
            System.out.println("Commission Rate is : 0.20");
        } else if (salesAmount >= 20000) {
            System.out.println("Commission Rate is : 0.10");
        } else if (salesAmount >= 10000) {
            System.out.println("Commission Rate is : 0.05");
        } else {
            System.out.println("Commission Rate is : 0.02");
        }

        sc.close();
    }
}
