package FactoryPattern;

public class CurrentAccount implements BankAccount{
  @Override
  public void accountType() {
    System.out.println("This is current account");
  }
}
