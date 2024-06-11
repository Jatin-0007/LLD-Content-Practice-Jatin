package Factory;

import Factory.components.Buttons.button;
import Factory.components.Buttons.windowsbutton;

public class windowsUIfactory implements UIFactory{

    @Override
    public button getButton() {
        return new windowsbutton();
    }
}
