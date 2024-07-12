package dars_5.uygaVazifa_2;

public class SingletonPatternClass {
    private static SingletonPatternClass singletonPatternClass;
    private SingletonPatternClass() {}
    public static SingletonPatternClass getInstance(){
        if(singletonPatternClass == null){
            synchronized (SingletonPatternClass.class){
                if(singletonPatternClass == null)
                    return new SingletonPatternClass();
            }
        }
        return singletonPatternClass;
    }

}
