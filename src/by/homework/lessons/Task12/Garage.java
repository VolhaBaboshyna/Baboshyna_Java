package by.homework.lessons.Task12;

public class Garage<T extends Vehicle> {
    private String name;
    private int emissions;
    private T transport;

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
        if (transport.getEmissions() > 100) {
            isEntryPermitted = false;
        } else {
            isEntryPermitted = true;
        }
        return isEntryPermitted;
    }

    String entryPermition(boolean isEntryPermitted) {
        String result;
        if (!isEntryPermitted) {
            result = "Транспортное средство " + transport.getName() + " не допущено в гараж. Уровень выброса превышает норму.";
        } else {
            result = "Транспортное средство " + transport.getName() + " допущено в гараж. Уровень выброса не превышает норму.";
        }
        return result;
    }

}
