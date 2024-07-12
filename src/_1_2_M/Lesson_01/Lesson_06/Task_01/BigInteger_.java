package _1_2_M.Lesson_01.Lesson_06.Task_01;

import java.util.*;
import java.math.BigInteger;
public class BigInteger_ {
    public static void main(String[] args) {
        Scanner asa =new Scanner(System .in);
        System.out.print("1-son:");
        BigInteger son1=asa.nextBigInteger();
        System.out.print("2-son:");
        BigInteger son2=asa.nextBigInteger();
        System.out.print("Belgi:");
        String B=asa.nextLine();
        if(B.equals("+")){
            System.out.println(son1+"+"+son2+"="+son2+son1);
        }
        else if(B.equals("-")){
            System.out.println(son1+"-"+son2+"="+son1.subtract(son2));
        }
        else if(B.equals("*")){
            System.out.println(son1+"*"+son2+"="+son1.multiply(son2));
        }
        else if(B.equals("/")){
            System.out.println(son1+"/"+son2+"="+(son1.divide(son2)));
        }
        else {
            System.out.println("Hatto");
            main(args);
        }
    }
}
