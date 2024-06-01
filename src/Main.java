import model.Day;
import model.Doctor;
import model.Patient;

import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //showMenu();

        Doctor myDoctor = new Doctor("Aaron D. Fuentevilla, MD", "aaron@yahoo.com","Orthopedic Surgeon");
        myDoctor.showName();
        myDoctor.showId();;
        myDoctor.addAppointment(new Date(), "4pm");
        myDoctor.addAppointment(new Date(), "10am");
        myDoctor.addAppointment(new Date(), "1pm");
        System.out.println(myDoctor);

//        System.out.println(myDoctor.getAppointments());
//        for (model.Doctor.Appointment appointment : myDoctor.getAppointments()) {
//            System.out.println(appointment.getDate() + " " + appointment.getTime());
//        }
        System.out.println();

        Doctor yourDoctor = new Doctor("Mari Bee", "mari@yahoo.com","Prosthodontist");
        yourDoctor.showName();
        yourDoctor.showId();
        System.out.println();

        Patient patient = new Patient("Lola", "lolalaloca@hotmail.com");
        patient.setWeight(60.5);
        patient.setHeight(1.65);
        patient.setPhoneNumber("1234567890");
        System.out.println(patient.toString());
        System.out.println();

        //Emum
        System.out.println(Day.TUESDAY);
        System.out.println(Day.TUESDAY.getSpanish());
    }
}