package bmaxtech.entity;

import bmaxtech.mediator.ActionMediator;

/**
 * Volume Button implementation
 */
public class VolumeButton extends Button {

  private boolean mute = false;

  public VolumeButton(ActionMediator mediator) {
    super(mediator, ButtonType.VOLUME);
  }

  @Override
  public void press() {
    System.out.println("VolumeButton : press");
    // do volume button related logic
    // in the same time, save other action states in the remote's memory
    this.mediator.notify(ButtonType.POWER);
  }

  @Override
  public void toggleState() {
    System.out.println("VolumeButton : toggleState");
    this.mute = !this.mute;
  }
}
