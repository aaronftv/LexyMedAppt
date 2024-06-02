import model.*;
import java.util.Date;
import static ui.UIMenu.showMenu;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        showMenu();

        //Some Quick Informal Testing:
        /*Doctor myDoctor = new Doctor("Aaron D. Fuentevilla, MD", "aaron@yahoo.com","Orthopedic Surgeon");
        myDoctor.showName();
        myDoctor.showId();;
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");
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

        User nurse = new Nurse("Lulu","lulu@email.com");
        nurse.showUserData();

        User anonimous = new User("Don Nadie","nadie@email.com") {
            @Override
            public void showUserData() {
                System.out.println("Voila!");
            }
        };
        anonimous.showUserData();
        System.out.println(anonimous.getName());
        System.out.println();

        ISchedulable specialSchedulable = new ISchedulable() {
            @Override
            public void schedule(Date date, String time) {
                System.out.println("Special Date: " + date + " and Time: " + time);
            }
        };
        specialSchedulable.schedule(new Date(), "11:11a");
        System.out.println();

        ISchedulable schedulable = new AppointmentDoctor();
        schedulable.schedule(new Date(), "12:00pm");
        System.out.println();

        //Emum
        System.out.println(Day.TUESDAY);
        System.out.println(Day.TUESDAY.getSpanish());*/
    }
}