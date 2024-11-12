package DecoratorPattern;

public class Notification extends BankAccountDecorator { // this extends is not for inheritance, it's delegation
  
  public Notification(BankAccount bankAccount) {
    super(bankAccount); 
  }

  @Override
  public double deposit(double amount) {
    System.out.println("Notification: You deposited £ " + amount);
    return super.deposit(amount);
  }

  @Override
  public String toString() {
    return super.toString();
  }
}
