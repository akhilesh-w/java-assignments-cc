import java.util.Scanner;

public class rhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter diagonal 1 : ");
        int dia1 = in.nextInt();

        System.out.print("Enter diagonal 2 ");
        int dia2 = in.nextInt();

        int area = (dia1 * dia2) / 2;
        System.out.println("Area of the rhombus is " + area);
    }
}
