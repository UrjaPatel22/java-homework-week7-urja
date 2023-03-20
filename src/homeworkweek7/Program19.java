package homeworkweek7;
/*
19.Write a Java program to calculate the average value of array elements.
 */
public class Program19 {
    public static void main(String[] args) {


        int[] numbers = new int[]{20, 30, 50, 60, 70};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++)
            sum = sum + numbers[i];
        double average = sum / numbers.length;
        System.out.println("Average value of array element is: " +average);
    }

}
