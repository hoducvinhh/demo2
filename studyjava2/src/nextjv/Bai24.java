package nextjv;

public class Bai24 {
    public static void main(String[] args)
    {
        String s1 = "Xin chao co chu, xin chao cac ban, Xin chao!";
        String s2 = "Xin chao";
        String s3 = "Xin chao 123";
        //char c1 = 'o';
        // ham indexOf
        System.out.println(s1.indexOf(s2));
        System.out.println(s1.indexOf(s3));

        //su dung vi tri bat dau
        //System.out.println(s1.indexOf(s2, 2));
        //System.out.println(s1.indexOf(s2, 0));

        //tim kiem char
        //System.out.println(s1.indexOf(c1, 2));

        // ham lastIndexOf => tim kiem tu phai san trai
        //System.out.println(s1.lastIndexOf(s2));

        
    }
}
