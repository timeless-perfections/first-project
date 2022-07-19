import java.util.Scanner;

public class areaOfTriangle {
    public static void main(String[] args) {
        //Write the variables
        int a, b ;
        double c;

        //Request data from user
        Scanner entry = new  Scanner(System.in);
        System.out.print("1. Enter Edge : ");
        a = entry.nextInt();
        System.out.print("2. Enter Edge : ");
        b = entry.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenus : " + c);

    }
}
