package StrateryPattern;

public class CurrentAccountStrategy implements InterestCalculationStrategy {
  @Override
  public double calculateInterest(double balance) {
    return balance * 0.01;
  }
  
}
