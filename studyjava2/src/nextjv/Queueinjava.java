package nextjv;

import java.util.Queue;
import java.util.LinkedList;

public class Queueinjava {
    public static void main(String[] args)
    {
        Queue<String> danhSachSV =  new LinkedList<String>();

        danhSachSV.offer("TITV 1");
        danhSachSV.offer("Nguyen van a");
        danhSachSV.offer("Nguyen van b");
        danhSachSV.offer("TITV 2");

        while(true)
        {
            String ten = danhSachSV.poll();
            if(ten == null)
            {
                break;
            }
            // peek : lay ra nhung khong xoa;
            // poll : lay ra va xoa;
            System.out.println(ten);
            
        }
    }
}
