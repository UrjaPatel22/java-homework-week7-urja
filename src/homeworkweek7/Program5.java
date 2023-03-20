package homeworkweek7;
/*
5. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
HRA = basic salary 10% DA = Basic salary 8% TA = Basic salary 9% PF= Basic salary 20% Gross salary = basic salary + HRA + TA + DA –PF Print in following format
 */
import java.util.Scanner;

public class Program5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Id: ");
        int empId = sc.nextInt();
        System.out.println("Enter Employee Name: ");
        String empName = sc.next();
        System.out.println("Enter basic Salary: ");
        int basicSalary = sc.nextInt();
        double hra= 0.1*basicSalary;
        double da= 0.08*basicSalary;
        double ta= 0.09*basicSalary;
        double pf=0.2*basicSalary;
        double grossSalary = basicSalary+hra+ta+da-pf;

        System.out.println("|--------------------------------------|");
        System.out.println("|                                      |");
        System.out.println("|          Salary Slip                 |");
        System.out.println("|                                      |");
        System.out.println("|--------------------------------------|");
        System.out.println("|Employee Id" +    ":" + empId +"                        |");
        System.out.println("|Employee Name" + ":" + empName  +"                      |");
        System.out.println("|--------------------------------------|");
        System.out.println("| Basic Salary" + ":" +  basicSalary  +"                     |");
        System.out.println("|HRA 10%" + ":"   + hra +  "                                |");
        System.out.println("|TA 8%" + ":"   + ta +  "                                   |");
        System.out.println("|DA 9%" + ":"   + da +  "                                   |");
        System.out.println("|PF -20&" + ":5" + pf + "                                    |");
        System.out.println("|--------------------------------------|");
        System.out.println("|Gross Salary" + ":" + grossSalary+"            |");
sc.close();
    }
}
