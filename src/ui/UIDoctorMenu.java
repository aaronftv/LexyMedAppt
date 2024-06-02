package ui;

import model.Doctor;

import java.util.ArrayList;
import java.util.Scanner;

public class UIDoctorMenu {

    public static ArrayList<Doctor> doctorsWithAvailableAppointments = new ArrayList<>();

    public static void showDoctorMenu() {
        int response = 0;

        do {
            System.out.println();
            System.out.println(":: Doctor Menu ::");
            System.out.println("Welcome " + UIMenu.loggedDoctor.getName());
            System.out.println("1. Add Available Appointment");
            System.out.println("2. My Scheduled Appointments");
            System.out.println("0. Logout");

            Scanner sc = new Scanner(System.in);
            response = Integer.parseInt(sc.nextLine());

            switch(response) {
                case 1 -> { showAddAvailableAppointmentsMenu(); }
                case 2 -> System.out.println();
            }

        } while(response != 0);
    }

    private static void showAddAvailableAppointmentsMenu() {
        int response = 0;
        do {
            System.out.println();
            System.out.println(":: Add Available Date ::");
            System.out.println(":: Select a Month: ");

            for (int i = 0; i < 3; i++) {
                int j = i + 1;
                System.out.println(j + ". " + UIMenu.MONTHS[i]);
            }
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.parseInt(sc.nextLine());

            if(response > 0 && response < 4) {
                int selectedMonth = response;
                System.out.println(selectedMonth + " . " + UIMenu.MONTHS[selectedMonth-1]);
                System.out.println("Insert the date for the available slot: [mm/dd/yyyy]");
                String date = sc.nextLine();
                System.out.println("The entered date is: " + date + "\r\n1. Confirm\r\n2. Change");
                int dateConfirmResponse = Integer.parseInt(sc.nextLine());
                if (dateConfirmResponse == 2) continue;

                int responseTime = 0;
                String time = "";
                do {
                    System.out.println("Insert the available time for date: " + date + " time format: HH:mm");
                    time = sc.nextLine();
                    System.out.println("The entered time is: " + time + "\r\n1. Confirm\r\n2. Change");
                    responseTime = Integer.parseInt(sc.nextLine());
                } while (responseTime == 2);

                UIMenu.loggedDoctor.addAvailableAppointment(date, time);
                checkDoctorAvailableAppointment(UIMenu.loggedDoctor);
                System.out.println("The available appointment was added to the list!");

            }
        } while (response != 0);
    }

    private static void checkDoctorAvailableAppointment(Doctor doctor) {
        if (doctor.getAvailableAppointments().size() > 0
                && !doctorsWithAvailableAppointments.contains(doctor)) {
            doctorsWithAvailableAppointments.add(doctor);
        }
    }
}
