public class Bai19_5 {
    public static void main(String[] args)
    {
        Bai19_1 td1 = new Bai19_1(5,5);
        Bai19_1 td2 = new Bai19_1(7,9);
        Bai19_1 td3 = new Bai19_1(12,1);

        Bai19_4 h1 = new Bai19_6(td1);
        Bai19_4 h2 = new Bai19_3(td2,10);
        Bai19_4 h3 = new Bai19_2(td3, 5,10);

        System.out.println("Dt1: "+h1.tinhDT());
        System.out.println("Dt2: "+h2.tinhDT());
        System.out.println("Dt3: "+h3.tinhDT());

    }
}
