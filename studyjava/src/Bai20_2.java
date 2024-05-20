public class Bai20_2 extends Bai20_5{
     private String loaiNhienLieu;

     public Bai20_2(String ten,String loaiNhienLieu,Bai20_1 hang)
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
        return 500;
     }

     public void catCanh()
     {
        System.out.println("Cat Canh");
     }

     public void haCanh()
     {
        System.out.println("Ha canh");
     }

}
