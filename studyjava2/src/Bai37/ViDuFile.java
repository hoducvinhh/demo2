package Bai37;

import java.io.File;
import java.util.Scanner;

public class ViDuFile {

     File file;

    public ViDuFile(String tenFile)
    {
        this.file = new File(tenFile);
    }

    public boolean kiemTraThucThi()
    {
        //kiem tra file co the thuc thi
        return this.file.canExecute();
    }

    public boolean kiemTrDoc()
    {
        // kiem tra file co the doc
        return this.file.canRead();
    }

    public boolean kiemTraGhi()
    {
        // kiem tra file co the ghi
        return this.file.canWrite();
    }

    public void inDuongDan()
    {
        System.out.println(this.file.getAbsolutePath());
    }

    public void inTen()
    {
        System.out.println(this.file.getName());
    }

    public void kiemTraLaThuMucHoacTapTin()
    {
        if(this.file.isDirectory())
        {
            System.out.println("Day la thu muc");
        }
        else if(this.file.isFile())
        {
            System.out.println("Day la tap tin");
        }
    }

    public void inDanhSachCacFileCon()
    {
        if(this.file.isDirectory())
        {
            System.out.println("Cac tap tin con/ thu muc con la: ");
           File[] mangCon =  this.file.listFiles();
           for (File file : mangCon) {
                System.out.println(file.getAbsolutePath());
           }
        }
        else if(this.file.isFile())
        {
            System.out.println("Day la tap tin , khong co tap con ben trong");
        }
    }

    public void inCayThuMuc()
    {
        this.inChiTietCayThuMuc(this.file, 1);
    }

    public void inChiTietCayThuMuc(File f, int bac)
    {
        for(int i=0; i<bac; i++)
        {

            System.out.print("\t");
        }
            System.out.print("|__");
            System.out.println(f.getName());
            if(f.canRead() && f.isDirectory())
            {
                File[] mangcon = f.listFiles();
                for(File fx : mangcon)
                {
                    inChiTietCayThuMuc(fx, bac+1);
                }
            }
        }
    
    public static void main(String[] args) {
        int luaChon = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten file: ");
        String tenFile = sc.nextLine();
        ViDuFile vdf = new ViDuFile(tenFile);
        do{
            System.out.println("================MENU==============");
            System.out.println("1. kiem tra file co the thuc thi");
            System.out.println("2. kiem tra file co the  doc");
            System.out.println("3. kiem tra file co the ghi");
            System.out.println("4. in duong dan");
            System.out.println("5. in ten file");
            System.out.println("6. kiem tra file la thu muc hoac tap tin");
            System.out.println("7. in ra danh sach file con");
            System.out.println("8. in ra cay thu muc");
            System.out.println("0. thoat chuong trinh");

            luaChon = sc.nextInt();
            switch(luaChon)
            {
                case 1:
                {
                    System.out.println(vdf.kiemTraThucThi());
                    break;
                }
                case 2:
                {
                    System.out.println(vdf.kiemTrDoc());
                    break;
                }
                case 3:
                {
                    System.out.println(vdf.kiemTraGhi());
                    break;
                }
                case 4:
                {
                    vdf.inDuongDan();
                    break;
                }
                case 5:
                {
                    vdf.inTen();
                    break;
                }
                case 6:
                {
                    vdf.kiemTraLaThuMucHoacTapTin();
                    break;
                }
                case 7:
                {
                    vdf.inDanhSachCacFileCon();
                    break;
                }
                case 8:
                {
                    vdf.inCayThuMuc();
                    break;
                }
                default:
                {
                    break;
                }
            }
            sc.nextLine();
        }while(luaChon !=0);
        sc.close();
    }
}
// E:\java\studyjava2\src\Bai37
//E:\java\studyjava2\Directory_1\Directory_2\Directory_3\Directory_4
