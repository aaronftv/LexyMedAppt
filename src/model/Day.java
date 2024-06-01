package model;

public enum Day {
    MONDAY("Lunes"),
    TUESDAY("Jueves"),
    FRIDAY("Viernes"),
    SATURDAY("Sábado"),
    SUNDAY("Domingo");

    private String spanish;
    private Day(String s) {
        spanish = s;
    }

    public String getSpanish() {
        return spanish;
    }
}