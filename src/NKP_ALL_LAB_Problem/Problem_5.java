package NKP_ALL_LAB_Problem;

import java.util.Scanner;

public class Problem_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number (1-7) to get the day of the week: ");
        int day=sc.nextInt();
        String dayName;
        switch (day)
        {
            case 1:
                dayName="Monday";
                break;

            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day! Please enter a number between 1 and 7.";
                break;
        }
        System.out.println("The day is "+ dayName);
    }
}
