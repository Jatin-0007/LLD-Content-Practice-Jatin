package interfaces;

public class cat implements Animal{

    @Override
    public void eat() {
        System.out.println("cat is eating");
    }

    @Override
    public void walk() {
        System.out.println("cat is walking");
    }

    @Override
    public void run() {
        System.out.println("cat is running");
    }
}
