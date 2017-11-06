package javaExercise3;

public class Person {
    private Integer id;
    private String SurName;

    public Person(Integer id, String surName) {
        this.id = id;
        SurName = surName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSurName() {
        return SurName;
    }

    public void setSurName(String surName) {
        SurName = surName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", SurName='" + SurName + '\'' +
                '}';
    }
}