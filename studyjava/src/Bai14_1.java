public class Bai14_1
{
    private String hoVaTen;
    private int namSinh;

    public Bai14_1(String hoTen, int namSinh)
    {
        this.hoVaTen = hoTen;
        this.namSinh = namSinh;
    }

    public String getHoVaTen() {
        return this.hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public int getNamSinh() {
        return this.namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public void an()
    {
        System.out.println("mam mam");
    }

    public void uong()
    {
        System.out.println("uc uc");
    }

    public void ngu()
    {
        System.out.println("kho kho");
    }
    
}