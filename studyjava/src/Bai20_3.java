public class Bai20_3 extends Bai20_5{

    private String loaiNhienLieu;

    public Bai20_3(String ten, String loaiNhienLieu,Bai20_1 hang)
    {
        super(ten,hang);
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public String getLoaiNhienLieu() {
        return this.loaiNhienLieu;
    }

    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }

    @Override
    public double layVanToc()
    {
        return 60;
    }
    
}