import java.util.*;

class TestArray {
    public static void main(String args[]) {
        int a[][] = new int[3][3]; // declaration and instantiation
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter elements:");

        // Input loop
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Print loop (moved outside the input loop)
        System.out.println("----Entered Elements are ----");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println(); // Move to new line after each row
        }
        
        sc.close(); // Close the scanner
    }
}
