package model;

import java.util.ArrayList;
import java.util.Date;

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

    private ArrayList<AppointmentDoctor> appointmentDoctors = new ArrayList<>();
    private ArrayList<AppointmentNurse> appointmentNurses = new ArrayList<>();

    public ArrayList<AppointmentDoctor> getAppointmentDoctors() {
        return appointmentDoctors;
    }

    public void addAppointmentDoctors(Doctor doctor, Date date, String time) {
        AppointmentDoctor appointmentDoctor = new AppointmentDoctor(this, doctor);
        appointmentDoctor.schedule(date,time);
        this.appointmentDoctors.add(appointmentDoctor);
    }

    public ArrayList<AppointmentNurse> getAppointmentNurses() {
        return appointmentNurses;
    }

    public void addAppointmentNurses(Nurse nurse, Date date, String time) {
        AppointmentNurse appointmentNurse = new AppointmentNurse(this, nurse);
        appointmentNurse.schedule(date, time);
        this.appointmentNurses.add(appointmentNurse);
    }

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

    @Override
    public void showUserData() {
        System.out.println("Patient data: ");
        System.out.println("Name: " + getName());
        System.out.println("DOB: " + birthday);
        System.out.println("Patient history: ...");
        System.out.println();
    }
}
