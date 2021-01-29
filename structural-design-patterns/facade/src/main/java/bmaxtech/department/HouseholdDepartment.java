package bmaxtech.department;

/**
 * Sub-system for Household department logic
 */
public class HouseholdDepartment implements Department {

  @Override
  public void packageItem() {
    // do all the packaging related logic
    System.out.println("Household packing : done");
  }

  @Override
  public double total() {
    // calculate the household items total cost
    return 1500;
  }
}
