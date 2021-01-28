package bmaxtech.handler;

import bmaxtech.Bill;

/**
 * AWS related cost handler
 */
public class AWSHandler implements Handler {

  private Handler next;

  @Override
  public void nextHandler(Handler handler) {
    next = handler;
  }

  @Override
  public void process(Bill bill) {
    // do the AWS cost calculations
    bill.setAwsCost(1000);
    System.out.println("AWSHandler : done");
    // call the next handler
    if (next != null) {
      next.process(bill);
    }
  }
}
