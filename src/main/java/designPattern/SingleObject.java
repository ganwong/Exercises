package designPattern;

/**
 * Created by wong on 16/9/5.
 */
public class SingleObject {
    private static SingleObject ins = new SingleObject();
    private SingleObject() {}
    public static SingleObject getInstance() {
        return ins;
    }
    public void showMessage() {
        System.out.println("hello world");
    }

}
