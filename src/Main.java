import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < intList.size(); i++) {
            if (intList.get(i) > 0) { // Отфильтруйте положительные числа.
                if (intList.get(i) % 2 == 0) { // Найдите среди этих положительных чисел четные.
                    newList.add(intList.get(i));
                }
            }
        }
        newList.sort(Comparator.naturalOrder());// Отсортируйте отфильтрованные числа в порядке возрастания.
        newList.forEach(System.out::println); // Выведите результат на экран.
    }
}