import java.util.Scanner;

// Blame NPTEL for this kind of class names!
public class W01_P5 {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        /* Print the given pattern */
        // For the upper half
        for(int i = 1; i <= n; ++i) {
            for(int j = 1; j <= n + 1 -i; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
        // For the lower half
        for(int i = 2; i <= n; ++i) {
            for(int j = 1; j <= i; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
