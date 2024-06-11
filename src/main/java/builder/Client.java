package builder;

public class Client {

    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.setName("Jatin");
        builder.setAge(27);
        builder.setBatch("Morning 2015");
        builder.setPsp(55.98);
        builder.setUnivName("Scaler");
        builder.setGradYear(2025);

        Student student = new Student(builder);
        System.out.println("All fine");
    }
}
