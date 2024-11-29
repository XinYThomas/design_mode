package design.factory.checkbox;

public class MacOSCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("MacOS Checkbox");
    }
}
