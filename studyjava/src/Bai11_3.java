public class Bai11_3 {
    private String tenPhim;
    private int namSanXuat;
    private Bai11_2 hSX;
    private double giaVe;
    private Bai11_1 ngayChieu;

    public Bai11_3(String tenPhim, int namSanXuat, Bai11_2 hSX , double giaVe, Bai11_1 ngayChieu)
    {
        this.tenPhim = tenPhim;
        this.namSanXuat = namSanXuat;
        this.hSX = hSX;
        this.giaVe = giaVe;
        this.ngayChieu = ngayChieu;
    }


    
    public String getTenPhim() {
        return tenPhim;
    }



    public int getNamSanXuat() {
        return namSanXuat;
    }



    public Bai11_1 getNgayChieu() {
        return ngayChieu;
    }



    public boolean kiemTraGiaVe(Bai11_3 khac)
    {
        return this.giaVe < khac.giaVe;
    }

    public String tenHangPhim()
    {
        return this.hSX.getHangSanXuat();
    }

    public double giaSauKhiGiam(double x)
    {
        return this.giaVe - this.giaVe *(x/100);
    }

}
