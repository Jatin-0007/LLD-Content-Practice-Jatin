package Factory;

import Factory.components.Buttons.androidbutton;
import Factory.components.Buttons.button;

public class androidUIfactory implements UIFactory{

    @Override
    public button getButton() {
        return new androidbutton();
    }
}
