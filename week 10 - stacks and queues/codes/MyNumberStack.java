import java.util.ArrayList;

public class MyNumberStack {
    public ArrayList<Double> items;

    public MyNumberStack() {
        items = new ArrayList<Double>();
    }

    public void push(Double item) {
        items.add(0, item);
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public Double pop() {
        if (isEmpty()) {
            return null;
        } else {
            return items.remove(0);
        }
    }

    public String toString() {
        return items.toString();
    }
}