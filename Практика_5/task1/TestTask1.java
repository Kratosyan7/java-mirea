package task1;

import java.util.ArrayList;
import java.util.Arrays;

/** Практика №5, задание №1. Проверка всех четырёх пунктов. */
public class TestTask1 {

    public static void main(String[] args) {

        // --- Пункт 1: удаление дубликатов --------------------------------

        System.out.println("=== Пункт 1: удаление дубликатов ===");
        ArrayList<String> words = new ArrayList<>(
                Arrays.asList("кот", "пёс", "кот", "ёж", "пёс", "кот"));
        System.out.println("Было:  " + words);
        System.out.println("Стало: " + DuplicateRemover.removeDuplicates(words));

        ArrayList<Integer> numbers = new ArrayList<>(
                Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5));
        System.out.println("Было:  " + numbers);
        System.out.println("Стало: " + DuplicateRemover.removeDuplicates(numbers));

        // --- Пункт 2: линейный поиск -------------------------------------

        System.out.println();
        System.out.println("=== Пункт 2: линейный поиск ===");
        int[] array = {17, 4, 92, 8, 35, 4};
        System.out.println("Массив: " + Arrays.toString(array));
        for (int key : new int[] {17, 35, 4, 100}) {
            System.out.printf("search(%3d) = %2d%n", key, LinearSearch.search(array, key));
        }

        String[] names = {"Анна", "Борис", "Вера"};
        System.out.println("Массив: " + Arrays.toString(names));
        System.out.println("search(\"Вера\")  = " + LinearSearch.search(names, "Вера"));
        System.out.println("search(\"Галя\") = " + LinearSearch.search(names, "Галя"));

        // --- Пункт 3: наибольший элемент через compareTo() ---------------

        System.out.println();
        System.out.println("=== Пункт 3: наибольший Circle ===");
        Circle[] circles = {
            new Circle(2.5), new Circle(7.1), new Circle(4.0), new Circle(6.8)
        };
        System.out.println("Массив:     " + Arrays.toString(circles));
        Circle biggest = MaxFinder.max(circles);
        System.out.println("Наибольший: " + biggest);
        System.out.printf("Площадь:    %.2f%n", biggest.getArea());

        // Метод обобщённый — работает и с другими Comparable
        Integer[] ints = {5, 17, 3, 42, 8};
        System.out.println("max(Integer[]) = " + MaxFinder.max(ints));
        String[] strs = {"яблоко", "банан", "апельсин"};
        System.out.println("max(String[])  = " + MaxFinder.max(strs));

        // --- Пункт 4: наибольший в двумерном массиве ---------------------

        System.out.println();
        System.out.println("=== Пункт 4: наибольший в двумерном массиве ===");
        Integer[][] matrix = {
            {3, 17, 8},
            {41, 5, 22},
            {9, 14, 6}
        };
        for (Integer[] row : matrix) {
            System.out.println("  " + Arrays.toString(row));
        }
        System.out.println("Наибольший: " + MaxFinder.max(matrix));

        Circle[][] circleMatrix = {
            {new Circle(1.0), new Circle(3.5)},
            {new Circle(9.2), new Circle(2.1)}
        };
        System.out.println("Наибольший Circle в матрице: " + MaxFinder.max(circleMatrix));
    }
}
