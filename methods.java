public class methods {

    // method declearation
    static void printTable() {
        for (int i = 1; i <= 10; i++) {
            int ans = 2 * i;
            System.out.println("2 * " + i + "=" + ans);
        }
    }

    // method overloading
    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    // method decleration
    static void printSum(int x, int y) {
        int sum = x + y;
        System.out.println("The value of sum is: " + sum);
    }

    static void main() {
        System.out.println(add(5, 7));
        System.out.println(add(9, 9, 9));
        // System.out.println("Hi!");
        // printTable();
        // System.out.println("Rahul");

        printSum(14, 14);
    }
}
