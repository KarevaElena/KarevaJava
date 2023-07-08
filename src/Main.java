public class Main {
    public static void main(String[] args) {
        // Задание 1
        int a = 9;
        if (a > 7) {
            System.out.println("Привет");
        }
        // Задание 2
        String name = "Вячеслав";
        if (name == "Вячеслав") {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
        // Задание 3
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