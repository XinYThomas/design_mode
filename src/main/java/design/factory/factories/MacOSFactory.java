package design.factory.factories;

import design.factory.buttons.Button;
import design.factory.buttons.MacOSButton;
import design.factory.checkbox.Checkbox;
import design.factory.checkbox.MacOSCheckbox;
// 具体工厂
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
