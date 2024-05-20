package Bai43;

import java.io.File;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        DanhSachSinhVIen2 dssv1 = new DanhSachSinhVIen2();
        int luachon =0;
    do
    {
        System.out.println("==============MENU===========");
        System.out.println("Vui long lua chon chuc nang.");
        System.out.println(
            
              "1.   Them sinh vien vao danh sach.\n"
             +"2.   In danh sach sinh vien ra man hinh\n"
             +"3.   Kiem tra danh sach co rong hay khong\n"
             +"4.   Lay ra so luong sinh vien trong sanh sach\n"
             +"5.   Lam rong danh sach sinh vien\n"
             +"6.   Kiem tra sinh vien co ton tai trong danh sach hay khong, dua tren ma sinh vien\n"
             +"7.   Xoa mot sinh vien ra khoi danh sach dua tren ma sinh vien\n"
             +"8.   Tim kiem tat ca sinh vien dua trn ten duoc nhap tu ban phim\n"
             +"9.   Xuat ra danh sach sinh vien co diem tu cao den thap\n"
             +"10.  Luu danh sach sinh vien xuong tap tin\n"
             +"11.  Doc danh sach sinh vien xuong tap tin\n"
             +"0.   Thoat khoi chuong trinh\n"
             +"");

             luachon = sc.nextInt();
             sc.nextLine();
             if(luachon ==1)
             {
                System.out.println("Nhap ma sinh vien: ");
                String maSinhVien = sc.nextLine();
                System.out.println("Nhap ho va ten: ");
                String hoVaTen = sc.nextLine();
                System.out.println("Nhap nam sinh: ");
                int namSinh = sc.nextInt();
                System.out.println("Nhap diem trung binh: ");
                float diemTrungBinh = sc.nextFloat();
                SinhVien2 sv = new SinhVien2(maSinhVien, hoVaTen, namSinh, diemTrungBinh);
                dssv1.themSinhVien(sv);
             }  
             else if(luachon ==2)
             {
                dssv1.inDanhSachSinhVien();
             }
             else if(luachon ==3)
             {
                System.out.println("Kiem tra danh sach rong: "+dssv1.kiemTraDanhSachRong());
             }
             else if(luachon ==4)
             {
                System.out.println("So luong sinh vien hien tai: "+dssv1.laySoLuongSinhVien());
             }
             else if(luachon ==5)
             {
                dssv1.lamRongDanhSach();
                System.out.println("Danh sach da duoc lam rong.");
             }
             else if(luachon ==6)
             {
                System.out.println("Nhap ma sinh vien: ");
                String maSinhVien = sc.nextLine();
                SinhVien2 sv = new SinhVien2(maSinhVien);
                System.out.println("Kiem tra sinh vien co trong danh sach: "+ dssv1.kiemTraTonTai(sv));
             }
             else if(luachon ==7)
             {
                System.out.println("Nhap ma sinh vien: ");
                String maSinhVien = sc.nextLine();
                SinhVien2 sv = new SinhVien2(maSinhVien);
                System.out.println("Xoa sinh vien trong danh sach: ");
                dssv1.xoaSinhVien(sv);
             }
             else if(luachon ==8)
             {
                System.out.println("Nhap ho va ten: ");
                String hoVaTen = sc.nextLine();
                System.out.println("Ket qua tin kiem: ");
                dssv1.timSinhVien(hoVaTen);
             }
             else if(luachon ==9)
             {
                dssv1.sapXepSinhVienGiamDanTheoDiem();
                dssv1.inDanhSachSinhVien();
             }
             else if(luachon == 10)
             {
               System.out.println("Nhap ten file: ");
               String tenFile = sc.nextLine();
               File f = new File(tenFile);
               dssv1.ghiDuLieuXuongFile(f);
             }
             else if(luachon == 11)
             {
               System.out.println("Nhap ten file: ");
               String tenFile = sc.nextLine();
               File f = new File(tenFile);
               dssv1.docDuLieuTuFile(f);
             }

    }while(luachon != 0);

    sc.close();
    }
    
}

