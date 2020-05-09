package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageImpl {

    public static void main(final String[] args) {
        double principle, emi, monthlyInterestRate, periodInMonths;
        final byte months = 12;
        final byte percent = 100;
        JavaTutorialPractise.printResults("Do you want to run Practice code? (Y/N):");

        final Scanner sc1 = new Scanner(System.in);
        final String practiseCode = sc1.nextLine();
        if (practiseCode.equalsIgnoreCase("Y")) {
            JavaTutorialPractise.javaPractise();
        } else {
            JavaTutorialPractise.printResults("Enter Your Principle amount:");
            principle = Double.parseDouble(sc1.nextLine());
            JavaTutorialPractise.printResults("Enter Your annual Interest rate:");
            monthlyInterestRate = Double.parseDouble(sc1.nextLine()) / months / percent;
            JavaTutorialPractise.printResults("Enter Your period in years of repayment:");
            periodInMonths = Double.parseDouble(sc1.nextLine()) * months;

            emi = Math.ceil(principle * (monthlyInterestRate * (Math.pow(1 + monthlyInterestRate, periodInMonths)))
                    / ((Math.pow(1 + monthlyInterestRate, periodInMonths)) - 1));
            final NumberFormat n1 = NumberFormat.getCurrencyInstance();

            JavaTutorialPractise.printResults("Mortgage is :" + n1.format(emi));

            JavaTutorialPractise.printResults("Your Interest is :" + n1.format(emi * periodInMonths - principle));
//        JavaTutorialPractise.printResults("Do you want to run Practice code? (Y/N):");
//        String practiseCode = sc1.nextLine();
            JavaTutorialPractise.printResults("Bye Bye!! Have a nice day.");
        }
        sc1.close();
    }
}
