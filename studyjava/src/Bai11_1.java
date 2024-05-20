public class Bai11_1 {
    private int ngay;
    private int thang;
    private int nam;

    public Bai11_1(int ngay, int thang, int nam)
    {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    public int getNgay()
    {
        return this.ngay;
    }

    public void setNgay(int day)
    {
        this.ngay = day;
    }

    public int getThang()
    {
        return this.thang;
    }

    public void setThang(int month)
    {
        this.thang = month;
    }

    public int getNam()
    {
        return this.nam;
    }

    public void setNam(int year)
    {
        this.nam = year;
    }
}
