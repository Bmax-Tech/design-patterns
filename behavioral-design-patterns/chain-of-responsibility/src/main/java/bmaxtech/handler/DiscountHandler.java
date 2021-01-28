package bmaxtech.handler;

import bmaxtech.Bill;

/**
 * Discount calculator
 */
public class DiscountHandler implements Handler {

  private Handler next;

  @Override
  public void nextHandler(Handler handler) {
    next = handler;
  }

  @Override
  public void process(Bill bill) {
    // calculate sub-total
    bill.setSubTotal(bill.getAwsCost() + bill.getGCloudCost() + bill.getAzureCost());
    // calculate discount
    double discount = 0; // the percentage value
    if (bill.getSubTotal() > 10000) {
      discount = 0.15;
    } else if (bill.getSubTotal() > 7500) {
      discount = 0.10;
    } else if (bill.getSubTotal() > 5000) {
      discount = 0.075;
    } else if (bill.getSubTotal() > 2500) {
      discount = 0.05;
    }
    bill.setDiscount(bill.getSubTotal() * discount);
    // calculate total
    bill.setTotal(bill.getSubTotal() - bill.getDiscount());
    System.out.println("DiscountHandler : done");
    // call the next handler
    if (next != null) {
      next.process(bill);
    }
  }
}
