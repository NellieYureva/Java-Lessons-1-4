// Напишите метод, который вернет содержимое текущей папки в виде
// массива строк.
// Напишите метод, который запишет массив, возвращенный предыдущим
// методом в файл.
// Обработайте ошибки с помощью try-catch конструкции. В случае
// возникновения исключения, оно должно записаться в лог-файл.

import java.io.File;
import java.io.FileWriter;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LecTwoTaskThree {

    private static Logger logger = Logger.getLogger(LecTwoTaskThree.class.getName());

    public static void main(String[] args) {
        setLogger();
        String[] content = getContentFolder(".");
        wrightToFile(content, "fileOne.txt");
    }

    public static String[] getContentFolder(String dir) { // метод возврата содержимого папки в виде массива сирок
        File folder = new File(dir); // создали новый файл и поместили туда содержимое прошлой папки
        return folder.list();
    }

    public static void wrightToFile(String[] content, String fileName) {
        try (FileWriter fw = new FileWriter(fileName)) { // сделали try чтобы не было ошибки
            for (String str : content) {
                fw.write(str);
                fw.write(System.lineSeparator()); // для переноса на следующую строку
            }
        } catch (Exception e) {
            logger.warning("Ошибка записи в файл");
        }

    }

    public static void setLogger() {
        try {
            FileHandler fh = new FileHandler("loging.tx", true);
            logger.addHandler(fh);
            SimpleFormatter sf = new SimpleFormatter(); // переводим из формата xml в простой формат
            fh.setFormatter(sf);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
