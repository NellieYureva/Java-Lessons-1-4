// Дан массив двоичных чисел, например [1,1,1,0,1,1], вывести
// максимальное количество подряд идущих 1.

public class Lec1Task2 {
    public static void main(String[] args) {
        int[] array = {1,1,0,1,1,1};
            int max = getMaxOnes(array);
        System.out.println(max);
    }

    private static int getMaxOnes(int[] array) {
        int count = 0;
        int max = 0;
      for (int i = 0; i < array.length; i++) {
        if (array[i] == 1) {
           count ++;
        }
        else {
            count = 0;
        }
        max = Math.max(count, max);
      }
        return max;
    }    
}
