package bmaxtech;

import bmaxtech.entity.Button;
import bmaxtech.entity.MenuButton;
import bmaxtech.entity.PowerButton;
import bmaxtech.entity.VolumeButton;
import bmaxtech.mediator.ActionMediator;
import bmaxtech.mediator.ActionMediatorImpl;

/**
 * This application is to demonstrate the remote controller operation logic with mediator design
 * pattern
 */
public class Main {

  public static void main(String[] args) {
    // concrete mediator
    ActionMediator mediator = new ActionMediatorImpl();

    // actionable components
    Button powerButton = new PowerButton(mediator);
    Button volumeButton = new VolumeButton(mediator);
    Button menuButton = new MenuButton(mediator);

    // register components with concrete mediator
    mediator.add(powerButton);
    mediator.add(volumeButton);
    mediator.add(menuButton);

    // press the menu button
    menuButton.press();
  }
}
