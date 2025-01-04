package Singleton;

public class TransactionManager {
  private static TransactionManager instance;

  private TransactionManager() {}

  public static synchronized TransactionManager getInstance() {
    if (instance == null) {
      instance = new TransactionManager();
    }
    return instance;
  }

  public void startTransaction() {
    System.out.println("Transaction started.");
  }

  public void commitTransaction() {
    System.out.println("Transaction Commited.");
  }

  public void rollbackTransaction() {
    System.out.println("Transaction rolledback");
  }
}
