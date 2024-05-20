public class Bai12_4 {
    public static void main(String[] args)
    {
        Bai12_2 ngay1 = new Bai12_2(15,1,2000);
        Bai12_2 ngay2 = new Bai12_2(17,2,2001);
        Bai12_2 ngay3 = new Bai12_2(19,7,2002);

        Bai12_1 lop1 = new Bai12_1("DH01", "Khoa cong nghe thong tin");
        Bai12_1 lop2 = new Bai12_1("DH02", "Khoa khoa hoc may tinh");
        Bai12_1 lop3 = new Bai12_1("DH03", "Khoa an ninh mang");

        Bai12_3 sv1 = new Bai12_3("0001", "Tung ITV", ngay1, 9.0,lop1);
        Bai12_3 sv2 = new Bai12_3("0001", "Tung ITV", ngay2, 4.0,lop2);
        Bai12_3 sv3 = new Bai12_3("0001", "Tung ITV", ngay3, 6.0,lop3);

        System.out.println("SV1: "+sv1.layTenKhoa());
        System.out.println("SV2: "+sv2.layTenKhoa());
        System.out.println("SV3: "+sv3.layTenKhoa());

        System.out.println("SV1: "+sv1.kiemTra());
        System.out.println("SV2: "+sv2.kiemTra());
        System.out.println("SV3: "+sv3.kiemTra());

        System.out.println("SV1 va SV2: " + sv1.kiemTraNgaySinh(sv2));
   }
}
