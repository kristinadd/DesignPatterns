package FactoryPattern;
public class Main {
  public static void main(String[] args) {
    BankAccount account = BankAccountFactory.getBankAccount(Account.SAVINGS);

    account.accountType();
  }  
}
