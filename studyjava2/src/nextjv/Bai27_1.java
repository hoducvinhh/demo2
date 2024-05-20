package nextjv;

public class Bai27_1 implements Comparable<Bai27_1>{
    private int maSinhVien;
    private String hoVaTen;
    private String tenLop;
    private double diemTrungBinh;

    public Bai27_1(int maSinhVien, String hoVaTen, String tenLop, double diemTrungBinh) {
        this.maSinhVien = maSinhVien;
        this.hoVaTen = hoVaTen;
        this.tenLop = tenLop;
        this.diemTrungBinh = diemTrungBinh;
    }

    public int getMaSinhVien() {
        return this.maSinhVien;
    }

    public void setMaSinhVien(int maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoVaTen() {
        return this.hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getTenLop() {
        return this.tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public double getDiemTrungBinh() {
        return this.diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    public String getTen()
    {
        String s = this.hoVaTen.trim();
        s = s.trim();
        if(s.indexOf(" ") >=0)
        {
            int vt = s.lastIndexOf(" ");
            return s.substring(vt+1);
        }
        else{
            return s;
        }
    }
    @Override
    public int compareTo(Bai27_1 o) {
        // <0
        // =0
        // >0

        String tenThis = this.getTen();
        String tenO = o.getTen();
        return tenThis.compareTo(tenO);
    }
    

    
}
