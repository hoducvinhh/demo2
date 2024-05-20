package nextjv;

public class Bai27_2 {
    public static void main(String[] args)
    {
        Bai27_1 sv1 = new Bai27_1(150, "TITV 1","Lop 1",9);
        Bai27_1 sv2 = new Bai27_1(100, "TITV 2","Lop 2",8);
        System.out.println(sv1.compareTo(sv2));
    }
}
