package org.example.math;

import java.math.BigDecimal;

public class SimpleInterestCalculator {

    private BigDecimal principal;
    private BigDecimal interest;

    public SimpleInterestCalculator(String principal, String interest) {
        this.principal = new BigDecimal(principal);
        this.interest = new BigDecimal(interest);
    }


    public BigDecimal calculateTotalValue(int noOfYears) {
        /** Total Value = principal + principal * interest * noOfYears */
        return principal.add(principal.multiply(interest)
                        .multiply(new BigDecimal(noOfYears)));
    }

}
