public class Bai20_6 {
    public static void main(String[] args)
    {
        Bai20_1 h1 = new Bai20_1("Hang 1","Viet Nam");
        Bai20_1 h2 = new Bai20_1("Hang 2","Usa");
        Bai20_1 h3 = new Bai20_1("Hang 3","Nhat Ban");

        Bai20_5 p1 = new Bai20_3("oto","Dau", h1);
        Bai20_2 p2 = new Bai20_2("May bay","Xang",h2);
        Bai20_5 p3 = new Bai20_4("Xe Dap",h3);

        System.out.println("p1 "+ p1.layTenHangSX());
        p2.batDau();
        System.out.println("p1 "+ p3.layVanToc());
        p2.catCanh();
    }
}
