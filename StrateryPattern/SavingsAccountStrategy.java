package StrateryPattern;

public class SavingsAccountStrategy implements InterestCalculationStrategy {
  @Override
  public double calculateInterest(double balance) {
      return balance * 0.04; // 4% annual interest for savings accounts
  }
}
