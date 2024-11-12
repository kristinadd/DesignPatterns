package DecoratorPattern;

public class BasicBankAccount implements BankAccount {
  private double balance;

  public BasicBankAccount(double balance) {
    this.balance = balance;
  }

  public double getBalance() {
    luck();
    return balance;
  }

  public double setBalance(double amount) {
    return balance;
  }

  public double luck() {
    balance = balance + 50.00;

    return balance;
  }

  @Override
  public double deposit(double amount) {
    balance = balance + amount;

    return balance;
  }

  @Override
  public double withdraw(double amount) {
    return amount;
  }
  
  @Override
  public String toString() {
    return "Current balance is: £ " + balance;
  }
}
