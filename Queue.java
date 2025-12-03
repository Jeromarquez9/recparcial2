public class Queue {

    private LinkedList list = new LinkedList();

    public void enqueue(Object data) {
        list.add(data);
    }

    public Object dequeue() {
        if (list.isEmpty()) return null;

        Object first = list.get(0);
        list.remove(first);
        return first;
    }

    public Object peek() {
        if (list.isEmpty()) return null;
        return list.get(0);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }
}
