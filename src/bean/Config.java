package bean;

import utill.FileUtility;

import java.io.Serializable;

public class Config implements Serializable {
    private static Config config = null;
    private Student[] student = new Student[0];
    private Teacher[] teacher = new Teacher[0];
    private static boolean loggedIn;

    public static void save() {
        FileUtility.writeObjToFile(Config.instance(), "app.obj");
    }

    public static void initialize() throws Exception {
        Object obj = FileUtility.readObject("app.obj");
        if (obj == null) {
            return;
        }
        if (obj instanceof Config) {
            config = (Config) obj;

        }
    }


    public Student[] getStudent() {
        return student;
    }

    public void setStudent(Student[] student) {
        this.student = student;
    }

    public Teacher[] getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher[] teacher) {
        this.teacher = teacher;
    }

    public void appendStudent(Student s) {
        Student[] newStudent = new Student[student.length + 1];
        for (int i = 0; i < student.length; i++) {
            newStudent[i] = student[i];
        }
        newStudent[newStudent.length - 1] = s;
        student = newStudent;


    }

    public void appendTeacher(Teacher s) {
        Teacher[] newTeacher = new Teacher[teacher.length + 1];
        for (int i = 0; i < teacher.length; i++) {
            newTeacher[i] = teacher[i];
        }
        newTeacher[newTeacher.length - 1] = s;
        teacher = newTeacher;


    }

    public static Config instance() {
        if (config == null) {
            config = new Config();
        }
        return config;

    }

    public static Config getConfig() {
        return config;
    }

    public static void setConfig(Config config) {
        Config.config = config;
    }

    public static boolean isLoggedIn() {
        return loggedIn;
    }

    public static void setLoggedIn(boolean loggedIn) {
        Config.loggedIn = loggedIn;
    }
}
