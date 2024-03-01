public class Student extends Person {
    public String major;
    public double gpa;
    
    public Student(String name, int age, String address, String major, double gpa) {
        super(name, age, address);
        this.major = major;
        this.gpa = gpa;
    }
    
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGpa() {
        return gpa;
    }

    public String getMajor() {
        return major;
    }

    public String toString() {
        return super.toString() + "\n" + "Major: " + major + "\n" + "GPA: " + gpa;
    }

}
