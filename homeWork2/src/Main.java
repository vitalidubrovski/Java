import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main {
    public static void main(String[] args) {
        String json = "{[{ \"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
                "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
                "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]}";
        String filePath = "file.txt";
        String result = ex1(json);
        ex2(result, filePath);
    }

    static String ex1(String json) {
        /*
        Дана json строка { { "фамилия":"Иванов","оценка":"5","предмет":"Математика"},
        {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
        {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}} Задача написать метод(ы),
        который распарсить строку и выдаст ответ вида: Студент Иванов получил 5 по предмету Математика.
        Студент Петрова получил 4 по предмету Информатика.
        Студент Краснов получил 5 по предмету Физика.
        Используйте StringBuilder для подготовки ответа
         */

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < json.length(); i++) {
            if ((Character.isLetterOrDigit(json.charAt(i))))
                stringBuilder.append(json.charAt(i));
        }
        System.out.println(stringBuilder);


        String res = stringBuilder.toString().replace("фамилия", " Студент ")
                .replace("оценка", " получил(а) ")
                .replace("предмет", " по предмету ")
                .replace("ка", "ка.\n");
        System.out.println(res);
        return res;
    }

    static void ex2(String result, String filePath) {
        /*
        Создать метод, который запишет результат работы в файл.
        Обработайте исключения и запишите ошибки в лог файл
         */
        Logger logger = Logger.getAnonymousLogger();
        logger.log(Level.INFO,"Начало.");
        SimpleFormatter simpleFormatter = new SimpleFormatter();
        FileHandler fileHandler = null;
        try {
            fileHandler = new FileHandler("log.txt");
            fileHandler.setFormatter(simpleFormatter);
        } catch (IOException e) {
            e.printStackTrace();
        }
        logger.addHandler(fileHandler);


        StringBuilder stringBuilder = new StringBuilder();
        int n = 1;
        for (int i = 0; i < n; i++) {
            stringBuilder.append(result);
            try (FileWriter fileWriter = new FileWriter(filePath, false)) { // false - перезапись файла,
                // true - добавление записи в файл.
                fileWriter.write(stringBuilder.toString());
            } catch (IOException e) {
                logger.log(Level.WARNING, e.getMessage());
                e.printStackTrace();
            }
        }

    }
}
