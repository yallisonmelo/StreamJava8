package entity;

import enums.Sex;

public class Person {

    private Integer id;
    private String name;
    private String email;
    private String address;
    private Boolean active;
    private Sex sex;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Person(Integer id, String name, String email, String address, Boolean active, Sex sex) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.active = active;
        this.sex = sex;
    }

    public Person(Integer id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
}
