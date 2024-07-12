package _3_M.Lesson_06.Task_02;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Working {
    public static void main(String[] args) {
        User user=new User("Bob","iphon");
        User user1=new User("Den","samsung");
        User user2=new User("John","redmi");

        Queue<User>users=new PriorityQueue<>();
        users.add(user);
        users.add(user1);
        users.add(user2);
        System.out.println(users.peek());
        System.out.println(users.poll());
        System.out.println(users);

    }
}
