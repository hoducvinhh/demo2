package nextjv;

import java.util.Arrays;

public class Bai28_2 {
    public static void main(String[] args)
    {
        Bai28_1 sv1 = new Bai28_1(150, "Tran Van Thanh","Lop 1",9);
        Bai28_1 sv2 = new Bai28_1(100, "Nguyen Thi THanh Hoa","Lop 2",8);
        Bai28_1 sv3 = new Bai28_1(100, "Nguyen Van An","Lop 2",8);

        Bai28_1[] a_sv = new Bai28_1[] {sv1,sv2,sv3};

        System.out.println("Ban dau : "+ Arrays.toString(a_sv));

        // ham sap xep
        Arrays.sort(a_sv);
        System.out.println("Sau khi sx: "+Arrays.toString(a_sv));
    }
}
