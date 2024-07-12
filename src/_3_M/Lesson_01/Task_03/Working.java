package _3_M.Lesson_01.Task_03;

public class Working {
    public static void main(String[] args) throws QavatCantBeLessThanZeroException, RangCantBeBlankException, PersonNameCantBeBlankException {
Home home=new Home();
        try {
            if(home.getQavat()<0){
                throw new QavatCantBeLessThanZeroException();
            }

        }catch (Exception e){
            throw new QavatCantBeLessThanZeroException();
        }



        try {
            if(home.getRangi()==null){
                throw new RangCantBeBlankException();
            }
        }catch (Exception e){
            throw new RangCantBeBlankException();
        }


        try {
if(home.getRoomCount()<10){
    throw new RangCantBeBlankException();
}
        }catch (Exception e){
            throw new RangCantBeBlankException();
        }


        try {
            if(home.getPersonName()==null){
                throw new PersonNameCantBeBlankException();
            }
        }catch (Exception e){
            throw new PersonNameCantBeBlankException();
        }
    }
}
