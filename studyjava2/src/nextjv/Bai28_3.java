package nextjv;

import java.util.Arrays;
public class Bai28_3 {
    public static int[] reverse(int x[])
    {
        int[] rs = new int[x.length];
        int index =0;
        for(int i = x.length-1; i>=0 ; i--)
        {
            rs[index] = x[i];
            index ++;
        }
        return rs;
    }
    public static void main(String[] args)
    {
        int a[] = new int[] {1,8,2,6,4,3,7,9};
        int b[] = new int[15];


        // 
        System.out.println("Mang a ban dau: "+Arrays.toString(a));

        // ham sap xep tang dan
        Arrays.sort(a);
        System.out.println("a sau khi sap xep: "+Arrays.toString(a));

        // ham tim kiem
        System.out.println(Arrays.binarySearch(a,4));
        System.out.println(Arrays.binarySearch(a,-1));

        // ham dien gia tri
        Arrays.fill(b,5);
        System.out.println("Mang b sau khi dien: "+Arrays.toString((b)));

        // ham sap xep giam dan
        Arrays.sort(a);
        a = Bai28_3.reverse(a);
        System.out.println("a sau khi sap xep giam dan: "+Arrays.toString(a));
    }
}
