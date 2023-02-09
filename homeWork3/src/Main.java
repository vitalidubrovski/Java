import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n = 5;
        List<Integer> array = fillArray(n);
        hw2(array);
        hw1(array);


    }

    static List<Integer> fillArray(int n) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println(list);
        return list;

    }

    static void hw1(List<Integer> list) {
        /*
        Пусть дан произвольный список целых чисел, удалить из него четные числа
         */
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Integer && list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
        System.out.println("Валидный список: " + list);


    }

    static void hw2(List<Integer> list) {
        /*
        Задан целочисленный список ArrayList.
        Найти минимальное, максимальное и среднее арифметическое
        из этого списка. Collections.max()
         */
        System.out.println("Max = " + Collections.max(list));
        System.out.println("Min = " + Collections.min(list));
        double average = 0;
        double sum = 0;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sum += list.get(i);
        }
        average = sum / size;
        System.out.println("Average = " + average);
    }

}