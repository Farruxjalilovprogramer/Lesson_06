package _4_M.Lesson_06;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

    }
    public static void time(String str) throws Exception {
        LocalDate localDate=LocalDate.parse(str);
        for (int i = 0; i < 10; i++) {
            TimeUnit.MINUTES.sleep(1);
            System.out.println(LocalTime.now());
        }

    }
    public static void Format() throws Exception {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat();
        String s="2024-07-09";
        Date date=simpleDateFormat.parse(
                s
        );
    }
}
