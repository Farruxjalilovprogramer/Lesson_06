package dars_4.uygaVazifa_2;

public class User {
    public final ThreadLocal<User> threadLocal ;

    public User(ThreadLocal<User> threadLocal) {
        this.threadLocal = threadLocal;
    }

    public ThreadLocal<User> get() {
        return threadLocal;
    }
    public void set(User user){
        threadLocal.set(user);
    }
    public void remove (){
        threadLocal.remove();
    }
}
