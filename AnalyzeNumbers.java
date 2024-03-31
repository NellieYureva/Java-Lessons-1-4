/* 
Реализуйте метод, который принимает на вход целочисленный массив arr:
- Создаёт список ArrayList, заполненный числами из исходого массива arr.
- Сортирует список по возрастанию и выводит на экран.
- Находит минимальное значение в списке и выводит на экран - Minimum is {число} - Находит максимальное значение в списке и выводит на экран - Maximum is {число}
- Находит среднее арифметическое значений списка и выводит на экран - Average is =  {число}
Напишите свой код в методе analyzeNumbers класса Answer. Метод analyzeNumbers принимает на вход один параметр:
Integer[] arr - массив целых чисел.
Пример.
Исходный массив:
4, 2, 7, 5, 1, 3, 8, 6, 9
Результаты:
[1, 2, 3, 4, 5, 6, 7, 8, 9]
Minimum is 1
Maximum is 9
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AnalyzeNumbers {
    public static void analyzeNumbers(Integer[] arr) {
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        Collections.sort(list);// Сортировка списка
        System.out.println(list);
        int min = list.get(0);// Поиск минимального значения
        System.out.println("Minimum is " + min);

        // Поиск максимального значения
        int max = list.get(list.size() - 1);
        System.out.println("Maximum is " + max);

        // Нахождение среднего арифметического
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        double average = (double) sum / list.size();
        System.out.println("Average is = " + average);
       
    }
    public static void main(String[] args) { 
      Integer[] arr = {};
      
      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
      }
      else{
        arr = Arrays.stream(args[0].split(", "))
                        .map(Integer::parseInt)
                        .toArray(Integer[]::new);
      }     
      
      AnalyzeNumbers ans = new AnalyzeNumbers();      
      ans.analyzeNumbers(arr);
    }
}

