package Bai42;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ViDuGhiDoiTuong1 {
    public static void main(String[] args) {
        

        try {
            File file = new File("E:\\java\\studyjava2\\src\\Bai42\\file1.txt");
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oss = new ObjectOutputStream(os);

            SinhVien1 st = new SinhVien1("001", "titv", 2000, 10);
            oss.writeObject(st);
            oss.flush();
            oss.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
