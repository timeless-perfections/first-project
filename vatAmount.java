import java.util.Scanner;
public class vatAmount {
    public static void main(String[] args) {
        double amount, vatRate = 0.18, vatAmount,amountWithVat;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount: ");
        amount = input.nextDouble();

        vatAmount = amount * vatRate;
        amountWithVat = amount + vatAmount;

        System.out.println("VAT you keep" + amount);
        System.out.println("Vat rate" + vatRate);
        System.out.println("Vat mount" + vatAmount);
        System.out.println("Amount with vat"+ amountWithVat);



    }
}
