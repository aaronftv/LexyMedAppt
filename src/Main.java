import java.util.Date;

import static ui.UIMenu.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //showMenu();

        Doctor myDoctor = new Doctor("Aaron D. Fuentevilla, MD", "Orthopedic Surgeon");
        myDoctor.showName();
        myDoctor.showId();;
        myDoctor.addAppointment(new Date(), "4pm");
        myDoctor.addAppointment(new Date(), "10am");
        myDoctor.addAppointment(new Date(), "1pm");
        System.out.println(myDoctor.getAppointments());

        for (Doctor.Appointment appointment : myDoctor.getAppointments()) {
            System.out.println(appointment.getDate() + " " + appointment.getTime());
        }

        Doctor yourDoctor = new Doctor("Mari Bee", "Prosthodontist");
        yourDoctor.showName();
        yourDoctor.showId();

        Doctor theDoctor = new Doctor();
        System.out.println(theDoctor.id);

        Patient patient = new Patient("Lola", "lolalaloca@hotmail.com");
        patient.setWeight(60.5);
        patient.setHeight(1.65);

        patient.setPhoneNumber("1234567890 ");
        System.out.println(patient.getWeight());
        System.out.println(patient.getHeight());
        System.out.println(patient.getPhoneNumber());

        System.out.println(Day.TUESDAY);
        System.out.println(Day.TUESDAY.getSpanish());
    }
}