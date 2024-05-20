package Bai45;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;


public class ViDu_FlowLayout extends JFrame {
    public ViDu_FlowLayout()
    {
        this.setTitle("Viduflowlayout");
        this.setSize(600,400);
        // can giua cua so chuong trinh
        this.setLocationRelativeTo(null);
       
    //set layout

    //FlowLayout flowlayout = new FlowLayout();
    //FlowLayout flowlayout_2 = new FlowLayout(FlowLayout.RIGHT);
    FlowLayout flowlayout_3 = new FlowLayout(FlowLayout.CENTER,50,50);
        //this.setLayout(flowlayout);
        this.setLayout(flowlayout_3);

    JButton jButton_1 = new JButton("1");
    JButton jButton_2 = new JButton("2");
    JButton jButton_3 = new JButton("3");

    // add thanh phan
    this.add(jButton_1);
    this.add(jButton_2);
    this.add(jButton_3);

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     this.setVisible(true);
    }
        public static void main(String[] args)
    {
        new ViDu_FlowLayout();
    }
}





