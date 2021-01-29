package bmaxtech;

/**
 * This application is to demonstrate the online supermarket with use of facade design pattern
 */
public class Main {

  public static void main(String[] args) {
    // create supermarket instance
    SuperMarket superMarket = new SuperMarket();

    // simulate purchase process of a customer
    superMarket.buyBakedItem();
    superMarket.buyFreshProduceItem();
    superMarket.buyHouseholdItem();

    // get total bill
    System.out.println("--------------------------------");
    System.out.println("Total Amount : " + superMarket.totalBill());
    System.out.println("--------------------------------");
  }
}
