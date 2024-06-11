package Prototype;

public class Student implements prototye<Student> {

    private int age;
    private String name;
    private double psp;
    private String city;
    private String batch;
    private double avgPsp;

    public Student(){   // default constructor

    }

    public Student(Student student){       //copy constructor
        this.age = student.age;
        this.name = student.name;
        this.psp = student.psp;
        this.city = student.city;
        this.batch = student.batch;
        this.avgPsp = student.avgPsp;


    }

    @Override
    public Student clone(){
        return new Student(this);
    }

    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setPsp(double psp){
        this.psp = psp;
    }

    public void setCity(String city){
        this.city = city;
    }

    public void setBatch(String batch){
        this.batch = batch;
    }

    public void setAvgPsp(double avgPsp){
        this.avgPsp = avgPsp;
    }
}
