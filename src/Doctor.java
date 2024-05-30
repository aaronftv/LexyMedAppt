public class Doctor {
    public static int doctorNo = 0;
    int id;
    String name;
    String speciality;

    Doctor() {
        id = doctorNo++;
        System.out.println("Constructing Doctor object.");
    }

    Doctor(String name) {
        id = ++doctorNo;
        this.name = name;
        System.out.println("New Doctor's name is: " + name);
    }

    //Behaviors
    public void showName() {
        System.out.println("Doctor's name is: " + name);
    }
    public void showId() {
        System.out.println("Doctor's ID: " + id);
    }
}

