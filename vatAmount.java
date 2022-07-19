import java.util.Scanner;
public class vatAmount {
    public static void main(String[] args) {
        double amount, vatRate = 0.18, vatMount,amountWithvat;
        Scanner imput = new Scanner(System.in);
        System.out.println("Enter amount: ");
        amount = imput.nextDouble();

        vatMount = amount * vatRate;
        amountWithvat = amount + vatMount;

        System.out.println("VAT you keep" + amount);
        System.out.println("Vat rate" + vatRate);
        System.out.println("Vat mount" + vatMount);
        System.out.println("Amount with vat"+ amountWithvat);



    }
}
