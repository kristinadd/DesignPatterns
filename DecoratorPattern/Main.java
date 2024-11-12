package DecoratorPattern;

public class Main {

  public static void main(String[] args) {
    // Programming against concrete class
    BasicBankAccount account = new BasicBankAccount(10000);
    System.out.println(account.getBalance());
    System.out.println(account.getBalance());

    //  Programming against the interface
     BankAccount account2 = new BasicBankAccount(98765);
     System.out.println(account2);

    double balance = ((BasicBankAccount) account2).getBalance();
    
    System.out.println(balance);
  }

}
