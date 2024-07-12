package _3_M.Lesson_08.Task_02;

public class User implements Cloneable{
    public String name, phone;
    public Enum Role;

    public User() {
    }

    public User(String name, String phone, Enum role) {
        this.name = name;
        this.phone = phone;
        Role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Enum getRole() {
        return Role;
    }

    public void setRole(Enum role) {
        Role = role;
    }
}
