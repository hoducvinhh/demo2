public class Bai19_3 extends Bai19_4{
    private double r;

    public Bai19_3(Bai19_1 td, double r)
    {
        super(td);
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double tinhDT()
    {
        return Math.PI*this.r*this.r;
    }
}
