package _1_2_M.Lesson_01;

public class Book {
    public String nomi;
    public String muolim;
    public int sahifa_soni;

    public Book(String nomi,String muolim,int sahifa_soni) {
        this.nomi = nomi;
        this.muolim = muolim;
        this.sahifa_soni = sahifa_soni;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nomi='" + nomi + '\'' +
                ", muolim='" + muolim + '\'' +
                ", sahifa_soni=" + sahifa_soni +
                '}';
    }
}
