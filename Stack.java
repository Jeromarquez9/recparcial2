public class Stack {

    private LinkedList list = new LinkedList();

    public void push(Object data) {
        list.add(data);
    }

    public Object pop() {
        if (list.isEmpty()) return null;

        Object last = list.get(list.size() - 1);
        list.remove(last);
        return last;
    }

    public Object peek() {
        if (list.isEmpty()) return null;
        return list.get(list.size() - 1);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }
}
