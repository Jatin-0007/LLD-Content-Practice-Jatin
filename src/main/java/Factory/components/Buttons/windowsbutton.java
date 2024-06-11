package Factory.components.Buttons;

public class windowsbutton implements button{

    @Override
    public void createbutton() {
        System.out.println("windows button created");
    }

    @Override
    public void showbutton() {
        System.out.println("windows button showed");
    }
}
