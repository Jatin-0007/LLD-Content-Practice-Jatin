package Prototype;

public class Client {

    public static void main(String[] args) {

        StudentRegistry studentRegistry  = new StudentRegistry();
        Student aprilBatch = new Student();
        aprilBatch.setAvgPsp(85.8);
        aprilBatch.setBatch("APril Batch 2024");
        studentRegistry.register("aprilBatch2024", aprilBatch);

        Student jatin = studentRegistry.get("aprilBatch2024").clone();
        jatin.setName("Jatin");
        jatin.setAge(25);
        jatin.setPsp(66.76);
        jatin.setCity("Allahabad");

        System.out.println("SEBUG");


    }
}
