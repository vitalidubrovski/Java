import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 10;
        homeWork1(n);
        homeWork2(n);
        homeWork3();
        homeWork4();

    }

    static void homeWork1(int n) {
        /*
        Вычислить n-ое треугольного число(сумма чисел от 1 до n)
         */
        System.out.println("Задача 1");
        int result = 0;
        for (int i = 0; i <= n; i++) {
            result += i;
        }
        System.out.println(result);
    }

    static void homeWork2(int n) {
        /*
        Вычислить n! (произведение чисел от 1 до n)
         */
        System.out.println("Задача 2");
        int result = 1;
        for (int i = 1; i < n + 1; i++) {
            result *= i;
        }
        System.out.println(result);
    }

    static void homeWork3() {
        /*
        Вывести все простые числа от 1 до 1000
        (простые числа - это числа которые делятся только на себя и на единицу без остатка.
        Чтобы найти остаток от деления используйте оператор % , например 10%3 будет равно единице)
         */
        System.out.println("Задача 3");
        int n = 1000;
        for (int i = 2; i <= n; i++) {
            boolean simple = false;

            for (int j = 2; j * j <= i; j++) {
                simple = (i % j == 0);
                if (simple) {
                    break;
                }
            }
            if (!simple) {
                System.out.print(i + " ");
            }

        }
    }

    static void homeWork4() {
        /*
        Реализовать простой калькулятор
        ("введите первое число"... "Введите второе число"... "укажите операцию,
        которую надо выполнить с этими числами"... "ответ: ...")
         */
        System.out.println("Задача 4");
        System.out.println("Введите первое число: ");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        System.out.println("Введите второе число: ");
        double y = scanner.nextDouble();
        System.out.println("Введите операцию *, /, +, -, %");
        char operation = scanner.next().charAt(0);
        if (operation == '*') {
            System.out.println(x * y);
        } else if (operation == '/') {
            System.out.println(x / y);
        } else if (operation == '+') {
            System.out.println(x + y);
        } else if (operation == '-') {
            System.out.println(x - y);
        } else if (operation == '%') {
            System.out.println(x % y);
        } else {
            System.out.println("Ввели не корректные данные, попробуйте еще раз.");
        }
    }
}
