package nextjv;

public class Bai25
{
    public static void main(String[] args)
    {
       String s1 = "tItv" ;
       String s2 = ".Vn";
       String s3 = s1 + s2;
       // ham concat => noi chuoi

       String s4 = s1.concat(s2);

       System.out.println("s3= "+s3);
       System.out.println("s4= "+s4);

       // ham replace => thay the
       String s5 = "Tung.vn";
        String s6 = s5.replaceAll("Tung", "TItv");
       System.out.println("s6 ="+ s6);

        // ham toLowerCase => chuyen het ve viet thuong
        // ham toUpperCase => chuyen het ve viet hoa

        String s7 = s3.toLowerCase();
        String s8 = s3.toUpperCase();
        System.out.println("s7 = "+s7);
        System.out.println("s8 = "+s8);

        // ham trim() => xoa khoang trang du thua o dau chuoi
        String s9 = "     xin chao cac ban , minh la titv.vn   ";
        System.out.println(s9.trim());

        // ham substring => cat chuoi con
        String s10 =  "xin chao cac ban , minh la titv.vn";
        String s11 = s10.substring(10);
        String s12 = s10.substring(10,15);

        System.out.println("s11 ="+s11);
        System.out.println("s12 ="+s12);

    }
}