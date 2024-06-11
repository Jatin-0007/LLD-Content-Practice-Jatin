package dev.jatin.Methodoverriding;

public class Client {

    public static void main(String[] args) {
        B a = new D();
        a.display();
        a.display("jatin");
    }
}
