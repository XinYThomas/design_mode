package design.Factories.app;

import design.Factories.buttons.Button;
import design.Factories.checkboxes.Checkbox;
import design.Factories.factories.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
