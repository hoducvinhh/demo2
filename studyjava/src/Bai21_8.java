public class Bai21_8 {
    public static void main(String[] args)
    {
        Bai21_2 mfx500 = new Bai21_2();
        Bai21_3 mvn500 = new Bai21_3();

        System.out.println("5+3= "+mfx500.cong(5,3 ));
        System.out.println("4*5= "+mvn500.nhan(4,5));
        System.out.println("4/0= "+mvn500.chia(4,0 ));

        double[] arr = new double[] {5,1,3,4,5,8,0};
        double[] arr2 = new double[] {6,2,7,9,2,4,5};

        Bai21_5 sxchen = new Bai21_5();
        sxchen.sapXepTang(arr);
        for(int i= 0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        Bai21_6 sxchon  = new Bai21_6();
        sxchon.sapXepGiam(arr2);
        System.out.println("       ");
        for(int i= 0;i<arr2.length;i++)
        {
            System.out.print(arr2[i]+" ");
        }
        System.out.println("       ");


    }
}
