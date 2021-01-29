package bmaxtech.entity;

import bmaxtech.mediator.ActionMediator;

/**
 * Menu Button implementation
 */
public class MenuButton extends Button {

  private boolean clicked = false;

  public MenuButton(ActionMediator mediator) {
    super(mediator, ButtonType.MENU);
  }

  @Override
  public void press() {
    System.out.println("MenuButton : press");
    // do menu button related logic
    // in the same time, save other action states in the remote's memory
    this.mediator.notify(ButtonType.VOLUME);
    this.mediator.notify(ButtonType.POWER);
  }

  @Override
  public void toggleState() {
    System.out.println("MenuButton : toggleState");
    this.clicked = !this.clicked;
  }
}
