package _1_2_M.Lesson_01;

public class Todo {
    public String name;
    public boolean isComplete;
    public boolean isDeleted;

    @Override
    public String toString() {
        return "Todo{" +
                "name='" + name + '\'' +
                ", isComplete=" + isComplete +
                ", isDeleted=" + isDeleted +
                '}';
    }
}
