package Bai34;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class TuDien {
    private Map<String, String> duLieu = new TreeMap<>();


    public String themTu(String tuKhoa, String yNghia)
     {
         return this.duLieu.put(tuKhoa,yNghia);
     }

     public String xoaTu(String tuKhoa)
     {
        return this.duLieu.remove(tuKhoa);
     }

     public String traTu(String tuKhoa)
     {
        String yNghia = this.duLieu.get(tuKhoa);
        return yNghia;
     }

     public void inTuKhoa()
     {
        Set<String> tapHopTu = this.duLieu.keySet();
        System.out.println(Arrays.toString(tapHopTu.toArray()));
     }

     public int laySoLuong()
     {
        return this.duLieu.size();
     }

     public void xoaTatCa()
     {
        this.duLieu.clear();
     }

     public static void main(String[] args)
     {
        TuDien tuDien = new TuDien();
        int luaChon = 0;
        Scanner sc = new Scanner(System.in);
        do {
              System.out.println("=======================");
              System.out.println("MENU ");
              System.out.println("Tra tu dien Anh Viet: \n"
                +"1. Them tu(tu khoa , y nghia)\n"
                +"2. xoa tu\n"
                +"3. tim y nghia cua tu khoa -> tra tu\n"
                +"4. in ra danh sach tu khoa\n"
                +"5. in ra so luong tu\n"
                +"6. xoa tat ca cac tu khoa\n"
                +"0. thoa chuong trinh"
                +""
              );
                luaChon = sc.nextInt();
                sc.nextLine();
              if(luaChon ==1 )
              {
                System.out.println("Nhap vao tu khoa: ");
                String tuKhoa = sc.nextLine();
                System.out.println("Nhap vao y nghia: ");
                String yNghia = sc.nextLine();
                tuDien.themTu(tuKhoa, yNghia);
              }
              else if(luaChon ==2 || luaChon ==3)
              {
                System.out.println("Nhap vao tu khoa");
                String tuKhoa = sc.nextLine();
                if(luaChon ==2)
                {
                    tuDien.xoaTu(tuKhoa);
                }
                else{
                    System.out.println("Y nghia cu tu la: "+tuDien.traTu(tuKhoa));
                }
              }
              else if(luaChon ==4)
              {
                tuDien.inTuKhoa();
              }
              else if(luaChon ==5)
              {
                System.out.println("So luong tu khoa la: "+tuDien.laySoLuong());
              }
              else if(luaChon ==6)
              {
                tuDien.xoaTatCa();
                System.out.println("Tat cac cac tu da bi xoa");
              }
        } while (luaChon !=0);
        sc.close();
     }
}
