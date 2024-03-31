/* 
Дан произвольный массив целых чисел. Создайте список ArrayList, заполненный данными из этого массива. Необходимо удалить из списка 
четные числа и вернуть результирующий. Напишите свой код в методе removeEvenNumbers класса Answer. Метод removeEvenNumbers 
принимает на вход один параметр: Integer[] arr - список целых чисел, возвращает список ArrayList<Integer>
Примеры.
Исходный массив:
1, 2, 3, 4, 5, 6, 7, 8, 9
Результат:
[1, 3, 5, 7, 9]
Исходный массив:
2, 4, 6, 8
Результат: []
*/

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveEvenNam {
    public static ArrayList<Integer> removeEvenNumbers(Integer[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (Integer num : arr) {
            if (num % 2 != 0) {
                list.add(num);
            }
        }
        return list;
    }
    public static void main(String[] args) { 
        Integer[] arr = {};
      
        if (args.length == 0) {
            arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        }
        else{
        arr = Arrays.stream(args[0].split(", ")).map(Integer::parseInt).toArray(Integer[]::new);
        }     
        RemoveEvenNam ren = new RemoveEvenNam();      
        ren.removeEvenNumbers(arr);
        System.out.println(ren.removeEvenNumbers(arr));
    }
}

