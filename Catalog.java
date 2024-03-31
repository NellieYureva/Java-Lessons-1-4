// Каталог товаров книжного магазина сохранен в виде двумерного
// списка List<ArrayList<String>> так, что на 0й позиции каждого
// внутреннего списка содержится название жанра, а на остальных
// позициях - названия книг. Напишите метод для заполнения данной
// структуры.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Catalog {
  public static void main(String[] args) {
List<ArrayList<String>> catalog = new ArrayList<>();
ArrayList<String> genre1 = new ArrayList<>(Arrays.asList("жанр1", "книга1.1", "книга1.2", "книга1.3"));
ArrayList<String> genre2 = new ArrayList<>(Arrays.asList("жанр2", "книга2.1", "книга2.2", "книга2.3"));
ArrayList<String> genre3 = new ArrayList<>(Arrays.asList("жанр3", "книга3.1", "книга3.2", "книга3.3"));
catalog.addAll(Arrays.asList(genre1, genre2, genre3));
for (var string : catalog) {
System.out.println(string);
}
}
}  

