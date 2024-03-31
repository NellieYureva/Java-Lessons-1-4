// Внутри класса MergeSort напишите метод mergeSort, который принимает массив целых чисел, реализует алгоритм сортировки слиянием. 
// Метод должен возвращать отсортированный массив.
// Пример
// a = {5, 1, 6, 2, 3, 4} -> [1, 2, 3, 4, 5, 6]

import java.util.Arrays;

public class MergeSort {
    public static int[] mergeSort(int[] a) {
        int n = a.length;
        if (n <= 1) return a;
        int[] left = mergeSort(Arrays.copyOfRange(a, 0, n / 2));
        int[] right = mergeSort(Arrays.copyOfRange(a, n / 2, n));
        return merge(left, right);
    }

    private static int[] merge(int[] ar1, int[] ar2) {
        int n1 = ar1.length, n2 = ar2.length;
        int n = n1 + n2, i1 = 0, i2 = 0;
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            if (i1 == n1) {
                ar[i] = ar2[i2++];
            } else if (i2 == n2) {
                ar[i] = ar1[i1++];
            } else {
                if (ar1[i1] < ar2[i2]) {
                    ar[i] = ar1[i1++];
                } else {
                    ar[i] = ar2[i2++];
                }
            }
        }
        return ar;
    }   
    public static void main(String[] args) { 
        int[] a;
        if (args.length == 0) {
            a = new int[]{5, 1, 6, 2, 3, 4};
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        MergeSort answer = new MergeSort();
        String itresume_res = Arrays.toString(answer.mergeSort(a));
        System.out.println(itresume_res);
    }
} 

