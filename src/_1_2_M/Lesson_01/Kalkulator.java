package _1_2_M.Lesson_01;

public class Kalkulator {
    public double first;
    public double  second;


    public Kalkulator(int first,int second) {
        this.first = first;
        this.second = second;
    }
    public  void sign(String belgi){
if(belgi.equals("+")){
    System.out.println(first+second);
} else if (belgi.equals("-")) {
    System.out.println(first-second);
}else if(belgi.equals("*")){
    System.out.println(first*second);
} else if (belgi.equals("/")) {
    System.out.println(first/second);
}else {
    System.out.println("hato belgi");
    sign(belgi);
}
    }
}
