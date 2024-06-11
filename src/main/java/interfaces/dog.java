package interfaces;

public class dog implements Animal{

    @Override
    public void eat() {
        System.out.println("DOg is eat");

    }

    @Override
    public void walk() {
        System.out.println("DOg is walking");
    }

    @Override
    public void run() {
        System.out.println("DOg is running");
    }
}
