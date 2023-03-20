package homeworkweek7;

public class Program4 {


    public static void main(String[] args) {

        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));

        System.out.println(getDaysInMonth(1, 2000));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));

    }

    public static boolean isLeapYear(int year) {

        if (year >= 1 && year <= 9999) {

            if (year % 4 == 0) {
                System.out.println("Specified year is a leap year");
                return true;
            } else if ((year % 100 != 0)) {
                System.out.println("Specified year is not Leap year");
                return false;
            } else if ((year % 400 == 0)) {
                System.out.println("Specified year is a leap year");
                return true;
            } }
        else {
                System.out.println("Specified year is not a leap year");
                return false;
            }
            return false;
        }



    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            int result = -1;
            return result;
        }
        String nameOfMonth;
        int numberOfDays = 0;
        switch (month) {
            case 1:
                nameOfMonth = "January";
                numberOfDays = 31;
                break;
            case 2:
                nameOfMonth = "February";
                if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
                    numberOfDays = 29;
                } else {
                    numberOfDays = 28;
                }
                break;
            case 3:
                nameOfMonth = "March";
                numberOfDays = 31;
                break;
            case 4:
                nameOfMonth = "April";
                numberOfDays = 30;
                break;
            case 5:
                nameOfMonth = "May";
                numberOfDays = 31;
                break;
            case 6:
                nameOfMonth = "June";
                numberOfDays = 30;
                break;
            case 7:
                nameOfMonth = "July";
                numberOfDays = 31;
                break;
            case 8:
                nameOfMonth = "August";
                numberOfDays = 31;
                break;
            case 9:
                nameOfMonth = "September";
                numberOfDays = 30;
                break;
            case 10:
                nameOfMonth = "October";
                numberOfDays = 31;
                break;
            case 11:
                nameOfMonth = "November";
                numberOfDays = 30;
                break;
            case 12:
                nameOfMonth = "December";
                numberOfDays = 31;
                break;
            default:
                nameOfMonth = "Invalid month";
                break;

        }
        return numberOfDays;
    }


}


