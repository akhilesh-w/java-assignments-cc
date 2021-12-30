import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle : ");
        int l = in.nextInt();

        System.out.println("Enter the width of the triangle ");
        int w = in.nextInt();

        int area = l * w;
        System.out.println("Area of the rectangle is : " + area);
    }
}
