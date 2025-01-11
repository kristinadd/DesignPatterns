package DecoratorPattern;

public class VIPBankAccount implements BankAccount {
  private double balance;
  private String specialMessage;

  public VIPBankAccount(double balance, String specialMessage) {
    this.balance = balance;
    this.specialMessage = specialMessage;
  }

  public double getBalance() {
    return balance;
  }

  public double setBalance(double amount) {
    return balance;
  }

  @Override
  public double deposit(double amount) {
    return amount;
  }

  @Override
  public double withdraw(double amount) {
    return amount;
  }

  @Override
  public String toString() {
    return "This is VIP account with balance of £" + balance + "\n" +" Special message: " + specialMessage;
  }
}
