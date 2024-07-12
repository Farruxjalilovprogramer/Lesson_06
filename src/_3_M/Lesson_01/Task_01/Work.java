package _3_M.Lesson_01.Task_01;

public class Work {
    public static void main(String[] args) {
        ProgrammingLanguage programmingLanguage=new ProgrammingLanguage();
        programmingLanguage.setName("Bob");
        programmingLanguage.setReleaseDate("17.05.24");
        try {
            System.out.println(programmingLanguage.Name);
            System.out.println(programmingLanguage.owner);
            System.out.println(programmingLanguage.releaseDate);
        }catch (NullPointerException e){
            System.out.println(e);
        }

    }
}
