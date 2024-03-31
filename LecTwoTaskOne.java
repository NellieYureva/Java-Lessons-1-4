// Дано четное число N (>0) и символы c1 и c2.
// Написать метод, который вернет строку длины N, которая
// состоит из чередующихся символов c1 и c2, начиная с c1.

public class LecTwoTaskOne {
public static void main (String[] args) {
    int n = 50;
    char c1 = 'a';
    char c2 = 'b';

    long start = System.currentTimeMillis(); // для проверки быстроты действия двух методов фиксируем началтное время
    System.out.println(MetodString (n, c1, c2));
    System.out.println(System.currentTimeMillis() - start); //конечное время

    long start1 = System.currentTimeMillis();
    System.out.println(MetodSb(n, c1, c2));
    System.out.println(System.currentTimeMillis() - start1);
}

public static String MetodString (int n, char c1, char c2) {
    String str = "";
    for (int i = 0; i < n/2; i++) {
        str = str + c1 + c2;
    }
    return str;

}

public static String MetodSb (int n, char c1, char c2) { //Метод через StringBuilder
    StringBuilder sb = new StringBuilder(n); //Создаем новый StringBuilder
    for (int i = 0; i < n/2; i++) {
       sb.append(c1).append(c2); //Добавлякм С1 и С2
    }
    return sb.toString(); //Преобразовываем в строку

}







}




