package designPattern;

/**
 * Created by wong on 16/9/5.
 */
public class SingleObjectDemo {
    public static void main(String[] args) {
        SingleObject obj = SingleObject.getInstance();
        obj.showMessage();
        SingleObject obj2 = SingleObject.getInstance();
        obj2.showMessage();
    }
}
