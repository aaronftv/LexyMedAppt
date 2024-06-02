package ui;

import model.Doctor;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UIPatientMenu {
    public static void showPatientMenu() {
        int response = 0;
        do {
            System.out.println();
            System.out.println("Patient");
            System.out.println("Welcome " + UIMenu.loggedPatient.getName());
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Logout");

            Scanner sc = new Scanner(System.in);
            response = Integer.parseInt(sc.nextLine());

            switch (response) {
                case 1 -> showBookAppointmentMenu();
                case 2 -> showMyAppointments();
                case 0 -> UIMenu.showMenu();
            }

        } while (response != 0);
    }

    private static void showBookAppointmentMenu() {
        int response = 0;
        do {
            System.out.println();
            System.out.println(":: Book an Appointment ::");
            System.out.println(":: Select a date: ");
            //Date list enumeration
            //Selected date index
            //[doctors]
            // 1.- doctor1
                // - 1 date1
                // - 2 date2
            // 2.- doctor2
            // 3.- doctor3
            Map<Integer,Map<Integer, Doctor>> doctors = new TreeMap<>();
            int k = 0;
            for (int i = 0; i < UIDoctorMenu.doctorsWithAvailableAppointments.size(); i++) {
                Doctor currentDoctor =  UIDoctorMenu.doctorsWithAvailableAppointments.get(i);
                ArrayList<Doctor.Appointment> availableAppointemts = currentDoctor.getAvailableAppointments();

                Map<Integer, Doctor> doctorAppointments = new TreeMap<>();

                for (int j = 0; j < availableAppointemts.size(); j++) {
                    k++; //I think this would go outside this for, or maybe after doctors.put? or maybe not
                    System.out.println(k + ". " + availableAppointemts.get(j).getDateAsString());
                    doctorAppointments.put(j, currentDoctor);
                    doctors.put(k, doctorAppointments);
                }
            }
            Scanner sc = new Scanner(System.in);
            int responseSelectedDate = Integer.parseInt(sc.nextLine());

            Map<Integer, Doctor> doctorAvailableSelected = doctors.get(responseSelectedDate);
            Integer apptIndex = 0;
            Doctor selectedDoctor = new Doctor("","");

            for (Map.Entry<Integer, Doctor> doc : doctorAvailableSelected.entrySet()) {
                apptIndex = doc.getKey();
                selectedDoctor = doc.getValue();
            }

            System.out.println(selectedDoctor.getName() +
                    ". Date: " + selectedDoctor.getAvailableAppointments().get(apptIndex).getDateAsString() +
                    ". Time: " + selectedDoctor.getAvailableAppointments().get(apptIndex).getTime()
            );
            System.out.println("Confirm your appointment: \r\n1. Confirm \r\n2. Change" );
            response = Integer.parseInt(sc.nextLine());
            if (response == 1) {
                UIMenu.loggedPatient.addAppointmentDoctors(selectedDoctor,
                        selectedDoctor.getAvailableAppointments().get(apptIndex).getDate(),
                        selectedDoctor.getAvailableAppointments().get(apptIndex).getTime());
                response = 0;
                showPatientMenu();
            }

        } while (response != 0);
    }

    private static void showMyAppointments() {
        int response = 0;
        do {
            System.out.println(":: My Appointments ::");
            if(UIMenu.loggedPatient.getAppointmentDoctors().size() == 0) {
                System.out.println("YOU DON'T HAVE SCHEDULED APPOINTMENTS");
                break;
            }
            int j = 0;
            for (int i = 0; i < UIMenu.loggedPatient.getAppointmentDoctors().size(); i++) {
                j = i + 1;
                System.out.println(j + ". " +
                    "Date: " + UIMenu.loggedPatient.getAppointmentDoctors().get(i).getDate() +
                    " Time: " + UIMenu.loggedPatient.getAppointmentDoctors().get(i).getTime() +
                    "\r\nDoctor: " +  UIMenu.loggedPatient.getAppointmentDoctors().get(i).getDoctor().getName()
                );
            }
            System.out.println("0. Return");
        } while (response != 0);
    }
}
