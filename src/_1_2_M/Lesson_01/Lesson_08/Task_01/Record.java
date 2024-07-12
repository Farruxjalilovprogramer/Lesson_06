package _1_2_M.Lesson_01.Lesson_08.Task_01;

public record  Record(String Name,String Author,int PageCount,int PriceBook) {


    @Override
    public String Name() {
        return Name;
    }

    @Override
    public String Author() {
        return Author;
    }

    @Override
    public int PageCount() {
        return PageCount;
    }

    @Override
    public int PriceBook() {
        return PriceBook;
    }
}
