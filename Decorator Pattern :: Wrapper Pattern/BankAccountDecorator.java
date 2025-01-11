package DecoratorPattern;

public class BankAccountDecorator implements BankAccount {
  private BankAccount bankAccount;

  public BankAccountDecorator(BankAccount bankAccount) {
    this.bankAccount = bankAccount;
  }

  @Override
  public double deposit(double amount) {
    return bankAccount.deposit(amount);
  }

  @Override
  public double withdraw(double amount) {
    return amount;
  }

  @Override
  public String toString() {
    return bankAccount.toString();
  }
}
