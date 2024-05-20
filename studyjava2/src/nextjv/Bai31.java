package nextjv;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Bai31 {
    public static void main(String[] args)
    {   
        // ham lay thoi gian hien tai
        long t1 = System.currentTimeMillis();
        for(int i=0;i<10;i++)
        {
            System.out.println("Test");
        }
        long t2 = System.currentTimeMillis();

        System.out.println("Truoc khi chay for: "+t1);
        System.out.println("Sau khi chay for: "+t2);
        System.out.println("Thoi gian: "+ (t2 - t1)+ "mls");

        // TiemUnit chuyen doi ngay gio , gio giay , ......

        System.out.println("3000 nam: "+ TimeUnit.DAYS.toSeconds(3000*365)+ "s");
        System.out.println("25h : "+TimeUnit.HOURS.toSeconds(25)+"s");


        // Date 
         Date d = new Date(System.currentTimeMillis());
        //System.out.println(d.getDate() + "/"+(d.getMonth() +1)+"/" + (d.getYear()+1900));

        // Calendar
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.DATE)+"/"+(c.get(Calendar.MONTH)+1)+"/"+c.get(Calendar.YEAR));

        // dateformat

        DateFormat df = new SimpleDateFormat();

        System.out.println(df.format((d)));
        df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(df.format(d));
    }
}
