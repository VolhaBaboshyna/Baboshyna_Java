package by.homework.lessons.Task11;

public class RobotBuilder implements Robot, RobotEngineer {

    private String model;
    private int powerConsumption;
    private String countryOfManufacture;
    private String buildingUnit;
    private String material;
    private boolean isOn;


    public RobotBuilder(String model, int powerConsumption, String countryOfManufacture, String buildingUnit, String material,
                        boolean isOn) {
        this.model = model;
        this.powerConsumption = powerConsumption;
        this.countryOfManufacture = countryOfManufacture;
        this.buildingUnit = buildingUnit;
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

    public String getCountryOfManufacture() {
        return countryOfManufacture;
    }

    public void setCountryOfManufacture(String countryOfManufacture) {
        this.countryOfManufacture = countryOfManufacture;
    }

    public String getBuildingUnit() {
        return buildingUnit;
    }

    public void setBuildingUnit(String buildingUnit) {
        this.buildingUnit = buildingUnit;
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
        System.out.println("Робот-строитель отремонтирован");
    }

    @Override
    public void turnOn() {
        if (isOn == false) {
            isOn = true;
        } else if (isOn == true) {
            System.out.println("Робот-строитель  " + model + " уже включен");
        }
    }

    @Override
    public void turnOff() {
        if (isOn == true) {
            isOn = false;
        } else if (isOn == false) {
            System.out.println("Робот-строитель " + model + " уже включен");
        }
    }

    @Override
    public String uniquePossibility() {
        String result = "Робот-строитель " + model + " строит";
        return result;
    }

    public String toString() {
        String result = "Модель: " + model + ", Потребляемая мощность: " + powerConsumption + ", Страна производитель: "
                + countryOfManufacture + ", Агрегат для строительства " + buildingUnit + ", Материал: " + material +
                ", Включен: " + isOn;
        return result;
    }

    public String createItem() {
        String result = "Робот-строитель " + model + " создаёт бетон";
        return result;
    }

}
