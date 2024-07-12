package _3_M.Lesson_03.Task_01;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Working {
    public static void main(String[] args) {
        List<Integer>integers=new LinkedList<>();
        for (int i = 0; i <100; i++) {
            integers.add(i);

        } System.out.println(integers.toString());
        Random random=new Random();
        random.nextInt(100);
    }
}
