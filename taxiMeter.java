import java.util.Scanner;

public class taxiMeter {
    /**\
     * There are 3 desired states
     * Case 1 = Opening fee will be $7
     * Case 2 = $2 will be added per KM
     * Case 3 = Minimum payout will be $15. Fees under $15 are still $15.
     * @param args
     */
    public static void main(String[] args) {
        int km ;
        double perKm = 2, total , startPrice = 7;

        Scanner imput = new Scanner(System.in);
        System.out.println("Enter the distance in KM : ");
        km = imput.nextInt();
        total = (km *perKm);
        total += startPrice;

        total = (total <20) ? 20 : total;
        System.out.println("Total Amount: "+ total);



    }
}
