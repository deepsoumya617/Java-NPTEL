import java.util.Scanner;

// Blame NPTEL for this kind of class names!
public class W01_P3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        // Print the multiplication table of number up to 5
        for(int i = 1; i <= 5; ++i) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        
        in.close();
    }
}
