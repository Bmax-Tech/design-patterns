package bmaxtech.entity;

import bmaxtech.mediator.ActionMediator;

/**
 * Abstract class for base component
 */
public abstract class Button {

  protected ActionMediator mediator;
  protected ButtonType type;

  public Button(ActionMediator mediator, ButtonType type) {
    this.mediator = mediator;
    this.type = type;
  }

  /**
   * Common action
   */
  public abstract void press();

  /**
   * Toggle state
   */
  public abstract void toggleState();

  public ButtonType getType() {
    return type;
  }
}
