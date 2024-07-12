package _3_M.Lesson_04.Task_01;

import java.util.LinkedList;

public class W {
    public static void main(String[] args) {

        LinkedList<String>names=new LinkedList<>();
        names.add("Farrux");
        names.add("A");
        names.add("A");
        names.add("A");
        names.add("A");
        names.add("A");
        names.add("A");
        names.add("A");
        names.add("A");
        names.add("A");
        names.add("A");
        LinkedList<String>names1=new LinkedList<>();
        names.add("b");
        names.add("b");
        names.add("b");
        names.add("b");
        names.add("b");
        names.addAll(names1);
        names.add("Farrux");
        System.out.println(names.toString());
    }
}
