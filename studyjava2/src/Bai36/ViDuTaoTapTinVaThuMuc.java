package Bai36;

import java.io.File;
import java.io.IOException;

public class ViDuTaoTapTinVaThuMuc
{
    public static void main(String[] args) {
        File folder1 = new File("E:\\java\\studyjava2\\src\\Bai36");
        File folder2 = new File("E:\\java\\studyjava2\\src\\Bai36.1");
        // kiem tra thuc muc hoac tap tin co ton tai hay khong
        System.out.println("Kiem tra folder1 co ton tai hay khong: "+folder1.exists());
        System.out.println("Kiem tra folder1 co ton tai hay khong: "+folder2.exists());

        //tao thu muc
        // phuong thuc mkdir() => tao 1 thu muc
        File d1 = new File("E:\\java\\studyjava2\\Directory_1");
        d1.mkdir();

        // phương thuc mkdirs(); => tao nhieu thu muc cùng lúc
        File d2 = new File("E:\\java\\studyjava2\\Directory_1\\Directory_2\\Directory_3\\Directory_4");
        d2.mkdirs();

        // tao ra 1 tap tin
        // co phan mo rong: .exe, .txt, .doc, .xls;
        File file1 = new File("E:\\java\\studyjava2\\Directory_1\\Vidu1.txt");
        try {
            file1.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        File file2 = new File("E:\\java\\studyjava2\\Directory_1\\Vidu2.doc");
        try {
            file2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
