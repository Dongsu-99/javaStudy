package SimpleInterestCalculator;

import SimpleInterestCalculator.SimpleInterestCalculator;

import java.math.BigDecimal;

public class SimpleInterestCalculatorRunner {
    public static void main(String[] args) {
//        Total Amount =  principal + principal *interest*noOfYears;
        SimpleInterestCalculator calculator = new SimpleInterestCalculator("4500.00", "7.5");
        BigDecimal totalValue = calculator.calculatorTotalValue(5);//5 years
        System.out.println(totalValue);
    }
}
