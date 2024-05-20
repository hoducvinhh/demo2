public class Bai18_2 {
    public static void main(String[] args)
    {
        Bai18_1 mm = new Bai18_1();

        System.out.println(mm.timMin(5.5,6.5));
        System.out.println(mm.timMin(5 ,6));

        System.out.println("tong: "+mm.tinhTong(5.0,6.0));
        double arr[] = new double[] {1,2,3,4,5};

        System.out.println("tong: "+mm.tinhTong(arr));
    }
}
