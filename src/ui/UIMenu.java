package ui;
import model.Doctor;
import model.Patient;

import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {

    public static final String[] MONTHS = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
    };
    public static Doctor loggedDoctor;
    public static Patient loggedPatient;

    public static void showMenu() {
        System.out.println();
        System.out.println("Welcome to My Appointments");

        int response = 0;
        do {
            System.out.println("\r\n:: Main Menu ::");
            System.out.println("Select desired option: ");
            System.out.println("1. Log as Doctor");
            System.out.println("2. Log as Patient");
            System.out.println("0. Exit");

            Scanner sc = new Scanner(System.in);
            response = Integer.parseInt(sc.nextLine());

            switch (response){
                case 1 ->
                    authUser(1);
                case 2 ->
                    authUser(2);
                case 0 ->
                    System.out.println("Thank you for you visit!!");
                default ->
                    System.out.println("Please select a correct answer");
            }
        } while (response != 0);
    }

    private static void authUser(int userType) {
        //userType: 1 Doctor, 2 Patient

        //Loading testing data
        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Ray Ftv", "ray@email.com"));
        doctors.add(new Doctor("Christina B.", "tina@email.com"));
        doctors.add(new Doctor("Douglas C.", "doug@email.com"));

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Aaron F.", "aaron@email.com"));
        patients.add(new Patient("Andres G.", "andy@email.com"));
        patients.add(new Patient("Martha A.", "mars@email.com"));

        boolean emailFound = false;
        do {
            System.out.println("Enter your email, format: a@a.com");
            Scanner sc = new Scanner(System.in);
            String enteredEmail = sc.nextLine();
            if (userType == 1) {
                //Query simulation
                for (Doctor d: doctors) {
                    if(d.getEmail().equals(enteredEmail)) {
                        emailFound = true;
                        //Get logged user data
                        loggedDoctor = d;
                        UIDoctorMenu.showDoctorMenu();
                    }
                }
            }

            if (userType == 2) {
                for(Patient p: patients) {
                    if(p.getEmail().equals(enteredEmail)) {
                        emailFound = true;
                        //Get logged user Data and show menu
                        loggedPatient = p;
                        UIPatientMenu.showPatientMenu();
                    }
                }
            }
            if(!emailFound) System.out.println("EMAIL NOT FOUND.");
        }while(!emailFound);
    }
}
