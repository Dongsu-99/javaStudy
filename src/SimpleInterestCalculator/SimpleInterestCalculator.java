package SimpleInterestCalculator;

import java.math.BigDecimal;
//어렵다
public class SimpleInterestCalculator {
    BigDecimal principal;
    BigDecimal interest;

    public SimpleInterestCalculator(String principal, String interest) {

        this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
        this.principal = new BigDecimal(principal);

    }

    public BigDecimal calculatorTotalValue(int noOfYears) {
        // Total Value = principal + principal *interest *noOfYears;
       BigDecimal totalValue= principal.add(
                principal.multiply(interest)
                        .multiply(new BigDecimal(noOfYears)));
        return totalValue;
    }
}
