package bmaxtech.handler;

import bmaxtech.Bill;

/**
 * The handler interface
 */
public interface Handler {

  /**
   * The next handler reference
   *
   * @param handler - the handler
   */
  void nextHandler(Handler handler);

  /**
   * The bill processor
   *
   * @param bill - the bill entity
   */
  void process(Bill bill);
}
