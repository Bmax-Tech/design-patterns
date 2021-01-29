package bmaxtech.entity;

import bmaxtech.mediator.ActionMediator;

/**
 * Power Button implementation
 */
public class PowerButton extends Button {

  private boolean lock = false;

  public PowerButton(ActionMediator mediator) {
    super(mediator, ButtonType.POWER);
  }

  @Override
  public void press() {
    System.out.println("PowerButton : press");
    // do power button related logic
    // in the same time, save other action states in the remote's memory
    this.mediator.notify(ButtonType.VOLUME);
  }

  @Override
  public void toggleState() {
    System.out.println("PowerButton : toggleState");
    this.lock = !this.lock;
  }
}
