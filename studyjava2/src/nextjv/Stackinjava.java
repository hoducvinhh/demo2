package nextjv;


import java.util.Scanner;
import java.util.Stack;

public class Stackinjava {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Stack<String> stackChuoi = new Stack<String>();
        //stackChuoi.push("giaitri") => dua gia tri vao stack
        //stackChuoi.pop() => lay gia tri ra xoa khoi stack
        // stackChuoi.peek() => lay gia tri ra nhung khong xoa
        //stackChuoi.clear() => xoa tat ca phan tu trong stack
        // stackChuoi.contains("giaitri") => xac dinh gia tri co ton tai trong stack hay khong
        //stackChuoi.size() => do lon

        // vi du dao nguoc chuoi
        System.out.println("Nhap vao chuoi");
        String s = sc.nextLine();
        for(int i=0;i<s.length();i++)
        {
            stackChuoi.push(s.charAt(i)+"");
        }

        System.out.println("Chuoi dao nguoc");
        for(int i=0;i<s.length();i++)
        {
            System.out.print(stackChuoi.pop());
        }
        System.out.println("");
        //vi du chuyen tu he thap phan sang he nhi phan

        System.out.println("Nhap 1 so nguyen suong tu ban phim");
        Stack<String> stackSoDu = new Stack<String>();
        int x = sc.nextInt();
        while(x>0)
        {
            int soDu = x%2;
            stackSoDu.push(soDu+"");
            x/=2;
        }
        System.out.println("So ni phan la: ");
        int n = stackSoDu.size();
        for(int i=0;i<n; i++)
        {
            System.out.print(stackSoDu.pop());
        }
        System.out.println("");
        sc.close();
    }
}
