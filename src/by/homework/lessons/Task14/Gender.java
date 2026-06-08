package by.homework.lessons.Task14;

public enum Gender {
    MALE ("Мужской"),
    FEMALE ("Женский");

    private String type;

    Gender (String type) {
        this.type=type;
    }

    public String getGender() {
        return type;
    }
}
