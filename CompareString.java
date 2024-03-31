// Даны следующие строки, cравнить их с помощью == и
// метода equals() класса Object
// String s1 = "hello";
// String s2 = "hello";
// String s3 = s1;
// String s4 = "h" + "e" + "l" + "l" + "o";
// String s5 = new String("hello");
// String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});


public class CompareString {
    public static void main(String[] args) {
        String s1 = "hello";
    String s2 = "hello";
    String s3 = s1;
    String s4 = "h" + "e" + "l" + "l" + "o";
    String s5 = new String("hello"); // при сравнении == будут сравниваться ссылки(при new  создается новый объем памяти) и 
                                               // будет false, а сравнение методом equals() будут сравниваться значения, только если это String,
                                               // итог true
    String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

    System.out.println(s1 == s2); //сравниваем две страки классическим способом
    System.out.println(s1.equals(s2)); // сравниваем с помощью метода equals

    System.out.println();  // разделитель пустая строка

    System.out.println(s1 == s3); 
    System.out.println(s1.equals(s3)); 

    System.out.println();  

    System.out.println(s1 == s4); 
    System.out.println(s1.equals(s4)); 

    System.out.println();

    System.out.println(s1 == s5); 
    System.out.println(s1.equals(s5)); 

    System.out.println();

    System.out.println(s1 == s6); 
    System.out.println(s1.equals(s6)); 

    System.out.println();

    System.out.println(s5 == s6); 
    System.out.println(s5.equals(s6)); 

    }
     
}




