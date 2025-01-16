package design.Factory.factory;

import design.Factory.buttons.Button;
import design.Factory.buttons.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
