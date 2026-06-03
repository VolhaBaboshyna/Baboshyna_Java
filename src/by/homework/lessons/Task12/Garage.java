package by.homework.lessons.Task12;

public class Garage<T extends Vehicle> {
    private String name;
    private int emissions;
    private T transport;

    public Garage(String name, int emissions) {
        this.name = name;
        this.emissions = emissions;
    }

    public Garage(T transport) {
        this.transport = transport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmissions() {
        return emissions;
    }

    public void setEmissions(int emissions) {
        this.emissions = emissions;
    }

    Boolean isEntryPermitted() {
        boolean isEntryPermitted;
        if (getEmissions() > 100) {
            isEntryPermitted = false;
        } else {
            isEntryPermitted = true;
        }
        return isEntryPermitted;
    }

    String entryPermition(boolean isEntryPermitted) {
        String result;
        if (isEntryPermitted == false) {
            result = "Транспортное средство не допущено в гараж. Уровень выброса превышает норму.";
        } else {
            result = "Транспортное средство допущено в гараж. Уровень выброса не превышает норму.";
        }
        return result;
    }

}
