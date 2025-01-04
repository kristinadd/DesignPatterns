package DecoratorPattern2;

public class AccountDecorator implements Account {
  private Account account;

  public AccountDecorator(Account account) {
    this.account = account;
  }
  
  @Override
  public String getDescription() {
    return account.getDescription();
  }

  @Override
  public double getBalance() {
    return account.getBalance();
  }
}
