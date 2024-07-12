package _3_M.Lesson_05.Task_01;

import java.util.HashSet;
import java.util.Set;

public class Working {
    public static void main(String[] args) {
        Set<String>strings=new HashSet<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("z");
        for (String a:strings) {
            System.out.println(a);
        }

    }
}
