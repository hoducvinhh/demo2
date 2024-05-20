package nextjv;


import java.util.Arrays;
public class Bai29
{
    public static void main(String[] args)
    {
        // ham split : Cách phân tách chuỗi thành mảng
        String s = "Xin chao cac ban, tui la Peter";

        String a[] = s.split(" "); // cat dua tren 1 khoang trang
        System.out.println(Arrays.toString(a));

        String b[] = s.split(","); // cat dua tren dau , ;
        System.out.println(Arrays.toString(b));

        String s2 = "Xin chao , minh la Perter . Minh la lap trinh vien";

        String c[] = s2.split("\\.|\\,"); // cat dua tren dau , va dau .;
        System.out.println(Arrays.toString(c));

        String s3 = "Nguyen Van A";

        String d[] = s3.split(" ");
        System.out.println(Arrays.toString(d));
        System.out.println("Ten :"+d[d.length-1]);

    }
}