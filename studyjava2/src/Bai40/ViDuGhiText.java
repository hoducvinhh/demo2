package Bai40;

import java.io.PrintWriter;

public class ViDuGhiText {
    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter("E:\\java\\studyjava2\\src\\Bai40\\file.txt", "UTF-8");
            pw.println("xin chao minh la titv");
            pw.print("du lieu: ");
            pw.print(3.14);
            pw.println(' ');
            pw.print("la so pi");
            pw.println();
            Student st = new Student(100, "Nguyen Van A");
            pw.print(st);
            // hoac pw.print(st.toString());
            pw.flush();
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
