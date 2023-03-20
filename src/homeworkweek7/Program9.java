package homeworkweek7;

/*
9.Input any alphabet from “A" to “F” and print their city name accordingly  if any other alphabet should be invalid entry using switch statement
 */
public class Program9 {
    public static void main(String[] args) {
        char cityname = 'B';
        switch (cityname) {
            case 'A':
                System.out.println("Axminster");
                break;

            case 'B':
                System.out.println("Bath");
                break;

            case 'C':
                System.out.println("Coventry");
                break;

            case 'D':
                System.out.println("Derby");
                break;

            case 'E':
                System.out.println("Ely");
                break;

            case 'F':
                System.out.println("Filton");
                break;

            default:
                System.out.println("Invalid Entry");


        }
    }

}
