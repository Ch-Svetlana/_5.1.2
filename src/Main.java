import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeOfList, upperBound, filterInt;
        Logger logger = Logger.getInstance();
        logger.log("Запуск программы");
        logger.log("Просьба ввести пользователем данные");

        System.out.println("Введите размер списка:");
        while (true) {
            if (scanner.hasNextInt()) {
                sizeOfList = scanner.nextInt();
                break;
            } else {
                System.out.println("Введите любое число");
                scanner.next();
            }
        }

        System.out.println("Введите верхнюю границу для значений:");
        while (true) {
            if (scanner.hasNextInt()) {
                upperBound = scanner.nextInt();
                break;
            } else {
                System.out.println("Введите любое число");
                scanner.next();
            }
        }

        logger.log("Создаём и наполняем список");
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < sizeOfList; i++) {
            list.add(random.nextInt(upperBound));
        }
        logger.log("Вот случайный список: " + list);
        logger.log("Просим пользователя ввести входные данные для фильтрации");

        logger.log("Введите порог для фильтра:");
        while (true) {
            if (scanner.hasNextInt()) {
                filterInt = scanner.nextInt();
                break;
            } else {
                System.out.println("Введите любое число");
                scanner.next();
            }
        }


        Filter filter = new Filter(filterInt);
        List<Integer> newlist = filter.filterOut(list);
        logger.log("Выводим результат на экран\nОтфильтрованный список " + newlist);
        logger.log("Завершаем программу");


    }


}