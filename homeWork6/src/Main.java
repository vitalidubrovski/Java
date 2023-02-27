import java.util.*;

/*
Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы.
Реализовать в java.

Создать множество ноутбуков.

Написать метод, который будет запрашивать у пользователя критерий (или критерии)
 фильтрации и выведет ноутбуки,
отвечающие фильтру. Критерии фильтрации можно хранить в Map.
Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …

Далее нужно запросить минимальные значения для указанных критериев -
сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
*/

public class Main {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("1", "lenovo", "16", "512",
                "linux", "white");
        Laptop laptop2 = new Laptop("2", "samsung", "8", "256",
                "windows", "grey");
        Laptop laptop3 = new Laptop("3", "asus", "2", "256",
                "windows", "blue");
        Laptop laptop4 = new Laptop("4", "xiaomi", "4", "1024",
                "linux", "pink");
        Laptop laptop5 = new Laptop("5", "apple", "4", "1024",
                "mac", "spaceGray");
        Laptop laptop6 = new Laptop("6", "apple", "16", "512",
                "mac", "roseGold");
        Laptop laptop7 = new Laptop("7", "lenovo", "8", "1024",
                "windows", "green");

        Set<Laptop> laptops = new HashSet<>(List.of(laptop1, laptop2,
                laptop3, laptop4, laptop5, laptop6, laptop7));

        Map<String, String> mapSelect = selectCriteria();
        sort(mapSelect, laptops);

    }

    public static String scanner() {
        Scanner scanner = new Scanner(System.in);
        String scan = scanner.nextLine();
        String result = scan.toLowerCase();
        return result;
    }

    public static Map<String, String> selectCriteria() {
        Map<String, String> resultTest = new HashMap<>();
        while (true) {
            System.out.print("Введите 'y' для фильтрации и 'Enter' для вывода результатов: ");
            String question = scanner();
            if (question.equals("y")) {
                System.out.print(
                        "Выберите критерий фильтрации результатов:" +
                                "\n 1 - Марка \n 2 - Объём ОЗУ \n 3 - Объем SSD диска \n" +
                                " 4 - Операционная система \n 5 - Цвет" + "\n Введите значение >>> ");
                String key = scanner();
                System.out.print("Введите значение для выбранного критерия: ");
                String value = scanner();

                resultTest.put(key, value);

                System.out.println(resultTest);
            } else {
                break;
            }
        }
        return resultTest;
    }

    public static void sort(Map<String, String> mapTest, Set<Laptop> laptops) {

        Set<Laptop> temp = new HashSet<>(laptops);
        for (Laptop laptop : laptops) {

            for (Object couple : mapTest.keySet()) {

                if (couple.equals("1") && !laptop.getTrademark().equals(mapTest.get(couple))) {
                    temp.remove(laptop);
                }
                for (Object couple1 : mapTest.keySet()) {

                    if (couple1.equals("2") && !laptop.getRamValue().equals(mapTest.get(couple1))) {
                        temp.remove(laptop);

                    }
                    for (Object couple2 : mapTest.keySet()) {

                        if (couple2.equals("3") && !laptop.getHardDisk().equals(mapTest.get(couple2))) {
                            temp.remove(laptop);

                        }
                        for (Object couple3 : mapTest.keySet()) {

                            if (couple3.equals("4") && !laptop.getOperatingSystem().equals(mapTest.get(couple3))) {
                                temp.remove(laptop);

                            }
                            for (Object couple4 : mapTest.keySet()) {

                                if (couple4.equals("5") && !laptop.getColour().equals(mapTest.get(couple4))) {
                                    temp.remove(laptop);

                                }
                            }
                        }
                    }
                }
            }

        }
        if (temp.isEmpty()) {
            System.out.println("По введенным данным ничего не найдено!");
        } else {
            System.out.println("Ноутбуки подходящие под данные критерии: \n" + temp.toString());
        }

    }
}