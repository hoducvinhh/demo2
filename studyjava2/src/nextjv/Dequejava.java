package nextjv;

import java.util.ArrayDeque;
import java.util.Deque;

public class Dequejava {
        public static void main(String[] args)
        {
            Deque<String> danhSachSV =  new ArrayDeque<String>();
    
            danhSachSV.offer("TITV 1");
            danhSachSV.offer("Nguyen van b");
            danhSachSV.offer("Nguyen van a");
            danhSachSV.offer("TITV 2");
            danhSachSV.offerLast("TITV 4");
            danhSachSV.offerFirst("TITV 0");
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

