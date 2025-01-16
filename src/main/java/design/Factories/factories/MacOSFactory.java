package design.Factories.factories;

import design.Factories.buttons.Button;
import design.Factories.buttons.MacOSButton;
import design.Factories.checkboxes.Checkbox;
import design.Factories.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
