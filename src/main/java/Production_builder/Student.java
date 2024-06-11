package Production_builder;

public class Student {

    String name;
    int age;
    String gender;
    double psp;
    int GradYear;
    String UnivName;

    private Student(Builder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.gender = builder.gender;
        this.psp = builder.psp;
        this.GradYear = builder.GradYear;
        this.UnivName = builder.UnivName;
    }

    // method for builder object
    public static Builder getbuilder(){
        return new Builder();
    }


    // inner or nested class builder
    public static class Builder{

        String name;
        int age;
        String gender;
        double psp;
        int GradYear;
        String UnivName;

        public Builder setName(String name){
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public Builder setGradYear(int GradYear) {
            this.GradYear = GradYear;
            return this;
        }

        public Builder setUnivName(String UnivName) {
            this.UnivName = UnivName;
            return this;
        }

        public String getName(){
            return name;
        }

        public int getAge(){
            return age;
        }

        public String getGender(){
            return gender;
        }

        public double getPsp(){
            return psp;
        }

        public int getGradYear(){
            return GradYear;
        }

        public String getUnivName(){
            return UnivName;
        }

        // method for student object
        public Student build(){
            if(this.getGradYear()<=2020){
                throw new RuntimeException("Grad Year must be greater than 2020");
            }
            if(this.age<=20){
                throw new RuntimeException("Age must be greater than 20");
            }
            return new Student(this);
        }
    }


}
