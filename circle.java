import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        System.out.print("Enter the radius of the circle : ");

        Scanner in = new Scanner(System.in);
        int radius = in.nextInt();

        double area = 3.14 * radius * radius;
        System.out.println(area);
    }
}
