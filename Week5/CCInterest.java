import java.util.Scanner;

public class CCInterest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //declaring the variables with the data type
        double ccBalance;
        double aprRate;
        double interest;

        //asking the user for their information (this accounts for lines 14 and 19.)
        System.out.print("Enter your credit card balance: ");

        //assigning that information to the declared variables (this accounts for lines 17 and 21.)
        ccBalance = input.nextDouble();

        System.out.print("Enter your APR rate: ");

        aprRate = input.nextDouble();

        //calculating the interest and assigning it to said variable
        interest = ccBalance * (aprRate / 100) / 12;

        //setting up the format to two decimals
        System.out.printf("Monthly interest: $%.2f%n", interest);

        if (interest < 10) {
            System.out.println("Low Monthly Interest");
        }
        else if (interest >= 10 && interest < 25) {
            System.out.println("Moderate Monthly Interest");
        }
        else if (interest >= 25 && interest < 50) {
            System.out.println("High Monthly Interest");
        }
        else {
            System.out.println("Very High Monthly Interest");
        }









    }
}
