package edu.wctc;

public class Person {
    private String lastName;
    private String zipCode;
    private String firstName;
    private String email;
    private int age;
    private boolean missesProperties;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMissesProperties() {
        return missesProperties;
    }

    public void setMissesProperties(boolean missesProperties) {
        this.missesProperties = missesProperties;
    }
}
