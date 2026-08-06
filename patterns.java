public class patterns {
    public static void main(String[] args) {

        // (pattern 1: Solid Square pattern)
        System.out.println("Pattern 1: Solid Square pattern");
        int n = 4;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // (pattern 2: Solid Rectangle pattern)
        // System.out.println("Pattern 2: Solid Rectangle pattern");
        // int rows = 3;
        // int cols = 5;
        // for (int i = 0; i < rows; i++) {
        //     for (int j = 0; j < cols; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // (pattern 3:Right-angled triangle pattern)
        System.out.println("pattern 3: Right-angled triangle pattern");
        int m = 5;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // (pattern 4: Solid Rhombus pattern)
        System.out.println("pattern 4: Solid Rhombus pattern");
        int p = 5;
        for (int i = 1; i <= p; i++) {
            for (int j = 1; j <= p - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= p; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // (pattern 5: number triangle pattern)
        System.out.println("pattern 5: number triangle pattern");
        int q = 5;
        for (int i = 1; i <= q; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // (pattern 6: Inverted star triangle pattern)
        System.out.println("pattern 6: Inverted star triangle pattern");
        int r = 5;
        for (int i = r; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // (pattern 7: Inverted Alphabet triangle pattern)
        System.out.println("pattern 7: Inverted Alphabet triangle pattern");
        int s = 5;
        for (int i = s; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (j + 64) + " ");
            }
            System.out.println();
        }

        // (pattern 8: Inverted number triangle pattern)
        System.out.println("pattern 8: Inverted number triangle pattern");
        int t = 5;
        for (int i = t; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // (pattern 9: Star Pyramid Pattern)
        System.out.println("Pattern 9: Star Pyramid Pattern");
        int u = 5;
        for (int i = 1; i <= u; i++) {

            // Print leading spaces
            for (int j = 1; j <= u - i; j++) {
                System.out.print("  "); // two spaces
            }

            // Print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // (pattern 10: Inverted Star Pyramid Pattern)
        System.out.println("Pattern 10: Inverted Star Pyramid Pattern");
        int v = 5;
        for (int i = v; i >= 1; i--) {
            // Print leading spaces
            for (int j = 1; j <= v - i; j++) {
                System.out.print("  "); // two spaces
            }

            // Print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // (pattern 11: Hollow star rectangle pattern)
        System.out.println("Pattern 11: Hollow star rectangle pattern");

        int w = 4;
        for (int i = 1; i <= w; i++) {
            for (int j = 1; j <= 6; j++) {
                if (i == 1 || i == w || j == 1 || j == 6) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // two spaces
                }
            }
            System.out.println();
        }

        // (pattern 12: Hollow star Triangle pattern)
        System.out.println("pattern 12: Hollow star Triangle pattern");
        int x = 4;
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == x || j == 1 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // two spaces
                }
            }
            System.out.println();
        }

        // (pattern 13: Hollow star Pyramid pattern)
        System.out.println("pattern 13: Hollow star Pyramid pattern");
        int y = 5;
        for (int i = 1; i <= y; i++) {
            for (int j = 1; j <= y - i; j++) {
                System.out.print("  "); // two spaces
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (i == y || j == 1 || j == 2 * i - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // two spaces
                }
            }
            System.out.println();
        }

        // (pattern 14: Solid Diamond pattern)
        System.out.println("pattern 14: Solid Diamond pattern");
        int z = 4;
        for (int i = 1; i <= z; i++) {
            for (int j = 1; j <= z - i; j++) {
                System.out.print("  "); // two spaces
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = z - 1; i >= 1; i--) {
            for (int j = 1; j <= z - i; j++) {
                System.out.print("  "); // two spaces
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // (pattern 15: Hollow Diamond pattern)
        System.out.println("pattern 15: Hollow Diamond pattern");
        int a = 4;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a - i; j++) {
                System.out.print("  "); // two spaces
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // two spaces
                }
            }
            System.out.println();
        }
        for (int i = a - 1; i >= 1; i--) {
            for (int j = 1; j <= a - i; j++) {
                System.out.print("  "); // two spaces
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // two spaces
                }
            }
            System.out.println();
        }

        // (pattern 16: )
        System.out.println("pattern 16: ");
        // part 1
        int b = 4;
        for (int i = 1; i <= b; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // part 2
            for (int j = 1; j <= 2 * (b - i); j++) {
                System.out.print("  "); // two spaces
            }

            // part 3
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // part 4
        for (int i = b; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // part 5
            for (int j = 1; j <= 2 * (b - i); j++) {
                System.out.print("  "); // two spaces
            }
            // part 6
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Numberic Pattens
        System.out.println("Numberic Pattens 1: Number Triangle");
        int c = 5;
        for (int i = 1; i <= c; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // numberic pattern 2
        System.out.println("Numberic Patterns 2: ");
        int d = 5;
        int count = 1;
        for (int i = 1; i <= d; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }

        // Alphabetic pattern 3
        // System.out.println("Alphabetic pattern 3: "); 
        // int e = 5;
        // for (int i = 1; i <= e; i++) {
        // for (int j = 1; j <= i; j++) {
        // int Cola = j;
        // int Colb = ('A' - 1);
        // int ans = Cola + Colb;
        // char finalresult = (char) ans;
        // System.out.print(finalresult + " ");
        // }
        // System.out.println();
        // }

        // Alphabetic pattern: 3
        System.out.println("Alphabetic Pattern: ");
        int e = 5;
        for (int i = 1; i <= e; i++) {
            for (int j = 1; j <= i; j++) {
                int cola = e - j;
                int colb = 'A';
                int ans = cola + colb;
                char finalAns = (char) ans;
                System.out.print(finalAns + " ");
            }
            System.out.println();
        }

    }
}
