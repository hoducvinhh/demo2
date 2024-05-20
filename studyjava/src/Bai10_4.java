public class Bai10_4 {
    public static void main(String[] args) {
        Bai10_1 ngay1 = new Bai10_1(15, 5, 2021);
        Bai10_1 ngay2 = new Bai10_1(15, 9, 2030);
        Bai10_1 ngay3 = new Bai10_1(15, 8, 2021);

        Bai10_2 tacGia1 = new Bai10_2("Tung", ngay1);
        Bai10_2 tacGia2 = new Bai10_2("Huang", ngay2);
        Bai10_2 tacGia3 = new Bai10_2("Tungrgfr", ngay3);

        Bai10_3 sach1 = new Bai10_3("Lap tring C", 5000, 2023, tacGia1);
        Bai10_3 sach2 = new Bai10_3("Lap tring Java", 10000, 2024, tacGia2);
        Bai10_3 sach3 = new Bai10_3("Lap tring PHP", 15000, 2023, tacGia3);

        sach1.inTenSach();
        sach2.inTenSach();
        sach3.inTenSach();

        System.out.println("=========");

        System.out.println("So sanh nam xuat ban 1 va 3: "+ sach1.kiemTraCungNamXuatBan(sach3));
        System.out.println("So sanh nam xuat ban 1 va 2: "+ sach1.kiemTraCungNamXuatBan(sach2));
        System.out.println("So sanh nam xuat ban 2 va 3: "+ sach2.kiemTraCungNamXuatBan(sach3));
        System.out.println("=========");
        sach1.ten();
        System.out.println("=========");

        System.out.println("Gia sach 1 sau khi giam la: "+ sach1.giaSauKhiGiam(10) );
        System.out.println("Gia sach 2 sau khi giam la: "+ sach2.giaSauKhiGiam(20) );
        System.out.println("Gia sach 3 sau khi giam la: "+ sach3.giaSauKhiGiam(50) );

    }
}
