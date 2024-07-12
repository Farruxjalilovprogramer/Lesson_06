package _3_M.Lesson_01.Task_03;

public class Home  {
    public int Qavat;
    public String Rangi;
    public  int RoomCount;
    public String PersonName;
public Home(){}
    public Home(int qavat, String rangi, int roomCount, String personName) {
        Qavat = qavat;
        Rangi = rangi;
        RoomCount = roomCount;
        PersonName = personName;
    }

    public int getQavat() {
        return Qavat;
    }

    public void setQavat(int qavat) {
        Qavat = qavat;
    }

    public String getRangi() {
        return Rangi;
    }

    public void setRangi(String rangi) {
        Rangi = rangi;
    }

    public int getRoomCount() {
        return RoomCount;
    }

    public void setRoomCount(int roomCount) {
        RoomCount = roomCount;
    }

    public String getPersonName() {
        return PersonName;
    }

    public void setPersonName(String personName) {
        PersonName = personName;
    }
}
