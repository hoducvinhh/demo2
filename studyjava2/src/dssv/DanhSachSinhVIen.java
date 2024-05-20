package dssv;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class DanhSachSinhVIen {
    private ArrayList<SinhVien> danhSach;

    public DanhSachSinhVIen(ArrayList<SinhVien> danhSach) {
        this.danhSach = danhSach;
    }

    public DanhSachSinhVIen()
    {
        this.danhSach = new ArrayList<SinhVien>();
    }
    // 1.them sinh vien vao danh sach
    public void themSinhVien(SinhVien sv)
    {
        this.danhSach.add(sv);
    }
    //2.in danh sach sinh vien
    public void inDanhSachSinhVien()
    {
        for (SinhVien sinhvien : danhSach) {
            System.out.println(sinhvien);
        }
    }

    //3. kiem tra danh sach rong
    public boolean kiemTraDanhSachRong()
    {
        return this.danhSach.isEmpty();
    }

    // 4.lay ra so luong sinh vien trong danh sach
    public int laySoLuongSinhVien()
    {
        return this.danhSach.size();
    }

    // 5.lam rong danh sach sinh vien

    public void lamRongDanhSach()
    {
        this.danhSach.removeAll(danhSach);
    }

    //6.kiem tra sinh vien co ton tai trong danh sach hay khong
    public boolean kiemTraTonTai(SinhVien sv)
    {
        return this.danhSach.contains(sv);
    }

    //7. xoa 1 sinh vien ra khoi danh sach
    public boolean xoaSinhVien(SinhVien sv)
    {
        return this.danhSach.remove(sv);
    }

    //8.tim kiem tat ca sinh vien dua tren ten duoc tu ban phim
    public void timSinhVien(String ten)
    {
        for (SinhVien  sinhvien: danhSach) {
            if(sinhvien.getHoVaTen().indexOf(ten)>= 0)
            {
                System.out.println(sinhvien);
            }
        }
    }

    //9.xuat ra danh sach sinh vien co diem tu cao den thap
    public void sapXepSinhVienGiamDanTheoDiem()
    {
        
        Collections.sort(this.danhSach,new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien sv1,SinhVien sv2)
            {
                if(sv1.getDiemTrungBinh() < sv2.getDiemTrungBinh())
                {
                    return 1;
                }
                else if(sv1.getDiemTrungBinh() > sv2.getDiemTrungBinh())
                {
                    return -1;
                }
                else
                {
                    return 0;
                }
            }
        });
    }

}
