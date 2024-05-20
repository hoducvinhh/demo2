package Bai43;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class DanhSachSinhVIen2 {
    private ArrayList<SinhVien2> danhSach;

    public DanhSachSinhVIen2(ArrayList<SinhVien2> danhSach) {
        this.danhSach = danhSach;
    }

    public DanhSachSinhVIen2()
    {
        this.danhSach = new ArrayList<SinhVien2>();
    }
    // 1.them sinh vien vao danh sach
    public void themSinhVien(SinhVien2 sv)
    {
        this.danhSach.add(sv);
    }
    //2.in danh sach sinh vien
    public void inDanhSachSinhVien()
    {
        for (SinhVien2 sinhvien : danhSach) {
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
    public boolean kiemTraTonTai(SinhVien2 sv)
    {
        return this.danhSach.contains(sv);
    }

    //7. xoa 1 sinh vien ra khoi danh sach
    public boolean xoaSinhVien(SinhVien2 sv)
    {
        return this.danhSach.remove(sv);
    }

    //8.tim kiem tat ca sinh vien dua tren ten duoc tu ban phim
    public void timSinhVien(String ten)
    {
        for (SinhVien2  sinhvien: danhSach) {
            if(sinhvien.getHoVaTen().indexOf(ten)>= 0)
            {
                System.out.println(sinhvien);
            }
        }
    }

    //9.xuat ra danh sach sinh vien co diem tu cao den thap
    public void sapXepSinhVienGiamDanTheoDiem()
    {
        
        Collections.sort(this.danhSach,new Comparator<SinhVien2>(){
            @Override
            public int compare(SinhVien2 sv1,SinhVien2 sv2)
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

     //10. ghi xuong file

     public void ghiDuLieuXuongFile(File file)
     {
       
        try {
            
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oss = new ObjectOutputStream(os);

            for (SinhVien2 sinhvien : danhSach) {
                oss.writeObject(sinhvien);
            }
          
            oss.flush();
            oss.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
     }

    
    //11. doc xuong file

     public void docDuLieuTuFile(File file)
     {
       
        try {
            
            InputStream is = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(is);

            SinhVien2 sv = null;
            while (true) {
               
               Object oj  = ois.readObject();
                if(oj== null)
                {
                    break;
                }
                if(oj != null)
                {
                   sv = (SinhVien2) oj;
                   this.danhSach.add(sv);
                }
            }
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
     }

    
}
