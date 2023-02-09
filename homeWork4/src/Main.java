import java.util.*;

public class Main {
    public static void main(String[] args) {
        hw1();
        hw3();
        hw2();
    }


    static void hw1() {
        /*
        Пусть дан LinkedList с несколькими элементами.
        Реализуйте метод, который вернет “перевернутый” список.
         */
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println(linkedList);
        Collections.reverse(linkedList);
        System.out.println(linkedList);
    }

    static void hw3() {
        /*
        Найдите сумму всех элементов LinkedList,
        сохраняя все элементы в списке. Используйте итератор
         */
        int sum = 0;
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(4);
        linkedList.add(0);
        linkedList.add(8);
        System.out.println("Список: " + linkedList);
        ListIterator<Integer> iterator = linkedList.listIterator();
        while (iterator.hasNext()) {
            Integer integer = iterator.next();
            sum += integer;
        }
        System.out.println("Сумма: " + sum);
    }

    static void hw2(){
        MyQueue myQueue = new MyQueue();
        myQueue.addQueue("Танос");
        myQueue.addQueue(10);
        myQueue.addQueue(100);
        System.out.println("Возвращает и не удаляет: " + myQueue.first());
        myQueue.enQueue("Бууу");
        System.out.println(myQueue);
        myQueue.enQueue(11);
        System.out.println("Вовзращает и удаляет: " + myQueue.deQueue());
        System.out.println(myQueue);
    }
}
