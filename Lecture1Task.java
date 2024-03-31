// Написать программу, которая запросит пользователя ввести <Имя> в консоли.
// Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”

import java.util.Scanner;

public class Lecture1Task {
    public static void main (String[] args){
        System.out.println("Представьтесь, пожалуйста: ");
        System.out.println();
        Scanner scan = new Scanner(System.in); //считываем информацию с консоли, можно тдобавить после in, harsetName:"ibm866" (для ввода кириллицы)
        String name = scan.nextLine(); //вводим эту информацию в строку
        System.out.println("Привет, " + name + "!"); // первый способ вывода на печать
        System.out.printf("Привет, %s!", name); // %s указывает на формат string, второй способ
        scan.close(); // закрываем сканер чтобы не было утечки информации
    }
   
}

int a = 123;
System.out.println(a++); //123
System.out.println(++a); //124

