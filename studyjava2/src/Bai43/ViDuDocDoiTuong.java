package Bai43;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;


public class ViDuDocDoiTuong {
    public static void main(String[] args) {
        try {
            File file = new File("E:\\java\\studyjava2\\src\\Bai42\\file1.txt");
            InputStream is = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(is);
            SinhVien2 st = (SinhVien2) ois.readObject();
            System.out.println(st);
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
