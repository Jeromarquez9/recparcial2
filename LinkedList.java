public class LinkedList {

    private Node head;
    private int size;

    public LinkedList() {
        head = null;
        size = 0;
    }

    public void add(Object data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node aux = head;
            while (aux.next != null) {
                aux = aux.next;
            }
            aux.next = newNode;
        }
        size++;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) return null;

        Node aux = head;
        int count = 0;

        while (count < index) {
            aux = aux.next;
            count++;
        }

        return aux.data;
    }

    public Object remove(Object data) {
        if (head == null) return null;

        if (head.data.equals(data)) {
            Object removed = head.data;
            head = head.next;
            size--;
            return removed;
        }

        Node prev = head;
        Node curr = head.next;

        while (curr != null) {
            if (curr.data.equals(data)) {
                prev.next = curr.next;
                size--;
                return curr.data;
            }
            prev = curr;
            curr = curr.next;
        }

        return null;
    }

    public boolean contains(Object data) {
        Node aux = head;
        while (aux != null) {
            if (aux.data.equals(data)) return true;
            aux = aux.next;
        }
        return false;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public void print() {
        Node aux = head;
        while (aux != null) {
            System.out.println(" - " + aux.data);
            aux = aux.next;
        }
    }
}
