public class Bai12_2 {
    private int ngay;
    private int thang;
    private int nam;

    public Bai12_2(int ngay,int thang,int nam)
    {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
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

    public void setNgay(int ngayMoi)
    {
        this.ngay = ngayMoi;
    }

    public void setThang(int thangMoi)
    {
        this.thang = thangMoi;
    }

    public void setNam(int namMoi)
    {
        this.nam = namMoi;
    }

    
    

    
    

    


    @Override
    public boolean equals (Object obj)
    {
        if(this == obj)
        {
            return true;
        }
        if(obj == null)
        {
            return false;
        }
        if(getClass()!= obj.getClass())
        {
            return false;
        }
        Bai12_2 other = (Bai12_2) obj;

        if(ngay != other.ngay )
        {
            return false;
        }
        if(thang != other.thang )
        {
            return false;
        }
        if(nam != other.nam )
        {
            return false;
        } 
        return true;
    }

}
