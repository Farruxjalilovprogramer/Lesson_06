package _1_2_M.Lesson_01.Lesson_09.Task_02;

public class Application {

    public static Application instanse;
    private Application(){

    }
    public static Application getInstance(){
        if(instanse ==null){
            instanse =new Application();
        }
        return instanse;
    }
    public  void run(){
        Phone phone=new Phone("Hi",Model.SAMSUNG,12);
        System.out.println(phone);

    }
}