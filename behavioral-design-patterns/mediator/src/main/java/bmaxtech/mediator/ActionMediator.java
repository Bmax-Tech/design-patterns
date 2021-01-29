package bmaxtech.mediator;

import bmaxtech.entity.Button;
import bmaxtech.entity.ButtonType;

/**
 * Mediator interface
 */
public interface ActionMediator {

  /**
   * Setter for component
   *
   * @param button - the component
   */
  void add(Button button);

  /**
   * Common action for all components to communicate with
   *
   * @param type - the button type
   */
  void notify(ButtonType type);
}
