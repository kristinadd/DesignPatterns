package Singleton;

public class Main {
  public static void main(String[] args) {
    TransactionManager transactionManager = TransactionManager.getInstance();

    transactionManager.startTransaction();

    try {
      System.out.println("Performing bank operations");
      transactionManager.commitTransaction();
    } catch (Exception e) {
      e.printStackTrace();
      transactionManager.rollbackTransaction();
    }
  }
}
