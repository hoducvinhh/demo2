public class Bai14_2 extends Bai14_1
{
    private String tenLop;
    private String tenTruong;

    public Bai14_2(String hoVaTen, int namSinh, String tenLop, String tenTruong)
    {
        super(hoVaTen, namSinh);
        this.tenLop = tenLop;
        this.tenTruong = tenTruong;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public String getTenTruong() {
        return tenTruong;
    }

    public void setTenTruong(String tenTruong) {
        this.tenTruong = tenTruong;
    }

    public void lamBT()
    {
        System.out.println(".......");
    }
}
