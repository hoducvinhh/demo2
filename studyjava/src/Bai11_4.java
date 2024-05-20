public class Bai11_4 {
    public static void main(String[] args)
    {
        Bai11_1 ngay1 = new Bai11_1(15,5,2022);
        Bai11_1 ngay2 = new Bai11_1(31,1,2025);
        Bai11_1 ngay3 = new Bai11_1(16,2,2030);

        Bai11_2 hangSanXuat1 = new Bai11_2("Hang A","Viet Nam");
        Bai11_2 hangSanXuat2 = new Bai11_2("Hang B","My");
        Bai11_2 hangSanXuat3 = new Bai11_2("Hang C", " Ba Lan");

        Bai11_3 boPhim1 = new Bai11_3("Bo Gia",2020, hangSanXuat1, 65000,ngay1 );
        Bai11_3 boPhim2 = new Bai11_3("Running Man",2021, hangSanXuat2, 100000,ngay2 );
        Bai11_3 boPhim3 = new Bai11_3("Kham Pha",2025, hangSanXuat3, 115000,ngay3);

        System.out.println("So sanh gia 1 re hon 2: " +boPhim1.kiemTraGiaVe(boPhim2));
        System.out.println("So sanh gia 1 re hon 3: " +boPhim1.kiemTraGiaVe(boPhim3));
        System.out.println("So sanh gia 3 re hon 2: " +boPhim3.kiemTraGiaVe(boPhim2));

        System.out.println("Ten hang san xuat 1 la: "+boPhim1.tenHangPhim());
        System.out.println("Ten hang san xuat 2 la: "+boPhim2.tenHangPhim());
        System.out.println("Ten hang san xuat 3 la: "+boPhim3.tenHangPhim());
    }
}
