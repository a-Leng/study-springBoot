package com.example.demo3.entity;

public class UserEntity {
    private int id;
    private String name;
    private String des;

    public UserEntity(int id, String name, String des) {
        this.id = id;
        this.name = name;
        this.des = des;
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

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", des='" + des + '\'' +
                '}';
    }
}
