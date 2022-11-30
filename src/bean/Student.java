package bean;

public class Student  extends Person {
    private int scholarship ;
    private String schoolName;

    public Student() {
    }

    public Student(int scholarship, String schoolName) {
        this.scholarship = scholarship;
        this.schoolName = schoolName;
    }

    public int getScholarship() {
        return scholarship;
    }

    public void setScholarship(int scholarship) {
        this.scholarship = scholarship;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public String toString() {
        return "scholarship=" + scholarship + ", schoolName='" + schoolName;
    }
}
