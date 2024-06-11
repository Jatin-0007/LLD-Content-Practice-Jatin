package builder;

public class Builder {

    String name;
    String batch;
    int age;
    double psp;
    String univName;
    int gradYear;

    public void setAge(int age) {
        this.age = age;
    }
    public void setBatch(String batch) {
        this.batch = batch;
    }
    public void setPsp(double psp) {
        this.psp = psp;
    }

    public void setUnivName(String univName) {
        this.univName = univName;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }




    public String getBatch(){
        return batch;
    }

    public int getAge(){
        return age;
    }

    public double getPsp(){
        return psp;
    }

    public String getUnivName(){
        return univName;
    }

    public int getGradYear(){
        return gradYear;
    }

}
