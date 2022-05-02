import java.util.ArrayList;

public class MyQueue {
    public ArrayList<String> items;

    public MyQueue() {
        items = new ArrayList<String>();
    }

    public void insert(String item) {
        items.add(item); // insert at the back
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public String remove() {
        if (isEmpty()) {
            return null;
        } else {
            return items.remove(0); // remove from the front
        }
    }

    public String toString() {
        return items.toString();
    }
}