import java.util.Scanner;

// Blame NPTEL for this kind of class names!
public class W01_P2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double radius = in.nextDouble();
        double height = in.nextDouble();

        // Calculate the volume of a cylinder
        double volume = Math.PI * radius * radius * height;

        // System.out.println(volume);
        System.out.printf("Volume is: %.2f", volume);
        in.close();
    }
}
