package _3_M.Lesson_03.Task_02;

import javax.swing.*;
import java.util.*;

public class Working {


    public static void main(String[] args) {
        ArrayList<String> Name = new ArrayList<>();
        ArrayList<String> Name1 = new ArrayList<>();
        Name.add("");
        Name.add("");
        Name.add("");
        Name.add("");
        Name.add("");
        Name.add("");
        Name.add("");
        Name.add("");
        Name.add("");
        Name.add("");
        Name.add("");
        Name.add("");
        Name.add("");
        Name.add("");
        Name.add("");
        Name.add("");
        Name.add("");
        Name.add("");
        Name.add("");
        Name.add("Z");

        for (int i = 0; i < Name.size(); i++) {
            Boolean b=false;
            for (int j = 0; j <= Name.size(); j++) {

                if (Name.get(i).equals (Name.get(j))&&i!=j){
                    Name.remove(i);

                }
            }
                if(!b){
                    Name1.add(Name.get(i));
                }


        }
        System.out.println(Name1.size());
        System.out.println(Name1.toString());


    }
}
