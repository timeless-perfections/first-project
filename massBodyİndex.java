import java.util.Scanner;

public class massBodyİndex {
    public static void main(String[] args) {
        double weight,size,index;
        Scanner input = new Scanner(System.in);

        System.out.println("Write Your Height : ");
        size = input.nextDouble();

        System.out.println("Type Your Weight");
        weight =input.nextDouble();
        index = weight/size * size ;
        System.out.println("Your Body Mass Index : "+ index);

        if (index < 1.8){
            System.out.print("You Are Weak");
        }


    }

}
