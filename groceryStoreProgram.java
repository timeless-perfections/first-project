import java.util.Scanner;

public class groceryStoreProgram {
    public static void main(String[] args) {
        double pear = 2.14, apple = 3.67, tomato = 1.11, banana = 0.95, aubergine =5.0, amount=0.0, a, t, b, p, au ;

        System.out.println("How Many Kilos of Pears : ");
        Scanner i1 = new Scanner(System.in);
        p = i1.nextDouble();

        System.out.println("How Many Kilos of Apples : ");
        Scanner i2 = new Scanner(System.in);
        a = i2.nextDouble();

        System.out.println("How Many Kilos of Tomatoes : ");
        Scanner i3 = new Scanner(System.in);
        t = i3.nextDouble();

        System.out.println("How Many Kilos of Banana : ");
        Scanner i4 = new Scanner(System.in);
        b = i4.nextDouble();

        System.out.println("How Many Kilos of Eggplant : ");
        Scanner i5 = new Scanner(System.in);
        au = i5.nextDouble();

        amount +=pear * p + apple * a + tomato * t + banana * b + aubergine *au;
        System.out.println("Total Amount : " + amount);








    }
}
