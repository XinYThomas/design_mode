package design.factory.factories;

import design.factory.buttons.Button;
import design.factory.checkbox.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
