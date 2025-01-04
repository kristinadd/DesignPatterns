package DecoratorPattern2;

public class Main {
  public static void main(String[] args) {
    Account account = new BasicAccount(100);
    System.out.println(account.getDescription());

    // OverdraftProtectionDecorator overdraft = 
    //   new OverdraftProtectionDecorator(account, 500);
    // System.out.println(overdraft.getDescription());
    
    // reference
    account = new OverdraftProtectionDecorator(account, 500);
    System.out.println(account.getDescription());
  }
}
