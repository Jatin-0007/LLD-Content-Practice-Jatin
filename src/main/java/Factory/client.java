package Factory;

import Factory.components.Buttons.button;

public class client {
    public static void main(String[] args) {

        Flutter flutter = new Flutter();
        UIFactory uiFactory = flutter.getUIFactory(Supportedplatform.WINDOWS);

        button bt = uiFactory.getButton();
        bt.createbutton();
        bt.showbutton();
    }
}
