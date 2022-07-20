import java.util.Scanner;

public class taftcatloip {
    public static void main(String[] args) {
        //taftcatloip= The area of the circle and the length of its perimeter
        int r;
        double pi = 3.14;

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the Radius of the Circle : ");
        r = inp.nextInt();
        double area = pi * r *r;
        double environment = 2 * pi * r;

        System.out.println("Area of the Circle : " + area);
        System.out.println("Circumference of the Circle : " + environment);




    }
}
