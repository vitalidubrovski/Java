import java.util.LinkedList;
import java.util.Objects;

/*
Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.
 */
public class MyQueue {
    private LinkedList<Object> linkedList;

    MyQueue() {
        linkedList = new LinkedList<>();
    }

    void enQueue(Object x) {
        linkedList.addLast(x);
    }

    boolean empty() {
        return linkedList.isEmpty();
    }

    Object deQueue() {
        if (!empty()) {
            return linkedList.removeFirst();
        }
        return null;
    }

    Object first() {
        return linkedList.get(0);
    }

    public String toString() {
        return linkedList.toString();
    }

    Object addQueue(Object x) {
        return linkedList.add(x);
    }

}
