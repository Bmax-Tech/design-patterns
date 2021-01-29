package bmaxtech.department;

/**
 * Common facade for each department
 */
public interface Department {

  /**
   * Do the packaging related logic
   */
  void packageItem();

  /**
   * calculates the total
   *
   * @return - the total amount
   */
  double total();
}
