public class Bai10_3 {
    private String tenSach;
    private double giaBan;
    private int namXuatBan;
    private Bai10_2 tacGia;

    public Bai10_3(String tenSach, double giaBan, int namXuatBan, Bai10_2 tacGia)
    {
        this.tenSach = tenSach;
        this.giaBan = giaBan;
        this.namXuatBan = namXuatBan;
        this.tacGia = tacGia;
    }

    public void inTenSach()
    {
        System.out.println("Sach ten la: "+ this.tenSach);
    }

    public boolean kiemTraCungNamXuatBan(Bai10_3 sachKhac)
    {
        // if(this.namXuatBan == sachKhac.namXuatBan)
        // {
        //     return true;
        // }
        // else
        // {
        //     return false;
        // }
        return this.namXuatBan == sachKhac.namXuatBan;
    }

    public void ten()
    {
        System.out.println(""+this.tacGia.getTen());
    }

    public double giaSauKhiGiam(double x)
    {
        return this.giaBan - this.giaBan *(x/100);
    }
 
}
