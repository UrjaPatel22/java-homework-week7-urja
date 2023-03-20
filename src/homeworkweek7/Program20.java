package homeworkweek7;
/*
20. Write a Java program to test if an array contains a specific value.
 */



public class Program20 {

    public static void main(String[] args) {
        int myArray [] = {10,20,30,40,50};

        arraySpecific(myArray,80);
        System.out.println("Specific item is  :" +arraySpecific(myArray, 80));
    }

    public static boolean arraySpecific(int a[], int b){
        for (int i : a){

            if (b == i){
                return true;
            }
        }
        return  false;
    }
}
