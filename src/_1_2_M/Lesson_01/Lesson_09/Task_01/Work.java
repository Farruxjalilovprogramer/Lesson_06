package _1_2_M.Lesson_01.Lesson_09.Task_01;

public class Work {
    public static void main(String[] args) {
            Clothes clothes=new Clothes("red",Size.XL);
            Clothes clothes1=new Clothes("black",Size.X);
             var shirtVar= clothes;
             var pantsVar= clothes1;

             shirtVar.displey();
             pantsVar.displey();
    }
}
