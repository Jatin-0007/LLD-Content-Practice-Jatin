package builder;

public class Student {

    String name;
    String batch;
    int age;
    double psp;
    String univName;
    int gradYear;

public Student(Builder builder) {
    if(builder.age<=20){
        throw new RuntimeException("Age must me Greater than 20");
    }
    if(builder.gradYear<=2020){
        throw new RuntimeException("Grad Year must me Greater than 2020");
    }
    this.name = builder.name;
    this.batch = builder.batch;
    this.age = builder.age;
    this.psp = builder.psp;
    this.univName = builder.univName;
    this.gradYear = builder.gradYear;
}


}
