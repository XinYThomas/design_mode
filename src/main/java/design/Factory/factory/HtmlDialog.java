package design.Factory.factory;

import design.Factory.buttons.Button;
import design.Factory.buttons.HtmlButton;

public class HtmlDialog extends Dialog{
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
