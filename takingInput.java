import java.util.Scanner;

public class takingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter the value for firstNum: ");
//        int firstNum = sc.nextInt();
//        System.out.println("Enter the value for secondNum: ");
//        int secondNum = sc.nextInt();
//        int answer = firstNum + secondNum;
//        System.out.println("Final value: " + answer);
//
//        System.out.println("Enter the value of Biginteger: ");
//        BigInteger bg = sc.nextBigInteger();
//        System.out.println("BigInteger: " + bg);
//
//        System.out.println("Enter the value of short: ");
//        short shortVal = sc.nextShort();
//        System.out.println("short: " + shortVal);
//
//        System.out.println("Enter the value of float: ");
//        float fl = sc.nextFloat();
//        System.out.println("float number: " + fl);
//
//        System.out.println("Enter the value of Boolean: ");
//        boolean bl = sc.nextBoolean();
//        System.out.println("Boolean Value: " + bl);

        String userName = "Riya";
        int contestCount = 12;
        System.out.println("Hello " + userName);
        System.out.println("Contests attempted: " + contestCount);

        sc.close();
    }
    
}
