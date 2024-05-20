public class Bai10_2 {

    private String tenTacGia;
    private Bai10_1 ngaySinh;

    public Bai10_2(String ten, Bai10_1 ngaySinh)
    {
        this.tenTacGia = ten;
        this.ngaySinh = ngaySinh;
    }

    public String getTen()
    {
        return this.tenTacGia;
    }

    public Bai10_1 getNgaySinh()
    {
        return ngaySinh;
    }

    public void setTen(String tenMoi)
    {
        this.tenTacGia = tenMoi;
    }

    public void setNgaySinh(Bai10_1 ngayMoi)
    {
        this.ngaySinh = ngayMoi;
    }

    

    
    
}

