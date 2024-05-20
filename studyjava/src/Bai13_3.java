public class Bai13_3 {
    private String tenHangSanXuat;
    private Bai13_2 quocGia;

    public Bai13_3(String tenHangSanXuat, Bai13_2 quocGia)
    {
        this.tenHangSanXuat = tenHangSanXuat;
        this.quocGia = quocGia;
    }

    public String getTenHangSanXuat() {
        return this.tenHangSanXuat;
    }

    public void setTenHangSanXuat(String tenHangSanXuat) {
        this.tenHangSanXuat = tenHangSanXuat;
    }

    public Bai13_2 getQuocGia() {
        return this.quocGia;
    }

    public void setQuocGia(Bai13_2 quocGia) {
        this.quocGia = quocGia;
    }

    public String lay()
    {
        return this.quocGia.getTenQG();
    }
}
