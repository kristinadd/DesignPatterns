package FactoryPattern;

public class BankAccountFactory {
  public static BankAccount getBankAccount(Account accountType) {
    if (accountType == null) {
      return null;
    }

    // When the compiler sees case SAVINGS, it automatically associates it with Account.SAVINGS because the switch is operating on an Account variable (accountType).
    // This only works because the enum type (Account) is explicitly declared as the type of the variable being switched on.
    switch (accountType) {
      case SAVINGS: 
          return new SavingsAccount();
      case Account.CURRENT:
          return new CurrentAccount();
      case Account.FIXED_DEPOSIT:
          return new FixedDepositAccount();
      default:
        throw new IllegalArgumentException("Unknown account type: " + accountType);
    }
  }
}
