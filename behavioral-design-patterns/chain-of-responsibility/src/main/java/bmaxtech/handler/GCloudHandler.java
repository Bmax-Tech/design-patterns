package bmaxtech.handler;

import bmaxtech.Bill;

/**
 * Google Cloud related cost handler
 */
public class GCloudHandler implements Handler {

  private Handler next;

  @Override
  public void nextHandler(Handler handler) {
    next = handler;
  }

  @Override
  public void process(Bill bill) {
    // do the Google Cloud cost calculations
    bill.setGCloudCost(1500);
    System.out.println("GCloudHandler : done");
    // call the next handler
    if (next != null) {
      next.process(bill);
    }
  }
}
