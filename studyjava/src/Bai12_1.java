public class Bai12_1 {
    private String tenLop;
    private String tenKhoa;

    public Bai12_1(String tenL, String tenK )
    {
        this.tenLop = tenL;
        this.tenKhoa = tenK;
    }

    public String getLop()
    {
        return this.tenLop;
    }

    public void setLop(String lopMoi)
    {
        this.tenLop = lopMoi;
    }

    public String getKhoa()
    {
        return this.tenKhoa;
    }

    public void setKhoa(String khoaMoi)
    {
        this.tenKhoa = khoaMoi;
    }

    
}
