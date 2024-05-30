import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    public static int doctorNo = 0;
    int id = 0;
    private String name;
    private String email;
    private String speciality;

    Doctor() {
        id = ++doctorNo;
        System.out.println("Building Doctor object.");
    }

    Doctor(String name, String speciality) {
        id = ++doctorNo;
        this.name = name;
        this.speciality = speciality;
        System.out.println("New Doctor's name is: " + this.name + " - Speciality: " + this.speciality);
    }

    //Behaviors
    public void showName() {
        System.out.println("Doctor's name is: " + name);
    }
    public void showId() {
        System.out.println("Doctor's ID: " + id);
    }

    private ArrayList<Appointment> appointments = new ArrayList<>();

    public void addAppointment(Date date, String time) {
        this.appointments.add(new Doctor.Appointment(date, time));
    }

    public ArrayList<Appointment> getAppointments() {
        return appointments;
    }
    //Adding a static nested class like below makes sense because of the business need.
    //Only Doctor can create/determine what are the available appointments
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
    }
}

