package nextjv;

/*
 * một người chơi sẽ có tài khoản
 * người chơi có quên đặt cược số tiền ít hơn hoặc bằng số tiền họ đang có
 * luật chơi như saU:
 * có 3 viên xúc xắc . mỗi viên xúc xắc có 6 măth có giá trị từ 1 đến 6. mỗi lần lắc sẽ ra 1 kết quả
 * kết quả = giá trị xx1 + xx2 + xx3
 * 1.nếu tổng bằng 3 hoặc 18 thì cái ăn hết, người chơi thua
 * 2.nếu tổng bằng 4 đến 10 thì xỉu => nếu người chơi đặt xỉu thì người chơi thắng , ngược lại thua
 * 3.nếu tổng 11 đến 17 thì tài => nếu người chơi đặt tài thì người chơi thắng, ngược lại thua
 */

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;

public class Bai30 {
    public static void main(String[] args)
    {
        double taiKhoanNguoiChoi = 5000000.99;
        Scanner sc = new Scanner(System.in);
        Locale lc = new Locale("vi","VN");

        NumberFormat numf= NumberFormat.getInstance(lc);

        int luachon = 0;
        do
        {
            System.out.println("___________MOI BAN LUA CHON___________");
            System.out.println("Chon 1 de tiep tuc choi.");
            System.out.println("Chon phim bat ky de thoat.");
            luachon = sc.nextInt();
            if(luachon ==1)
            {
                System.out.println("***BAT DAU CHOI.");
                System.out.println("***Tai khoan cua ban: "+numf.format(taiKhoanNguoiChoi)+"  Ban muon cuoc bao nhieu?");
                double datCuoc = 0;
                do
                {
                    System.out.println("***Dat cuoc (0<so tien cuoc<="+ numf.format(taiKhoanNguoiChoi)+":");
                    datCuoc = sc.nextDouble();
                }while(datCuoc <= 0 || datCuoc > taiKhoanNguoiChoi);

                int luaChonTX = 0;
                do
                {
                    System.out.println(("***Chon 1: Tai / Chon 2: Xiu"));
                    luaChonTX = sc.nextInt();
                }while(luaChonTX !=1 &&  luaChonTX !=2);

                // tung xuc xac

                Random xucxac1 = new Random();
                Random xucxac2 = new Random();
                Random xucxac3 = new Random();

                int giatri1 = xucxac1.nextInt(5)+1;
                int giatri2= xucxac2.nextInt(5)+1;
                int giatri3 = xucxac3.nextInt(5)+1;

                // tinh toan ket qua
                int tong = giatri1+ giatri2 +giatri3;
                System.out.println("Ket qua: "+giatri1+"-"+giatri2+"-"+giatri3);
                if(tong ==3 || tong ==18)
                {
                    System.out.println("***Tong la: "+tong+"Nha cai an het , ban da thua");
                    taiKhoanNguoiChoi -= datCuoc;
                    System.out.println("***Tai khoan con lai cua ban la: "+numf.format(taiKhoanNguoiChoi));
                }
                else if(tong >=4 && tong <= 10)
                {
                    System.out.println("***Tong la: "+tong+"=> Xiu");
                    if(luaChonTX == 2)
                    {
                        System.out.println("***Ban da thang cuoc.");
                        taiKhoanNguoiChoi += datCuoc;
                        System.out.println("***Tai khoan cua ban la: "+numf.format(taiKhoanNguoiChoi));
                    }
                    else{
                        System.out.println("Ban da thua cuoc.");
                        taiKhoanNguoiChoi -= datCuoc;
                        System.out.println("***Tai khoan cua ban la: "+numf.format(taiKhoanNguoiChoi));
                    }
                }
                else
                {
                    System.out.println("***Tong la: "+tong+"=> Xiu");
                    if(luaChonTX == 1)
                    {
                        System.out.println("***Ban da thang cuoc.");
                        taiKhoanNguoiChoi += datCuoc;
                        System.out.println("***Tai khoan cua ban la: "+numf.format(taiKhoanNguoiChoi));
                    }
                    else{
                        System.out.println("Ban da thua cuoc.");
                        taiKhoanNguoiChoi -= datCuoc;
                        System.out.println("***Tai khoan cua ban la: "+numf.format(taiKhoanNguoiChoi));
                    }
                }
            }
        }while(luachon ==1);
        sc.close();
        System.out.println("Ban da thoat game!");
    }
}


