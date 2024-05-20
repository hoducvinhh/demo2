/* 
import java.util.Scanner;

public class Bai3 {
    public static void main (String[] args)
    {
        // cau lenh dieu kien if...else
        Scanner input = new Scanner(System.in);
        float a ,b;
        System.out.println("Nhap so a: ");
        a = input.nextFloat();
        System.out.println("Nhap so b: ");
        b = input.nextFloat();

        if(a == 0)
        {
            if(b == 0)
            {
                System.out.println("Phuong trinh vo so nghiem");
            }
            else
            {
                System.out.println("Phuong trinh vo nghiem");
            }
        }
        else
        {
            System.out.println("Phuong trinh co nghiem duy nhat la : "+ -b/a);
        }
    }
}
*/

/* 
import java.util.Scanner;

public class Bai3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double a,b,c,x1,x2,delta;
        System.out.println("Nhap so a: ");
        a = input.nextDouble();
        System.out.println("Nhap vao b: ");
        b = input.nextDouble();
        System.out.println("Nhap vao c: ");
        c = input.nextDouble();
        input.close();
        if(a ==0)
        {
            if(b ==0)
            {
                if(c==0)
                {
                    System.out.println("Phuong trinh vo so nghiem");
                }
                else
                {
                    System.out.println("Phuong trinh vo nghiem");
                }
            }
            else
            {
                System.out.println("Phuong trinh co nghiem suy nhat: "+ -c/b );
            }
        }
        else
        {
            delta = b*b - 4*a*c;
            if(delta <0)
            {
                System.out.println("Phuong trinh vo nghiem");
            }
            else if(delta ==0 )
            {
                System.out.println("Phuong trinh co nghiem kep: " + -b/(float)2*a);
            }
            else
            {
                x1 = (-b + Math.sqrt(delta))/(2*a);
                x2 = (-b -Math.sqrt(delta))/(2*a);
                System.out.println("Phuong trinh co hai nghiem phan biet: ");
                System.out.println(x1);
                System.out.println(x2);
            }
        }
    }
}

*/

/* 
import java.util.Scanner;

public class Bai3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        input.close();
        switch(n)
        {
            case 1: 
            {
            System.out.println("T");
            break;
            }
            default :
             System.out.println("Tks");
        }

    }
}
*/

///* 
import java.util.Scanner;

public class Bai3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vap so nguyen n: " );
        int n  = input.nextInt();
        input.close();
        // for(int i=0;i<10;i++)
        // {
        //     System.out.println(i);
        // }
        // while(true)
        // {
        //     System.out.println("hello");
        // }

        String nhiPhan = "";
        while(n!=0)
        {
            nhiPhan = (n%2) + nhiPhan;
            n /= 2;
        }
        System.out.println("He nhi phan la: ");
        System.out.println(nhiPhan);
    }
}
// */

 /* 
import java.util.Scanner;

public class Bai3
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        int n =0;
        try
        {
            System.out.println("Nhap vao so nguyen n: ");
             n = input.nextInt();
        }
        catch(Exception e)
        {
            System.out.println("Nhap di lieu khong dung" );
        }
        finally
        {
            System.out.println("FINALLY");
        }
        System.out.println("Gia tri vua nhap la: "+ n);
        input.close();
    }
}
*/