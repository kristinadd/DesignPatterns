package DecoratorPattern2;

public class OverdraftProtectionDecorator extends AccountDecorator {
  private double overdraftLimit;

  public OverdraftProtectionDecorator(Account account, double overdraftLimit) {
    super(account);
    this.overdraftLimit = overdraftLimit;
  }

  @Override
  public String getDescription() {
    return super.getDescription() + " with Overdraft Protection";
  }

  @Override
  public double getBalance() {
    return super.getBalance() + overdraftLimit;
  }
}
