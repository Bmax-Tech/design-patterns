package bmaxtech;

import bmaxtech.handler.AWSHandler;
import bmaxtech.handler.AzureHandler;
import bmaxtech.handler.DiscountHandler;
import bmaxtech.handler.GCloudHandler;

/**
 * This application is to demonstrate the hosting fee calculation process with chain of
 * responsibility pattern
 */
public class Main {

  public static void main(String[] args) {
    Bill hostingBill = new Bill();

    // create handlers
    AWSHandler awsHandler = new AWSHandler();
    GCloudHandler gCloudHandler = new GCloudHandler();
    AzureHandler azureHandler = new AzureHandler();
    DiscountHandler discountHandler = new DiscountHandler();

    // set next hop handlers
    awsHandler.nextHandler(gCloudHandler);
    gCloudHandler.nextHandler(azureHandler);
    azureHandler.nextHandler(discountHandler);

    // trigger the calculation
    awsHandler.process(hostingBill);

    System.out.println("--------------------------------");
    System.out.println("Monthly Hosting Bill");
    System.out.println("--------------------------------");
    System.out.println("AWS Cost : " + hostingBill.getAwsCost());
    System.out.println("Google Cloud Cost : " + hostingBill.getGCloudCost());
    System.out.println("Azure Cost : " + hostingBill.getAzureCost());
    System.out.println("--------------------------------");
    System.out.println("Sub Total : " + hostingBill.getSubTotal());
    System.out.println("Discount : " + hostingBill.getDiscount());
    System.out.println("Total : " + hostingBill.getTotal());
  }
}
