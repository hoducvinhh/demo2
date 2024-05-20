package nextjv;

import java.util.Queue;
import java.util.PriorityQueue;

public class ViDuPriorityQueue {
    public static void main(String[] args)
    {
        Queue<String> danhSachSV =  new PriorityQueue<String>();

        danhSachSV.offer("TITV 1");
        danhSachSV.offer("Nguyen van b");
        danhSachSV.offer("Nguyen van a");
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
