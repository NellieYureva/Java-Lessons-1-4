// Вывести все простые числа от 1 до 1000 

public class HomeTwo {
    public static void main(String[] args) {
        for (int i = 1; i <1000; i++) {
            boolean m = SimpleNum(i);
            if (m == true){
                System.out.println(i);
            }
        }
    }



     public static boolean SimpleNum(int i) { //метод для определения простого числа
        boolean k = false;
        if (i == 2){
            k = true;
        } 
        for(int j = 2;j < i;j++){   
            if(j==(i-1)){
                k = true;
            }
            if((i % j)==0){
                break;
            }
        }
        return k;

    }

}

// Эталонное решение
// class Answer {
//     public static void printPrimeNums() {
//      // Напишите свое решение ниже

//      // Проход начинается с 2, т.к. это число является наименьшим простым
//      for (int i = 2; i <= 1000; i++) {

//          boolean isPrime = true;

//          // Проверка, является ли число i простым
//          // Проход по циклу до корня числа,
//          // т.к. дальше нет смысла искать, делителей нет.
//          for (int j = 2; j <= Math.sqrt(i); j++) {
//              if (i % j == 0) {
//                  isPrime = false;
//                  break;
//              }
//          }
//          // Если число i простое, вывод его на экран
//          if (isPrime)
//              System.out.println(i);
//      }
//  }
// }

// public class Printer{ 
//  public static void main(String[] args) { 

//    Answer ans = new Answer();      
//    ans.printPrimeNums();
//  }
// }