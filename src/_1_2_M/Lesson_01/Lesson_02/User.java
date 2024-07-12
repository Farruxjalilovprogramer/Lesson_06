package _1_2_M.Lesson_01.Lesson_02;

public class User {
    public String name;
    public String lastname;
    public String Phone_number ;
    public int age;
    public boolean isMale;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone_number() {
        return Phone_number;
    }

    public void setPhone_number(String phone_number) {
        Phone_number = phone_number;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean getIsMale() {
        return isMale;
    }

    public void setIsMale(boolean isMale) {
        this.isMale = isMale;
    }

    public User(String name, String lastname, String phone_number, int age, boolean isMale) {
        this.name = name;
        this.lastname = lastname;
        Phone_number = phone_number;
        this.age = age;
        this.isMale = isMale;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", Phone_number='" + Phone_number + '\'' +
                ", age=" + age +
                ", isMale=" + isMale +
                '}';
    }
}
