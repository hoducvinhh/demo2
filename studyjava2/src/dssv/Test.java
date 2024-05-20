package dssv;

import java.util.Scanner;

public class Test {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        DanhSachSinhVIen dssv = new DanhSachSinhVIen();
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
                SinhVien sv = new SinhVien(maSinhVien, hoVaTen, namSinh, diemTrungBinh);
                dssv.themSinhVien(sv);
             }  
             else if(luachon ==2)
             {
                dssv.inDanhSachSinhVien();
             }
             else if(luachon ==3)
             {
                System.out.println("Kiem tra danh sach rong: "+dssv.kiemTraDanhSachRong());
             }
             else if(luachon ==4)
             {
                System.out.println("So luong sinh vien hien tai: "+dssv.laySoLuongSinhVien());
             }
             else if(luachon ==5)
             {
                dssv.lamRongDanhSach();
                System.out.println("Danh sach da duoc lam rong.");
             }
             else if(luachon ==6)
             {
                System.out.println("Nhap ma sinh vien: ");
                String maSinhVien = sc.nextLine();
                SinhVien sv = new SinhVien(maSinhVien);
                System.out.println("Kiem tra sinh vien co trong danh sach: "+ dssv.kiemTraTonTai(sv));
             }
             else if(luachon ==7)
             {
                System.out.println("Nhap ma sinh vien: ");
                String maSinhVien = sc.nextLine();
                SinhVien sv = new SinhVien(maSinhVien);
                System.out.println("Xoa sinh vien trong danh sach: ");
                dssv.xoaSinhVien(sv);
             }
             else if(luachon ==8)
             {
                System.out.println("Nhap ho va ten: ");
                String hoVaTen = sc.nextLine();
                System.out.println("Ket qua tin kiem: ");
                dssv.timSinhVien(hoVaTen);
             }
             else if(luachon ==9)
             {
                dssv.sapXepSinhVienGiamDanTheoDiem();
                dssv.inDanhSachSinhVien();
             }

    }while(luachon != 0);

    sc.close();
    }
    
}

