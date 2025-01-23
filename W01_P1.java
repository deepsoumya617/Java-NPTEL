import java.util.Scanner;

// Blame NPTEL for this kind of class names!
public class W01_P1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        /* using Bitwise operators 
           to check if a number is even or odd 
        */
        if((number & 1) == 1)
            System.out.println("Odd");
        else
            System.out.println("Even");

        in.close();
    }
}