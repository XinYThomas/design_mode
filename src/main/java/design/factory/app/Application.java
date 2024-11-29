package design.factory.app;

import design.factory.buttons.Button;
import design.factory.checkbox.Checkbox;
import design.factory.factories.GUIFactory;

// 测试用例客户端代码
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
