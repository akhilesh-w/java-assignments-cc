import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the height of the triangle : ");
        int h = in.nextInt();

        System.out.println("Enter the base of the triangle : ");
        int b = in.nextInt();

        int area = (h * b) / 2;
        System.out.println("The area of the triangle is : " + area);
    }
}
