import java.util.Scanner;
public class conditionals {
    public static void main(String[] args) {

        // if Condition
        // int dailyPractice = 12;

        // if(dailyPractice >= 10) {
        // System.out.println("Good Consistency!");
        // }

        // if-else condition
        // int score = 42;
        // if(score >= 50) {
        // System.out.println("Pass");
        // }
        // else {
        // System.out.println("Fail");
        // }

        // else - if condition
        // int accuracy = 78;
        // if(accuracy >= 98) {
        // System.out.println("Excellent");
        // }
        // else if (accuracy >= 75) {
        // System.out.println("Good");
        // }
        // else if (accuracy >= 50) {
        // System.out.println("Average");
        // }
        // else {
        // System.out.println("Poor - Needs Improvement");
        // }


        // int day = 5;
        // if (day == 1) {
        //     System.out.println("Monday");
        // } else if (day == 2) {
        //     System.out.println("Tuesday");
        // } else if (day == 3) {
        //     System.out.println("Wednesday");
        // } else if (day == 4) {
        //     System.out.println("Thursday");
        // } else if (day == 5) {
        //     System.out.println("Friday");
        // } else if (day == 6) {
        //     System.out.println("Saturday");
        // } else if (day == 7) {
        //     System.out.println("Sunday");
        // } else {
        //     System.out.println("Invalid Day");
        // }

        // int streakDays = 15;
        // String message = (streakDays >= 10) ? "Great Job!" : "Keep Practicing!";
        // System.out.println(message);

        // int month = 4;
        // switch (month) {
        //     case 1:
        //         System.out.println("January");
        //         break;
        //     case 2:
        //         System.out.println("February");
        //         break;
        //     case 3:
        //         System.out.println("March");
        //         break;
        //     case 4:
        //         System.out.println("April");
        //         break;
        //     default:
        //         System.out.println("Invalid Month");
        // }

        System.out.println("Enter the number of days you have practiced: ");
        try (Scanner scanner = new Scanner(System.in)) {
            int day = scanner.nextInt();

            if(day >= 300) {
                System.out.println("Advanced Level");
            } else if(day >= 150) {
                System.out.println("Intermediate Level");
            } else if(day >= 1) {
                System.out.println("Beginner Level");
            } else {
                System.out.println("Invalid Input");
            }
        }
    }
}