package StrateryPattern;

public class BankAccount {
  private double balance;
  private InterestCalculationStrategy interestStrategy;

  public BankAccount(double balance, InterestCalculationStrategy interestStrategy) {
    this.balance = balance;
    this.interestStrategy = interestStrategy;  
  }

  public double calculateInterest() {
    return interestStrategy.calculateInterest(balance);
  }

  public double getBalance() {
    return balance;
  }
}
