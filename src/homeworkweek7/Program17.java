package homeworkweek7;

/*
17. Write a Java program to sort a numeric array and a string array.
 */
import java.util.Arrays;

public class Program17 {
    public static void main(String[] args) {
        int [] my_array1 = {2100,2399,1234,5678,9876};
        String [] my_array2 = {"John","Smith","C++","C Programming","PHP"};
        System.out.println("Original Numeric Arrays :" + Arrays.toString(my_array1));
        Arrays.sort(my_array1);
        System.out.println("Sorted Numeric Arrays: " + Arrays.toString(my_array1));

        System.out.println("Original Numeric Arrays :" + Arrays.toString(my_array2));
        Arrays.sort(my_array2);
        System.out.println("Sorted Numeric Arrays: " + Arrays.toString(my_array2));

    }
}
