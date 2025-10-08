import java.util.Scanner;

public class Cuboid {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int length, breadth, height;
        int Area, Volume, Perimeter;
        System.out.println("Enter values for Length, Breadth and Height: ");
        length = sc.nextInt();
        breadth = sc.nextInt();
        height = sc.nextInt();

        Area = 2 * ((length * breadth) + (breadth * height) + (height * length));
        Volume = length * breadth * height;
        Perimeter = 4 * (length + breadth + height);

        System.out.println("Area , Volume and perimeter of a cuboid is : " + Area + " " + Volume + " " + Perimeter);
    }

}
