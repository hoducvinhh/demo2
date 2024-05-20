public abstract class Bai20_5 {
    protected String tenLoaiPhuongTien;
    protected Bai20_1 hangSanXuat;

    public Bai20_5(String tenLoaiPhuongTien,Bai20_1 hangSX)
    {
        this.tenLoaiPhuongTien = tenLoaiPhuongTien;
        this.hangSanXuat = hangSX;
    }

    public String getTenLoaiPhuongTien() {
        return this.tenLoaiPhuongTien;
    }

    public void setTenLoaiPhuongTien(String tenLoaiPhuongTien) {
        this.tenLoaiPhuongTien = tenLoaiPhuongTien;
    }

    public Bai20_1 getHangSanXuat() {
        return this.hangSanXuat;
    }

    public void setHangSanXuat(Bai20_1 hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public String layTenHangSX()
    {
        return this.hangSanXuat.getTenHangSX();
    }
    
    public void batDau()
    {
        System.out.println("Bat Dau...");
    }

    public void tangToc()
    {
        System.out.println("Tang toc...");
    }

    public void dungLai()
    {
        System.out.println("Dung lai...");
    }


    public abstract double layVanToc();
    
}
