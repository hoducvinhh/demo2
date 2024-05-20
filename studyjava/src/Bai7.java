public class Bai7 
{

    private String tenCaPhe;
    private double giaTien1kg;
    private double khoiLuong;


public Bai7(String ten,double gia, double kl)
    {
    this.tenCaPhe = ten;
    this.giaTien1kg = gia;
    this.khoiLuong = kl;
    }
    public double tinhTongTien()
    {
        return this.giaTien1kg * this.khoiLuong;
    }

    public void tenCP()
    {
        System.out.println(" "+ this.tenCaPhe);
    }
    public boolean kiemTra1(double kl)
    {
        // if(kl < this.khoiLuong)
        // {
        //     return true;
        // }
        // else
        // return false;
        return this.khoiLuong > kl;
    }
    public boolean kiemTra2()
    {
        return this.tinhTongTien() > 500000;
    }
    public double giamGia(double x)
    {
        if(this.kiemTra2())
         return this.tinhTongTien() * (x/100);
         else return 0;
    }
    public double thanhToan(double x)
    {
        return this.tinhTongTien()- this.giamGia(x);
    }
    public static void main(String[] args)
    {
        Bai7 hd = new Bai7("Trung Nguyen", 100000, 8);
        System.out.println("Tong Tien: "+ hd.tinhTongTien());

        System.out.println("Kiem tra khoi luong > 2kg: " + hd.kiemTra1(2));

        System.out.println("Kiem tra hoa don > 500k: " + hd.kiemTra2());
        
        System.out.println("So tien giam : "+ hd.giamGia(3));

        System.out.println("So tien phai thanh toan la: "+ hd.thanhToan(3));

    }
    
}
