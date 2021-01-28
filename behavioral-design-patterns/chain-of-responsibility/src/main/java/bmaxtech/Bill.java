package bmaxtech;

/**
 * The Hosting Bill entity with all the expenses
 */
public class Bill {

  private double awsCost;
  private double gCloudCost;
  private double azureCost;
  private double subTotal;
  private double discount;
  private double total;

  public double getAwsCost() {
    return awsCost;
  }

  public void setAwsCost(double awsCost) {
    this.awsCost = awsCost;
  }

  public double getGCloudCost() {
    return gCloudCost;
  }

  public void setGCloudCost(double gCloudCost) {
    this.gCloudCost = gCloudCost;
  }

  public double getAzureCost() {
    return azureCost;
  }

  public void setAzureCost(double azureCost) {
    this.azureCost = azureCost;
  }

  public double getSubTotal() {
    return subTotal;
  }

  public void setSubTotal(double subTotal) {
    this.subTotal = subTotal;
  }

  public double getDiscount() {
    return discount;
  }

  public void setDiscount(double discount) {
    this.discount = discount;
  }

  public double getTotal() {
    return total;
  }

  public void setTotal(double total) {
    this.total = total;
  }
}
