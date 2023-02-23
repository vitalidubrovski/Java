import java.util.*;

public class Main {
    public static void main(String[] args) {
//        ex1("Жора");
        ex2();
    }

    static void ex1(String name) {
        /*
        1.Реализуйте структуру телефонной книги с помощью HashMap,
        учитывая, что 1 человек может иметь несколько телефонов.
         */

        Map<String, List<String>> map = new HashMap<>();
        map.put("Петя", List.of("89810533229"));
        map.put("Вася", List.of("82123453687"));
        map.put("Жора", List.of("82350680346", "1518648236"));
        map.put("Семен", List.of("82351315323", "14154262312"));
        map.put("Олег", List.of("83135153559"));
        map.put("Федя", List.of("81351353100"));

        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey().equals(name)) {
                System.out.println(entry);
            }
        }
    }

    static void ex2() {
        /*
        2.Пусть дан список сотрудников:

 Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова,
 Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова,
 Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов.

 Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
 Отсортировать по убыванию популярности. Для сортировки использовать TreeMap.
         */

        String employee = "Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, " +
                "Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, " +
                "Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов.";

        employee = employee.replace(",", "");
        employee = employee.replace(".", "");
        String[] strings = employee.split(" ");

        TreeMap<String, Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < strings.length; i += 2) {
            if (treeMap.containsKey(strings[i])) {
                treeMap.replace(strings[i], treeMap.get(strings[i]) + 1);
            } else {
                treeMap.put(strings[i], 1);
            }
        }
        System.out.println("Не сортированный список: " + treeMap);

        List<Map.Entry<String, Integer>> list = new ArrayList<>(treeMap.entrySet());
        Collections.sort(list, Comparator.comparingInt(Map.Entry::getValue));
        Collections.reverse(list);
        System.out.println("Сортированный список: " + list);

    }

}
