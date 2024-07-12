package _3_M.Lesson_05.Task_02;

import java.util.TreeSet;

public class Working {
    public static void main(String[] args) {
        TreeSet<Integer>integers=new TreeSet<>();
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
        for (int a:integers) {
            System.out.println(a);
        }
    }
}
