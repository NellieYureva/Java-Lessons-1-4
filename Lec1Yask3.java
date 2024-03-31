// Дан массив nums = [3,2,2,3] и число val = 3. Если в массиве есть числа, равные заданному, нужно перенести
// эти элементы в конец массива. Таким образом, первые несколько (или все) элементов массива
// должны быть отличны от заданного, а остальные - равны ему.

import java.util.Arrays;

public class Lec1Yask3 {
    public static void main(String[] args) {
        int[] array = {3,2,2,3};
        int val = 3;
        getRightIndex(array, val);
        System.out.println(Arrays.toString(array));
    }

    private static void getRightIndex(int[] array, int val) {
        int leftIndex = 0;
        int rightIndex = array.length-1;
        while (leftIndex < rightIndex) {
            while (array[rightIndex] == val && leftIndex < rightIndex) {
                rightIndex --;
            }
            if (array[leftIndex] == val) {
                array[leftIndex] = array[rightIndex];
                array [rightIndex] = val;
                rightIndex --;
            }
            leftIndex ++;
        }
    }


}
        
     
