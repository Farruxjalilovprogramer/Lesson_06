package _1_2_M.Lesson_01.Task_01.Task_02;

public class Person {
    protected String name;
    protected String phone;
    private String password;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", paswword='" + password + '\'' +
                '}';
    }
    public static void changePassword(int oldPassword,int newPassword){
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

    public String getPaswword() {
        return password;
    }

    public void setPaswword(String paswword) {
        this.password = paswword;
    }
}
