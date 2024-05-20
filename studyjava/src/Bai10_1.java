public class Bai10_1 {
    private int ngay;
    private int thang;
    private int nam;

    public Bai10_1(int ngay, int thang, int nam)
    {
        if(ngay >= 1 && ngay <=31)
        {
            this.ngay = ngay;
        }

        if(thang >=1 && thang <=12)
        {
            this.thang = thang;
        }

        if(nam > 0 )
        {
            this.nam = nam;
        }
    }

    public int getNgay()
    {
        return this.ngay;
    }

    public int getThang()
    {
        return this.thang;
    }

    public int getNam()
    {
        return this.nam;
    }

    public void setNgay(int d)
    {
        this.ngay = d;
    }

    public void setThang(int m)
    {
        this.thang = m;
    }

    public void setNam(int y)
    {
        this.nam = y;
    }
    
}
