package interfaces;

public class client {
    public static void main(String[] args) {

        Animal animal = new cat();
        Animal animal2 = new dog();

        animal.eat();
        animal.run();
        animal.walk();

        animal2.eat();
        animal2.walk();
        animal2.run();
    }
}
