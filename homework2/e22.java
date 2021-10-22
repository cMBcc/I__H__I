package hello;
import java.util.Scanner;
public class e22 {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        double loan = input.nextDouble();
        System.out.print("Number of Year: ");
        int year = input.nextInt();
        System.out.print("Annual Interest Rate: ");
        double rate = input.nextDouble();
        rate /= 100.0;
        System.out.println("");
        double mon_loan = loan * (rate / 12.0) / (1.0 - 1.0 / Math.pow((1.0 + rate / 12.0), year * 12.0));
        System.out.printf("Monthly Payment: %.2f\n", mon_loan);
        System.out.printf("Total Payment: %.2f\n", mon_loan * 12.0 * year);
        double Balance = loan;
        double Principal, interest;
        System.out.println("Patment#\tInterest\tPrincipal\tBalance\n");
        for (int i = 1; i <= year * 12; i++) {
            interest = rate / 12.0 * Balance;
            Principal = mon_loan - interest;
            Balance = Balance - Principal;
            System.out.printf("%d\t\t%.2f\t\t%.2f\t\t%.2f\n", i, interest, Principal, Balance);
        }
    }
}



