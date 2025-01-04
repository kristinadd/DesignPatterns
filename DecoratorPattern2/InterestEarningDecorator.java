package DecoratorPattern2;

public class InterestEarningDecorator extends AccountDecorator {
  private double interestRate;
  
  public InterestEarningDecorator(Account account, double interestRate) {
    super(account);
    this.interestRate = interestRate;
  }

  @Override
  public String getDescription() {
    return super.getDescription() + " with Interest Earning";
  }

  @Override
  public double getBalance() {
    return super.getBalance() * ( 1 + interestRate / 100);
  }
}
