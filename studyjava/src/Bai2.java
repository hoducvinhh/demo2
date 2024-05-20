/* 
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Nhap vao a: ");
        //int a = input.nextInt();
        System.out.println("Nhap vao b: ");
        //int b = input.nextInt();
        
        //int tong = a+b;
        //System.out.println(a+ " + " +b+ " = " +tong);

        boolean x = true;
        System.out.println(!x);

    }
}
*/

/* 
import java.util.Scanner;

public class Bai2
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("Nhap vao so a: ");
        int a = input.nextInt();

        a+=3;
        System.out.println("a+=3 = "+a);

    }
}
*/

/* 
import java.util.Scanner;

public class Bai2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Nhap so a ");
        int a = input.nextInt();
        System.out.printf("Nhap so b: ");
        int b = input.nextInt();

        System.out.println(a+ " = " +b+ " : " + (a==b));
        System.out.println(a+ " != "+b+ " : "+ (a!=b));
        System.out.println(a+ " < "+b+ " : "+ (a<b)); 
        System.out.println(a+ " > "+b+" : "+(a>b));
    }
}

*/

/* 
import java.util.Scanner;
 public class Bai2
 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so a: ");
        int a = input.nextInt();

        String ketQua = (a%2==0)?"so chan":"so le";
        System.out.println(a+" la "+ketQua);
    }
 }
*/

/*
import java.util.Scanner;

public class Bai2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double r, dienTich,chuVi;
        System.out.println("Nhap ban kinh la: ");
        r = input.nextDouble();
        input.close();
        chuVi = r*2*Math.PI;
        System.out.println("Chu vi la: "+ chuVi);
        System.out.println("Chu vi la: "+ Math.round(chuVi));
        System.out.println("Chu vi la: "+ Math.round(chuVi*100.0)/100.0);
        
        
        //   cac ham thong dung : 
        //   ham tri tuyet doi Math.abs(a);
        //   ham tim min Math.min(a,b);
        //   ham tim max Math.max(a,b);
        //   ham tim ceil Math.ceil(a); lam tron len so lon
        //   ham tim floor Math.floor(a); lam tron xuong so nho
        //   ham can bac 2 Math.sqrt(a);
        //   ham tinh mu Math.pow(a,b);
         
    }
}
*/