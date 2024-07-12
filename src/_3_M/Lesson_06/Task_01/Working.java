package _3_M.Lesson_06.Task_01;

import java.util.LinkedList;
import java.util.Queue;

public class Working {
    public static void main(String[] args) {
        Queue<Integer>integers=new LinkedList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);
        integers.add(7);
        integers.add(8);
        integers.add(9);
        integers.add(10);
        System.out.println(integers);
        integers.remove();
        integers.add(100);
        System.out.println(integers);
    }
}
