package model;

public class Patient extends User {

//    private int id;
//    private String name;
//    private String email;
//    private String address;
//    private String phoneNumber;

    private String birthday;
    private double weight;
    private double height;
    private String bloodType;

    public Patient(String name, String email) {
        super(name, email);
    }

    //Getters & Setters
    public String getWeight() {
        return weight + " Kg.";
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height + " Mts.";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    @Override
    public String toString() {
        return super.toString() + "\r\nAge: " + birthday+ "\r\nWeight: " + getWeight() + "\r\nHeight: " + getHeight() + "\r\nBlood Type: " + bloodType;
    }
}
