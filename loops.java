import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        // for loops

        // for(int i = 1; i<=5; i++) {
        // System.out.println(i);
        // }

        // for(int i = 1; i<=4; i++) {
        // System.out.println("Love babbar");
        // }

        // for(int i = 1; i<=10; i= i+2) {
        // System.out.println(i);
        // }

        // (nested loops)
        // for (int i = 1; i <= 3; i++) {
        // for (int j = 1; j <= 3; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // for (int i = 1; i <= 4; i++) { // outer loop
        // for (int j = 1; j <= 4; j++) { // inner loop
        // System.out.println("i = " + i + ", j = " + j);
        // }
        // System.out.println();
        // }

        // (Break and Contnue Keyword)
        // for(int i=1; i<=5; i++) {
        // if(i==3) {
        // break; // exit the loop when i is 3
        // }
        // System.out.println(i);
        // }

        // continue keyword
        // for(int i=1; i<=10; i++) {
        // if(i==5) {
        // continue; // skip the rest of the loop when i is 5
        // }
        // System.out.println(i);
        // }

        // (while loop)
        // initialization
        // while(condition) {
        // // code to be executed
        // // update statement
        // }

        // int i = 1; // initialization
        // while(i <=5) { // condition
        // System.out.println(i);
        // i++; // update statement
        // }

        // int j = 1;
        // while(j <= 4) {
        // System.out.println("Love Babbar");
        // j++;
        // }

        // int i=1;
        // while (i <= 2) {
        // int j = 1;

        // while (j <= 3) {
        // System.out.println("i = " + i + ", j = " + j);
        // j++;
        // }
        // i++;
        // }

        // (do-while loop)
        // initialization
        // do {
        // // code to be executed
        // // update statement
        // } while(condition);

        // int i = 1; // initialization
        // do {
        // System.out.println(i);
        // i++; // update statement;

        // } while (i <= 5); // condition

        // Homework
        // question 1: Print counting from 1 to n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        scanner.close();
    }
}