package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double principle, emi, monthlyInterestRate, periodInMonths;
        final byte months = 12;
        final byte percent = 100;
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter Your Principle amount:");
        principle = Double.parseDouble(sc1.nextLine());
        System.out.print("Enter Your annual Interest rate:");
        monthlyInterestRate = Double.parseDouble(sc1.nextLine()) / months / percent;
        System.out.print("Enter Your period in years of repayment:");
        periodInMonths = Double.parseDouble(sc1.nextLine()) * months;

        emi = Math.ceil(principle * (monthlyInterestRate * (Math.pow(1 + monthlyInterestRate, periodInMonths)))
                / ((Math.pow(1 + monthlyInterestRate, periodInMonths)) - 1));
        NumberFormat n1 = NumberFormat.getCurrencyInstance();

        System.out.println("Mortgage is :" + n1.format(emi));

        System.out.println("Your Interest is :" + n1.format(emi * periodInMonths - principle));
System.out.println("Do you want to run Practice code? (Y/N):");
		String practiseCode= sc1.nextLine();
		
		if (practiseCode.equalsIgnoreCase("Y")) {
			JavaTutorialPractise.JavaPractise();
		}
		else {
			System.out.println("Bye Bye!! Have a nice day.");
		}
    }
}
