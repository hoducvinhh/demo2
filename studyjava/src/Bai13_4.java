public class Bai13_4 {
    private Bai13_3 hangSanXuat;
    private Bai13_1 ngaySanXuat;
    private double giaBan;
    private double thoiGianBaoHanh;

    public Bai13_4(Bai13_3 hangSX, Bai13_1 ngay, double giaBan, double tg)
    {
        this.hangSanXuat = hangSX;
        this.ngaySanXuat = ngay;
        this.giaBan = giaBan;
        this.thoiGianBaoHanh = tg;
    }

    public Bai13_3 getHangSanXuat() {
        return this.hangSanXuat;
    }

    public void setHangSanXuat(Bai13_3 hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public Bai13_1 getNgaySanXuat() {
        return this.ngaySanXuat;
    }

    public void setNgaySanXuat(Bai13_1 ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public double getGiaBan() {
        return this.giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public double getThoiGianBaoHanh() {
        return this.thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(double thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public boolean soSanhGia(Bai13_4 khac)
    {
        return this.giaBan > khac.giaBan;
    }

    // public String layTenQG()
    // {
    //     return this.hangSanXuat.getQuocGia().getTenQG();
    // }

    public String layTenQG()
    {
        return this.hangSanXuat.lay();
    }
}
