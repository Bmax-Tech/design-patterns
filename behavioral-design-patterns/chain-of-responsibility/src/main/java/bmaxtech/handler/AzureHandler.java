package bmaxtech.handler;

import bmaxtech.Bill;

/**
 * Azure Cloud related cost handler
 */
public class AzureHandler implements Handler {

  private Handler next;

  @Override
  public void nextHandler(Handler handler) {
    next = handler;
  }

  @Override
  public void process(Bill bill) {
    // do the Azure Cloud cost calculations
    bill.setAzureCost(2500);
    System.out.println("AzureHandler : done");
    // call the next handler
    if (next != null) {
      next.process(bill);
    }
  }
}
