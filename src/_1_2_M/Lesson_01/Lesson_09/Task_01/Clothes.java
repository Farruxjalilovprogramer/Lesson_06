package _1_2_M.Lesson_01.Lesson_09.Task_01;

public class Clothes {
    private   String color;
    private Size size;

    public Clothes(String color, Size size) {
        this.color = color;
        this.size = size;
    }
    public void displey(){
        System.out.println("color :"+color);
        System.out.println("Size :"+size);
    }
}
