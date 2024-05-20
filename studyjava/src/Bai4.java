/*
import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args)
    {
        double mang[];

        mang = new double[10];

        Scanner input = new Scanner(System.in);
        for(int i=0;i<mang.length;i++)
        {
            System.out.println("Nhap phan tu thu "+ i + ":" );
            mang[i] = input.nextDouble();
        }
    }
}
*/


/* 
import java.util.Scanner;

public class Bai4
{
   static Scanner input = new Scanner(System.in);

   public static void nhapMang(int a[], int n)
   {
        for(int i=0;i<a.length; i++)
        {
            a[i] = input.nextInt();
        }
   }
   public static void inMang(int a[], int n)
   {
        for(int i=0;i<a.length;i++)
        {
            System.out.printf(a[i]+" ");
        }
   }
    public static void main(String[] args)
    {
        int n;
        System.out.println("Nhap n: ");
        n = input.nextInt();
        int a[] = new int[5];
        nhapMang(a, n);
        inMang(a, n);
    }
}
*/

import java.util.Scanner;

public class Bai4
{
    public static void main(String[] args)
    {
        String str;
        Scanner input = new Scanner(System.in);
        str = input.nextLine();
        System.out.println(str.toLowerCase()); // bien chu hoa thanh chu thuong
        System.out.println(str.length()); // tinh do dai cua mot chuoi
        // int n = Integer.parseInt(str)  ep kieu  mot chuoi thanh mot so
        // float f = Float.parseFloat(str);
        // double d = Double.parseDouble(str);
        // boolean flag = Boolean.parseBoolean(str);
        // char c = str.charAt(0);
        //str.compareTo(str2) so sanh 2 chuoi tra ve true false
        //str.compareToIgnoreCase(str2) so sanh 2 chuoi khong phan biet hoa thuong
        // str.contains("hello") kiem tra chuoi str co chua chuoi hello khong
        // str.concat("hello"); noi them chuoi hello vao sai chuoi str
        
        
        System.out.println(str);
        input.close();
    }
}