package StrateryPattern;

public class FixedDepositStrategy implements InterestCalculationStrategy {
  @Override
  public double calculateInterest(double balance) {
    return balance * 0.07;
  }
}
