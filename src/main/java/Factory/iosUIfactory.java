package Factory;

import Factory.components.Buttons.button;
import Factory.components.Buttons.iosbutton;

public class iosUIfactory implements UIFactory{

    @Override
    public button getButton() {
        return new iosbutton();
    }
}
