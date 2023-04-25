package org.example.math;

import java.math.BigDecimal;
import java.util.Scanner;

public class InterestCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /** Formula:
         *  Total Amount = principal + principal * interest * noOfYears
         */

        System.out.println("Simple Interest Calculator");

        SimpleInterestCalculator  simpleInterestCalculator = new SimpleInterestCalculator("4500", "7.5");

        BigDecimal totalValue = simpleInterestCalculator.calculateTotalValue(5); //5 years

        System.out.println(totalValue);

        /* System.out.println("Enter the Principal (Amount)");
        BigDecimal principal = sc.nextBigDecimal();*/

    }

}
