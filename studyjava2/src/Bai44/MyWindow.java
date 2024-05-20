package Bai44;

import javax.swing.JFrame;

public class MyWindow extends JFrame{
    public MyWindow(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void showit()
    {
        this.setVisible(true);
    }

    public void showit(String title)
    {
        this.setTitle(title);
        this.setVisible(true);
    }

    public void showit(String title, int width, int height)
    {
        this.setTitle(title);
        this.setSize(width, height);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        MyWindow m1 = new MyWindow();
        m1.showit();

        MyWindow m2 = new MyWindow();
        m2.showit("Window 2");

        MyWindow m3 = new MyWindow();
        m3.showit("Window 3", 600, 400);
    }
}
