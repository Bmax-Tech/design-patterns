package bmaxtech;

import bmaxtech.department.BakedGoodsDepartment;
import bmaxtech.department.Department;
import bmaxtech.department.FreshProduceDepartment;
import bmaxtech.department.HouseholdDepartment;

/**
 * Concrete class
 */
public class SuperMarket {

  private final Department bakedGoodsDepartment;
  private final Department freshProduceDepartment;
  private final Department householdDepartment;

  public SuperMarket() {
    this.bakedGoodsDepartment = new BakedGoodsDepartment();
    this.freshProduceDepartment = new FreshProduceDepartment();
    this.householdDepartment = new HouseholdDepartment();
  }

  public void buyBakedItem() {
    this.bakedGoodsDepartment.packageItem();
  }

  public void buyFreshProduceItem() {
    this.freshProduceDepartment.packageItem();
  }

  public void buyHouseholdItem() {
    this.householdDepartment.packageItem();
  }

  public double totalBill() {
    return this.bakedGoodsDepartment.total() + this.freshProduceDepartment.total()
        + this.householdDepartment.total();
  }
}
