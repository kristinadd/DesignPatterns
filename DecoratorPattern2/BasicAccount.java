package DecoratorPattern2;

public class BasicAccount implements Account {
  private double balance;

  public BasicAccount(double balance ) {
    this.balance = balance;
  }

  @Override
  public String getDescription() {
    return "This is Basic Account";
  }

  @Override
  public double getBalance() {
    return balance;
  }
}
