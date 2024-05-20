package nextjv;

public class Bai23 {
    public static void main(String[] args)
    {
        String s1 = "titv.vn";
        String s2 = "TITV.VN";
        String s3 = "tỉtv.vn";

        // hàm equals(); so sanh 2 chuoi co giong nhau khong va co phan biet hoa thuong

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        // ham equalsIgnoreCase so sanh 2 chuoi  co giong nhau khong phan biet hoa thuong

        System.out.println(s1.equalsIgnoreCase(s2));

        // ham compareTo() so sanh 2 chuoi > < =;

        String sv1 = "Nguyen Van A";
        String sv2 = "Nguyen Van C";
        String sv3 = "Nguyen Van B";
        System.out.println(sv1.compareTo(sv2));
        System.out.println(sv1.compareTo(sv3));


        // ham compareTOIgnoreCase => tuong tu ham compareTo nhung bo qua ki hieu hoa thuong

        System.out.println(s1.compareToIgnoreCase(s2));

        // ham regionMatches => so sanh 1 doan

        String r1 = "TITV.vn";
        String r2 = "TV.v";

        boolean check = r1.regionMatches(2, r2, 0, 4);
        System.out.println(check);
        
        // ham starWith => ham kiem tra chuoi bat dau bang...

        String sdt = "037456789";
        System.out.println(sdt.startsWith("037"));
        System.out.println(sdt.startsWith("034"));
        

        // ham endsWith => ham kiem tra chuoi ket thuc bang...
        String tenFile = "T Love You.JPG";
        String tenFile2 = "Hoc Java.PDF";

        if(tenFile.endsWith(".JPG"))
        {
            System.out.println("FIle 1 la hinh anh");
        }
        else if (tenFile.endsWith(".PDF"))
        {
            System.out.println("File 1 laf file PDF");
        }

        if(tenFile2.endsWith(".JPG"))
        {
            System.out.println("FIle 1 la hinh anh");
        }
        else if(tenFile2.endsWith(".PDF"))
        {
            System.out.println("File 1 laf file PDF");
        }
       
    }
}
