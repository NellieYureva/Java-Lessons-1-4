// Теория

import java.time.LocalDateTime; // строка добавляется автоматически при написании LocalDateTime.now()
import java.util.Scanner;

public class Lecture1 {
    public static void main (String[] args) {    //метод void невозвращаемый
        System.out.println("Hello, world!"); 
        main1("Hello!");   
        System.out.println(LocalDateTime.now());  //печатает дату и время 
        
        Scanner scan = new Scanner(System.in); //считываем информацию с консоли
        String str = scan.nextLine(); //вводим эту информацию в строку
        scan.close(); // закрываем сканер чтобы не было утечки информации

    }
    public static void main1 (String str) {     //метод void невозвращаемый
        System.out.println(str);        
    }

    public static String main2 (String str) {     //метод String возвращаемый
        return str;
    }
}

// Типы данных:
// int num = 45;
// double d = 52.698;
// String str ="ljuhnmm"; двойные ковычки в строке
// char c = 'f';       одинарные ковычки в символе
// boolean b = true;
