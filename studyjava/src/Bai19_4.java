public abstract class Bai19_4 {
    protected Bai19_1 toaDo;
    public Bai19_4(Bai19_1 toaDo)
    {
        this.toaDo = toaDo;
    }
    public Bai19_1 getToaDo() {
        return toaDo;
    }
    public void setToaDo(Bai19_1 toaDo) {
        this.toaDo = toaDo;
    }

    public abstract double tinhDT();
    
}