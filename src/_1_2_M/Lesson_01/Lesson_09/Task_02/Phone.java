package _1_2_M.Lesson_01.Lesson_09.Task_02;

public class Phone {
    private String name;
    private Model model;
    private int storage;

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", model=" + model +
                ", storage=" + storage +
                '}';
    }

    public Phone(){}

    public Phone(String name, Model model, int storage) {
        this.name = name;
        this.model = model;
        this.storage = storage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }
}
