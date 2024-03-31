// Напишите метод, который сжимает строку.
// Пример: вход aaaabbbcdd.
// Выход: a4b3c1d2


public class LecTwoTaskTwo {
    public static void main(String[] args) {
        String str = "aaaabbbcdd";
        System.out.println(Compress (str));

    }

public static String Compress (String str) { //метод сжатия строки
    StringBuilder sb = new StringBuilder(); // Создаем новую строку
    int count = 1;
    char current = str.charAt(0); // Берем первый символ в данной строке с индексом 0
    for (int i = 1; i < str.length(); i++) {
        if (str.charAt(i) == current){
            count ++;
        }
        else{
            sb.append(current).append(count); // выводим результат предыдущего симвода
            count = 1; //возвращеем счетчик в начало
            current = str.charAt(i); // берем следующий симиол
        }
    }
sb.append(current).append(count);  // добавляем последнюю букву d  
return sb.toString();
}
}
