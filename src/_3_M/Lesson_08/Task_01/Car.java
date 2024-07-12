package _3_M.Lesson_08.Task_01;

public class Car {
    public String Name, color, model;
    public Car
            (){}

    public Car(String name, String color, String model) {
        Name = name;
        this.color = color;
        this.model = model;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
