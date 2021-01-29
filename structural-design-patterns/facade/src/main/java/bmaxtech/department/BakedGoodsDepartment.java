package bmaxtech.department;

/**
 * Sub-system for Baked-Goods department logic
 */
public class BakedGoodsDepartment implements Department {

  @Override
  public void packageItem() {
    // do all the packaging related logic
    System.out.println("Baked Goods packing : done");
  }

  @Override
  public double total() {
    // calculate the baked goods total cost
    return 1000;
  }
}
