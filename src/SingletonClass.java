public class SingletonClass {
    static private final SingletonClass singletonClass= new SingletonClass();
    private SingletonClass(){

    }
    public static SingletonClass getInstance(){
        return singletonClass;
    }

}
