package ui;
import java.util.Scanner;

public class UIMenu {

    public static final String[] MONTHS = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
    };
    public static void showMenu() {
        System.out.println();
        System.out.println("Welcome to My Appointments");
        System.out.println("Select desired option: ");

        int response = 0;
        do {
            System.out.println("1. model.Doctor");
            System.out.println("2. model.Patient");
            System.out.println("0. Exit");

            Scanner sc = new Scanner(System.in);
            response = Integer.parseInt(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println(":: model.Doctor Menu");
                    break;
                case 2:
                    response = 0;
                    showPatientMenu();
                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        } while (response != 0);
    }

    static void showPatientMenu() {
        int response = 0;
        do {
            System.out.println();
            System.out.println("model.Patient Menu: ");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return to Main menu");

            Scanner sc = new Scanner(System.in);
            response = Integer.parseInt(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println(":: Book an appointment");
                    for (int i = 0; i < 3; i++) {
                        System.out.println(i + 1 + ". " + MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println(":: My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        } while (response != 0);
    }
}
