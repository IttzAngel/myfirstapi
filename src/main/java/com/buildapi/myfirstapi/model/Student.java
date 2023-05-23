package com.buildapi.myfirstapi.model;
// POJO - plain old java object - model
public class Student {

    private Long id;
    private String name;
    private String picture; //https://www.zipcodewilmington.com/hubfs/SI-Images/our-team/Mikaila.jpg

    public Student(){
    }

    public Student(Long id, String name, String picture) {
        this.id = id;
        this.name = name;
        this.picture = picture;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", picture='" + picture + '\'' +
                '}';
    }
}
