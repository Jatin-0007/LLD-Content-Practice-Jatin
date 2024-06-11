package Factory.components.Buttons;

public class androidbutton implements button{

    @Override
    public void createbutton() {
        System.out.println("androidbutton created");
    }

    @Override
    public void showbutton() {
        System.out.println("androidbutton showed");
    }
}
