package design.Factories.factories;

import design.Factories.buttons.Button;
import design.Factories.buttons.WindowsButton;
import design.Factories.checkboxes.Checkbox;
import design.Factories.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
