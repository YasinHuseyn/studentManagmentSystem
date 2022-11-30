package bean;

import java.util.Arrays;

public class Teacher extends Person {
    private int salary;
    private transient String schoolName;
    private Student[] students;


    public Teacher() {
    }

    public Teacher(int salary, String schoolName, Student[] students) {
        this.salary = salary;
        this.schoolName = schoolName;
        this.students = students;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "salary=" + salary +
                ", schoolName='" + schoolName + '\'' +
                ", students=" + Arrays.toString(students) +
                '}';
    }
}
