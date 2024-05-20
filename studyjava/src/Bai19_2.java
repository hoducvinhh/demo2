public class Bai19_2 extends Bai19_4 {
    private double chieuR;
    private double chieuC;

    public Bai19_2(Bai19_1 toaDO, double cr, double cc)
    {
        super(toaDO);
        this.chieuR = cr;
        this.chieuC = cc;
    }

    public double getChieuR() {
        return chieuR;
    }

    public void setChieuR(double chieuR) {
        this.chieuR = chieuR;
    }

    public double getChieuC() {
        return chieuC;
    }

    public void setChieuC(double chieuC) {
        this.chieuC = chieuC;
    }

    @Override
    public double tinhDT() {
       return this.chieuC *this.chieuR;
    }

    
}
