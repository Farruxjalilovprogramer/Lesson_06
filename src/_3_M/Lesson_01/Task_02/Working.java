package _3_M.Lesson_01.Task_02;

import java.util.Scanner;

public class Working {
    public static int[] a = new int[10];
    public static void main(String[] args) throws NoFoundNumberException {
        while (true) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("1-show number\n2-add number\n:");
            int s = scanner.nextInt();
            if (s == 1) {
                for (int i = 0; i < a.length; i++) {
                    System.out.println(a[i]);
                }
                main(args);
            } else if (s == 2) {
                System.out.print("write a number from 0 to 10:");
                int d=scanner.nextInt();
                if(d>0&&d<10){
                    a[d]=d;
                }else {

                    throw new NoFoundNumberException();
                }
                main(args);
            }

        }


    }
}