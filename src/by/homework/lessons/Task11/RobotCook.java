package by.homework.lessons.Task11;

public class RobotCook implements Robot {
    private String model;
    private int powerConsumption;
    private String countryOfManufacture;
    private String cookingUnit;
    private boolean isOn;


    public RobotCook(String model, int powerConsumption, String countryOfManufacture, String cookingUnit, boolean isOn) {
        this.model = model;
        this.powerConsumption = powerConsumption;
        this.countryOfManufacture = countryOfManufacture;
        this.cookingUnit = cookingUnit;
        this.isOn = isOn;
    }


    public boolean isIsOn() {
        return isOn;
    }

    public String getCookingUnit() {
        return cookingUnit;
    }

    public String getCountryOfManufacture() {
        return countryOfManufacture;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public void setCountryOfManufacture(String countryOfManufacture) {
        this.countryOfManufacture = countryOfManufacture;
    }

    public void setCookingUnit(String cookingUnit) {
        this.cookingUnit = cookingUnit;
    }

    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }

    @Override
    public void repair() {
        System.out.println("Робот-повар отремонтирован");
    }

    @Override
    public void turnOn() {
        if (isOn == false) {
            isOn = true;
        } else if (isOn == true) {
            System.out.println("Робот-повар уже включен");
        }
    }

    @Override
    public void turnOff() {
        if (isOn == true) {
            isOn = false;
        } else if (isOn == false) {
            System.out.println("Робот-повар уже включен");
        }
    }

    @Override
    public String uniquePossibility() {
        String result = "Робот-повар " + model + " готовит";
        return result;
    }

    public String toString() {
        String result = "Модель: " + model + ", Потребляемая мощность: " + powerConsumption + ", Страна производитель: "
                + countryOfManufacture + ", Агрегат для приготовления  " + cookingUnit + ", Включен: " + isOn;
        return result;
    }

    public String createItem() {
        String result = "Робот-повар готовит пищу";
        return result;
    }
}
