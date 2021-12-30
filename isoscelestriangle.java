import java.util.Scanner;

public class isoscelestriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the base of the triangle : ");
        int b = in.nextInt();

        System.out.print("Enter the height of the triangle : ");
        int h = in.nextInt();

        int area = (b * h) / 2;
        System.out.println("Area of the isosceles triangle is : " + area );
    }
}
