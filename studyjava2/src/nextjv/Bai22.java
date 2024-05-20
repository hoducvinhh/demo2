package nextjv;

import java.util.Scanner;

public class Bai22 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Nhap vao chuoi: ");
        s = sc.nextLine();
        System.out.println("==========");
        sc.close();

        // ham length() => lấy ra độ dài của chuỗi;
        System.out.println(s.length());
        int dodai = s.length();

        // hàm charAt(vị trí); => lấy ra 1 kí tự tại vị trí
        for(int i=0;i<dodai ;i++)
        {
            System.out.println("Vị trí "+i+"là: "+s.charAt(i));
        }

        // hàm getChars(vi tri bắt đầu, vị trí kết thúc, mảng lưu dữ liệu, vị trí bắt đầu lưu của mảng);
        char arrChar[] = new char[100];
        s.getChars(2, 4, arrChar, 0);

        for(int i=0;i< arrChar.length;i++)
        {
            System.out.println("Gia tri cua mang tai "+i+" la: "+arrChar[i]);
        }

        byte arrBytes[] = s.getBytes();
        for(byte b : arrBytes)
        {
            System.out.println(b);
        }
    }
}
