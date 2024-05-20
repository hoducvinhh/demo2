package Bai44;

import javax.swing.JFrame;

public class ViDu
{
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setTitle("Vi Du JFrame");
        jf.setSize(600,400);
        jf.setVisible(true);

        // gan vi tri hien thi
        jf.setLocation(300,300);
            // thoat khoi chuong trinh khi dong cua so JFrame
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // cho phep hien thi
        jf.setVisible(true);
    }
}