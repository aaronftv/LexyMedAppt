package model;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {

    private String speciality;
    private ArrayList<Appointment> appointments = new ArrayList<>();

    public Doctor(String name, String email, String speciality) {
        super(name, email);
        this.speciality = speciality;
        System.out.println("New model.Doctor's name is: " + getName() + " - Speciality: " + this.speciality);
    }

    //Behaviors
    public void showName() {
        System.out.println("model.Doctor's name is: " + getName());
    }
    public void showId() {
        System.out.println("model.Doctor's ID: " + getId());
    }

    //Getters and Setters
    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void addAppointment(Date date, String time) {
        this.appointments.add(new Doctor.Appointment(date, time));
    }

    public ArrayList<Appointment> getAppointments() {
        return appointments;
    }

    @Override
    public String toString() {
        return super.toString() + "\r\nSpeciality: " + speciality + "\r\nAvailable Appointments: " + appointments.toString();
    }

    //Adding a static nested class like below makes sense because of the business need.
    //Only model.Doctor can create/determine what are the available appointments
    public static class Appointment {
        private int id;
        private Date date;
        private String time;

        public Appointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "\r\nDate: " + date + "\r\nTime: " + time;
        }
    }
}

