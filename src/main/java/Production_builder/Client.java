package Production_builder;

public class Client {
    public static void main(String[] args) {
       Student student = Student.getbuilder()
               .setName("Jatin")
               .setAge(25)
               .setGradYear(2023)
               .setPsp(98.99)
               .build();

       System.out.println("All fine");

    }
}
