package FactoryPattern;

public class FixedDepositAccount implements BankAccount {
  @Override
  public void accountType() {
    System.out.println("This is Fixed Deosit Account");
  }
}
