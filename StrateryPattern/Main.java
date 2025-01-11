package StrateryPattern;

public class Main {
  public static void main(String[] args) {

    BankAccount bankAccount = new BankAccount(100, new SavingsAccountStrategy());

    System.out.println(bankAccount.calculateInterest());

    System.out.println(bankAccount.getBalance());
  }
}
