package _1_2_M.Lesson_01.Lesson_02;

public class ClassRoom {
    public int roomNumber;
    public String teacherName;
    public String teacherPhoneNumber;
    public String[] studentName;

    public ClassRoom(int roomNumber, String teacherName, String teacherPhoneNumber, String studentName) {
        this.roomNumber = roomNumber;
        this.teacherName = teacherName;
        this.teacherPhoneNumber = teacherPhoneNumber;
        this.studentName = new String[]{studentName};
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherPhoneNumber() {
        return teacherPhoneNumber;
    }

    public void setTeacherPhoneNumber(String teacherPhoneNumber) {
        this.teacherPhoneNumber = teacherPhoneNumber;
    }

    public String[] getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = new String[]{studentName};
    }
}
