package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {

    private String specialty;
    private ArrayList<Appointment> availableAppointments = new ArrayList<>();

    public Doctor(String name, String email) {
        super(name, email);
    }

    public Doctor(String name, String email, String specialty) {
        super(name, email);
        this.specialty = specialty;
    }

    //Behaviors
    public void showName() {
        System.out.println("model.Doctor's name is: " + getName());
    }
    public void showId() {
        System.out.println("model.Doctor's ID: " + getId());
    }

    //Getters and Setters
    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public void addAvailableAppointment(Date date, String time) {
        this.availableAppointments.add(new Doctor.Appointment(date, time));
    }

    public void addAvailableAppointment(String date, String time) {
        this.availableAppointments.add(new Doctor.Appointment(date, time));
    }

    public ArrayList<Appointment> getAvailableAppointments() {
        return availableAppointments;
    }

    @Override
    public String toString() {
        return super.toString() + "\r\nSpecialty: " + specialty + "\r\nAvailable Appointments: " + availableAppointments.toString();
    }

    @Override
    public void showUserData() {
        System.out.println("Hospital: UT Health");
        System.out.println("Department: Traumatology");
        System.out.println();
    }

    //Adding a static nested class like below makes sense because of the business need.
    //Only model.Doctor can create/determine what are the available appointments
    public static class Appointment {
        private int id;
        private Date date;
        private String time;
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");

        public Appointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public Appointment(String date, String time) {
            try {
                this.date = format.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
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

        public String getDateAsString() {
            return format.format(date);
        }

        public void setDate(String date) {
            try {
                this.date = format.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
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

