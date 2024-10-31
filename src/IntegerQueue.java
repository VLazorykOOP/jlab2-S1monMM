import java.util.LinkedList;

public class IntegerQueue {
    private LinkedList<Integer> queue;

    public IntegerQueue() {
        queue = new LinkedList<>();
    }

    public void enqueue(int element) {
        queue.addLast(element);
        System.out.println("Елемент " + element + " додано в чергу.");
    }


    public int dequeue() {
        if (queue.isEmpty()) {
            System.out.println("Черга порожня. Немає елементів для вилучення.");
            return 0;
        }
        else {
            int removedElement = queue.removeFirst();
            System.out.println("Елемент " + removedElement + " вилучено з черги.");
            return removedElement;
        }
    }


    public boolean contains(int element) {
        boolean found = queue.contains(element);
        if (found) {
            System.out.println("Елемент " + element + " знайдено в черзі.");
        } else {
            System.out.println("Елемент " + element + " не знайдено в черзі.");
        }
        return found;
    }


    public void printQueue() {
        System.out.println("Поточна черга: " + queue);
    }
}
