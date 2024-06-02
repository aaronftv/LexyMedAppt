package model;

public class Nurse extends User {

    private String specialty;

    public Nurse(String name, String email) {
        super(name, email);
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public void showUserData() {
        System.out.println("Hospital: UT Health");
        System.out.println("Department: Oncology");
        System.out.println("Department: Nutrition");
        System.out.println("Department: Pediatrics");
        System.out.println();
    }
}
