package hello;

import java.util.Scanner;

public class e21 {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Loan Amout: ");
        double loan = input.nextDouble();
        System.out.print("Number of Year: ");
        double year = input.nextDouble();
        double up = 0.00125;
        System.out.println("Interest Rate\tMonthly Payment\tTotal Payment\n");
        for (double i = 0.05; i <= 0.081; i += up) {
            System.out.printf("%.3f%%\t\t", i * 100);
            double mon_loan = loan * (i / 12.0) / (1.0 - 1.0 / Math.pow((1.0 + i / 12.0), year * 12.0));
            System.out.printf("%.2f\t\t", mon_loan);
            System.out.printf("%.2f\n", mon_loan * year * 12);
        }
    }
}
