// Вычислить n-ое треугольного число(сумма чисел от 1 до n), 
// n! (произведение чисел от 1 до n)

// public class HomeOne {
//     public static void main(String[] args) {
//         int n = 5;
//         int sum = 0;
//         for (int i = 1; i <= n; i++) {
//             sum = sum +i;
//         }
//         System.out.println(sum);      
//     }
// }


public class HomeOne {
    public static void main(String[] args) {
        int n = 4;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println(fact);      
    }
}

// Эталонное решение:
// class Answer {
//     public int countNTriangle(int n){
// if (n < 1) return -1;
//     int sum = 0;
//     for(int i = 1; i <= n; i++){
//           sum += i;
//     }
//     return sum;
//     }
// }

// public class Printer{ 
//     public static void main(String[] args) { 
//       int n = 0;

//       if (args.length == 0) {
//         n = 4;
//       }
//       else{
//         n = Integer.parseInt(args[0]);
//       }     

//       Answer ans = new Answer(); 
//       int itresume_res = ans.countNTriangle(n);     
//       System.out.println(itresume_res);
//     }
// }