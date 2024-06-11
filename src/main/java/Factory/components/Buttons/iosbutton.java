package Factory.components.Buttons;

public class iosbutton implements button{

    @Override
    public void createbutton() {
        System.out.println("ios button created");
    }

    @Override
    public void showbutton() {
        System.out.println("ios button showed");
    }
}
