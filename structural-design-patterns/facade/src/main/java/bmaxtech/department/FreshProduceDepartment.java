package bmaxtech.department;

/**
 * Sub-system for Fresh-produce department logic
 */
public class FreshProduceDepartment implements Department {

  @Override
  public void packageItem() {
    // do all the packaging related logic
    System.out.println("Fresh Produce packing : done");
  }

  @Override
  public double total() {
    // calculate the fresh produce items total cost
    return 2500;
  }
}
