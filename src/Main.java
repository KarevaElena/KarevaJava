import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Задание 1 (если введенное число больше 7, то вывести “Привет”)
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = sc.nextInt();
        if (number > 7) {
            System.out.println("Привет");
        }

        // Задание 2 (если введенное имя совпадает с Вячеслав,
        // то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени")
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = sc1.nextLine();
        if (name.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
        sc1.close();

        // Задание 3 (на входе есть числовой массив, необходимо вывести элементы массива кратные 3)
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                System.out.println(array[i]);
            }
        }
         /* Задание 4
        [((())()(())]]
        Эту последовательность нельзя считать правильной.
        В ней нужно вместо предпоследней закрывающей квадратной скобки поменять на круглую закрывающую скобку.
        */
    }
}