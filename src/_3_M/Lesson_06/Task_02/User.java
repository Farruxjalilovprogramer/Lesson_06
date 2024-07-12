package _3_M.Lesson_06.Task_02;

public class User {
    public String Name;
    public String Phone;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public User(){}
    public User(String name, String phone) {
        Name = name;
        Phone = phone;
    }
}
