package _1_2_M.Lesson_01.Lesson_08.Task_01;

public class Work {
    public static void main(String[] args) {
        Record record = new Record("Bob", "I", 10, 100);
        if (record.Name() == null) {
            if (record.PageCount() > 0) {
                System.out.println("HATTO!!");
            }
        }
        System.out.println(record);
    }
}
