public class Bai12_3 {
    private String maSV;
    private String hoVaTen;
    private Bai12_2 ngaySinh;
    private double diemTrungBinh;
    private Bai12_1 lopHoc;

    public Bai12_3(String maSV, String hoVaTen, Bai12_2 ngaySinh, double diemTrungBinh, Bai12_1 lopHoc)
    {
        this.maSV = maSV;
        this.hoVaTen = hoVaTen;
        this.ngaySinh = ngaySinh;
        this.diemTrungBinh = diemTrungBinh;
        this.lopHoc = lopHoc;
    }

    public String getmaSV()
    {
        return this.maSV;
    }

    public void setMaSV(String maMoi)
    {
        this.maSV = maMoi;
    }

    public String getHoVaTen()
    {
        return this.hoVaTen;
    }

    public void setHoVaTen(String hoVaTenMoi)
    {
        this.hoVaTen = hoVaTenMoi;
    }

    public Bai12_2 getNgaySinh()
    {
        return this.ngaySinh;
    }

    public void setNgaySinh(Bai12_2 ngaySinhMoi)
    {
        this.ngaySinh = ngaySinhMoi;
    }

    public double getDiemTB()
    {
        return this.diemTrungBinh;
    }

    public void setDiemTB(double diemMoi)
    {
        this.diemTrungBinh = diemMoi;
    }

    public Bai12_1 getLopHoc()
    {
        return this.lopHoc;
    }

    public void setLopHoc(Bai12_1 lopMoi)
    {
        this.lopHoc = lopMoi;
    }

    public String layTenKhoa()
    {
        return this.lopHoc.getKhoa();
    }

    public boolean kiemTra()
    {
       return this.diemTrungBinh >= 5;
    }

    public boolean kiemTraNgaySinh(Bai12_3 sVkhac)
    {
       return this.ngaySinh.equals(sVkhac.ngaySinh);
    }
}

