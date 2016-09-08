package dataStruct;

/**
 * Created by wong on 16/5/14.
 */

public class StackInt2Min<T> {
    StackInt2Impl<Integer> elem;
    StackInt2Impl<Integer> min;

    public StackInt2Min() {
        elem = new StackInt2Impl<>();
        min = new StackInt2Impl<>();
    }


    public boolean isEmpty() {
        return elem.isEmpty();
    }


    public void push(Integer value) {
        if (min.isEmpty()) min.push(value);
        else {
            if (value < min.peek()) {
                min.push(value);
            }
        }
        elem.push(value);
    }


    public Integer pop() {
        Integer topOfElem = elem.peek();
        elem.pop();
        if (topOfElem == min.peek()) {
            min.pop();
        }
        return topOfElem;
    }


    public Integer peek() {
        return elem.peek();
    }

    public Integer min() {
        if (min.isEmpty()) return null;
        return min.peek();
    }

    public static void main(String[] args) {
        StackInt2Min s = new StackInt2Min();
        s.push(2);
        s.push(1);
        System.out.println(s.min());
        s.push(3);
        System.out.println(s.min());
        s.pop();
        s.pop();
        System.out.println(s.min());
    }
}
