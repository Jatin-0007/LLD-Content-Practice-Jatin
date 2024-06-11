package dev.jatin.Methodoverriding;

public class C extends B{

    void display(){
        System.out.println("C");
    }

    void display(String str){
        System.out.println("C"+str);
    }
}
