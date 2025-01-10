package FactoryPattern;

public class SavingsAccount implements BankAccount {
  @Override
  public void accountType() {
    System.out.println("This is savings account");
  }
}
