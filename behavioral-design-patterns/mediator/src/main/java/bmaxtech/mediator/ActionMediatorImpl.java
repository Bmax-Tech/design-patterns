package bmaxtech.mediator;

import bmaxtech.entity.Button;
import bmaxtech.entity.ButtonType;

public class ActionMediatorImpl implements ActionMediator {

  private Button powerButton;
  private Button volumeButton;
  private Button menuButton;

  @Override
  public void add(Button button) {
    switch (button.getType()) {
      case POWER:
        this.powerButton = button;
        break;
      case VOLUME:
        this.volumeButton = button;
        break;
      case MENU:
        this.menuButton = button;
    }
  }

  @Override
  public void notify(ButtonType type) {
    switch (type) {
      case POWER:
        this.powerButton.toggleState();
        break;
      case VOLUME:
        this.volumeButton.toggleState();
        break;
      case MENU:
        this.menuButton.toggleState();
    }
  }
}
