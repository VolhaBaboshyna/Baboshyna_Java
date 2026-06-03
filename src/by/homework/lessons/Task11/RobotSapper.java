package by.homework.lessons.Task11;

public class RobotSapper implements Robot, RobotEngineer {
    public int powerConsumption;
    public int mineClearingAgent;
    public String material;
    public boolean isOn;
    private String model;

    public RobotSapper(String model, int powerConsumption, int mineClearingAgent, String material, boolean isOn) {
        this.model = model;
        this.powerConsumption = powerConsumption;
        this.mineClearingAgent = mineClearingAgent;
        this.material = material;
        this.isOn = isOn;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getMineClearingAgent() {
        return mineClearingAgent;
    }

    public void setMineClearingAgent(int mineClearingAgent) {
        this.mineClearingAgent = mineClearingAgent;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isIsOn() {
        return isOn;
    }

    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }

    @Override
    public void repair() {
        System.out.println("Робот‑сапёр модели " + model + " отремонтирован");
    }

    @Override
    public void turnOn() {
        if (isOn == false) {
            isOn = true;
        } else if (isOn == true) {
            System.out.println("Робот-сапер " + model + "  уже включен");
        }
    }

    @Override
    public void turnOff() {
        if (isOn == true) {
            isOn = false;
        } else if (isOn == false) {
            System.out.println("Робот-сапер " + model + "  уже включен");
        }
    }

    @Override
    public String uniquePossibility() {
        String result = "Робот-сапер  " + model + " разминирует бомбы";
        return result;
    }

    public String toString() {
        String result = "Модель: " + model + ", Потребляемая мощность: " + powerConsumption + ", Средство для разминирования " +
                "(шасси номер)" + mineClearingAgent + ", Материал: " + material + ", Включен: " + isOn;
        return result;
    }

    public String createItem() {
        String result = "Робот-сапер создаёт приспособление для разминирования";
        return result;
    }
}
