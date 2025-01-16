package design.Factories.factories;

import design.Factories.buttons.Button;
import design.Factories.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
