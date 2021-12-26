package uz.developer.birinchi.model;

public class Student {
    private int id;

    private String name;

    private String lastname;

    private String course;

    public Student(int id, String name, String lastname, String course) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
