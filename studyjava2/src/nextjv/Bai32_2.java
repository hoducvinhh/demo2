package nextjv;

public class Bai32_2 {
    private Bai32_1 thu;
    private String cacMonHoc;

    public Bai32_2(Bai32_1 thu, String cacMonHoc)
    {
        this.thu = thu;
        this.cacMonHoc = cacMonHoc;
    }

    public Bai32_1 getThu()
    {
        return this.thu;
    }

    public void setThu(Bai32_1 thu)
    {
        this.thu = thu;
    }

    public String getCacMonHoc()
    {
        return this.cacMonHoc;
    }

    public void setCacMonHoc(String cacMonHoc)
    {
        this.cacMonHoc = cacMonHoc;
    }

    @Override
    public String toString()
    {
        return "Thu: "+ thu+", Cac mon hoc: "+ cacMonHoc ;
    }
    
}
