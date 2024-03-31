// Заполнить список десятью случайными числами. Отсортировать список методом sort() класса Collections и вывести его на экран.
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import javax.naming.LimitExceededException;

public class RandomList {
    public static void main(String[] args) {
        int size = 10;
        List<Integer> list = getRndList(size);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }

    private static List<Integer> getRndList(int size) {
        List <Integer> list = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < size; i++) {
            list.add(rnd.nextInt(100));
        }
        return list;
    }
         
    }
    

