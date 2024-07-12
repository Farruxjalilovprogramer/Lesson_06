package _3_M.Lesson_08.Task_01;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Working {
    public static void main(String[] args) {
        Car car=new Car("Porsch","Red","911");
        Car car1=new Car("Porsch","Red","911");
        Car car2=new Car("Porsch","Red","911");
        List<Car>list=new LinkedList<>();
        list.add(car);
        list.add(car1);
        list.add(car2);
        for (Car a:list) {
            System.out.println(a);
        }
    }
}
