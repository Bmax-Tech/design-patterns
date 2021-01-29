package bmaxtech;

import bmaxtech.entity.Button;
import bmaxtech.entity.MenuButton;
import bmaxtech.entity.PowerButton;
import bmaxtech.entity.VolumeButton;
import bmaxtech.mediator.ActionMediator;
import bmaxtech.mediator.ActionMediatorImpl;

/**
 * This application is to demonstrate the hosting fee calculation process with chain of
 * responsibility pattern
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
