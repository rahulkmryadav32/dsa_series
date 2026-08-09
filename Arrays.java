

public class Arrays {
    public static void main(String[] args) {
        // int[] numbers = { 1, 2, 3, 4, 5 };
        // System.out.println("Array elements:");
        // for (int number : numbers) {
        // System.out.println(number);
        // }

        // accessing array elements by index
        // System.out.println("Accessing elements by index:");
        // for (int i = 0; i < numbers.length; i++) {
        // System.out.println("Element at index " + i + ": " + numbers[i]);
        // }

        // taking input from user to create an array
        // java.util.Scanner scanner = new java.util.Scanner(System.in);
        // System.out.println("Enter the size of the array:");
        // int size = scanner.nextInt();
        // int[] userArray = new int[size];
        // System.out.println("Enter " + size + " elements:");
        // for (int i = 0; i < size; i++) {
        // userArray[i] = scanner.nextInt();
        // }
        // System.out.println("User-defined array elements:");
        // for (int element : userArray) {
        // System.out.println(element);
        // }
        // scanner.close();

        // practice
        // int arr[] = { 10, 20, 30, 40, 50 };
        // int n = arr.length;
        // System.out.println("Array elements:");
        // for (int i = 0; i <= n - 1; i++) {
        // System.out.println(arr[i]);
        // }
        // for (int arrays : arr) {
        // System.out.println(arrays);
        // }

        // practice
        // int arr1[] = { 10, 20, 30, 40, 50 };
        // int sum = 0;
        // for (int i = 0; i < arr1.length; i++) {
        // sum += arr1[i];
        // }
        // System.out.println("Sum of elements: " + sum);

        // practice
        // int arr2[] = { 10, 20, 30, 40, 50 };
        // int n = arr2.length;
        // int multiply = 1;
        // for(int i=0; i<=n-1; i++) {
        // multiply *= arr2[i];
        // }
        // System.out.println("Product of elements: " + multiply);

        // practice
        // int arr3[] = { 10, 20, 30, 40, 50 };
        // int n = arr3.length;
        // int max = arr3[0];
        // for (int i = 0; i <= n - 1; i++) {
        // if (arr3[i] > max) {
        // max = arr3[i];
        // }
        // }
        // System.out.println("maximum value in arrya: " + max);

        // practice
        // int arr3[] = { 10, 20, 30, 40, 50 };
        // int n = arr3.length;
        // int min = arr3[0];
        // for (int i = 0; i <= n - 1; i++) {
        // if (arr3[i] < min) {
        // min = arr3[i];
        // }
        // }
        // System.out.println("minimum value in arrya: " + min);

        // Printing 2D array

        // int[][] matrix = {
        // { 1, 2, 3 },
        // { 4, 5, 6 }
        // };

        // for (int i = 0; i < matrix.length; i++) {
        // for (int j = 0; j < matrix.length; j++) {
        // System.out.print(matrix[i][j] + " ");
        // }
        // System.out.println();
        // }

        // Zagged Array
        // int[][] arr = {
        // {1, 2},
        // {2, 3, 4},
        // {3, 4, 5, 6},
        // {4, 5, 6, 7, 8}
        // };

        // int rowLength = arr.length;
        // for(int rowIndex = 0; rowIndex<=rowLength-1; rowIndex++) {
        // int colLength = arr[rowIndex].length;
        // for(int colIndex = 0; colIndex<=colLength-1; colIndex++) {
        // System.out.print(arr[rowIndex][colIndex] + " ");
        // }
        // System.out.println();
        // }

        // practice
        // int[][] arr = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } };
        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter the number of rows: ");
        // int rows = sc.nextInt();

        // System.out.println("Enter the number of columns: ");
        // int cols = sc.nextInt();

        // int[][] userArray = new int[rows][cols];

        // System.out.println("Enter the elements of the array: ");
        // for (int i = 0; i < rows; i++) {
        // for (int j = 0; j < cols; j++) {
        // userArray[i][j] = sc.nextInt();
        // }
        // }
        // System.out.println("User-defined 2D array elements:");
        // for (int i = 0; i < rows; i++) {
        // for (int j = 0; j < cols; j++) {
        // System.out.print(userArray[i][j] + " ");
        // }
        // System.out.println();
        // }

        // sum of 2D array
        // int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
        // int sum = 0;
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr.length; j++) {
        // sum += arr[i][j];
        // }
        // }
        // System.out.println("Sum: " + sum);

        // practice
        int arr[][] = { { 1, 2, 3, 4 }, { 5, 66, 7, 8 } };
        int max = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];

                }
            }
        }
        System.out.println(max);
    }
}