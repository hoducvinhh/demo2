public class Bai13_5 {
    public static void main(String[] args)
    {
        Bai13_1 ngay1 = new Bai13_1(15,8,2025);
        Bai13_1 ngay2 = new Bai13_1(1,3,2025);
        Bai13_1 ngay3 = new Bai13_1(6,9,2025);

        Bai13_2 quocGia1 = new Bai13_2("VN","Viet Nam");
        Bai13_2 quocGia2 = new Bai13_2("USA","Hoa Ky");
        Bai13_2 quocGia3 = new Bai13_2("TW","Ba Lan");

        Bai13_3 hangSX1 = new Bai13_3("VNLaptop",quocGia1);
        Bai13_3 hangSX2 = new Bai13_3("Macbook",quocGia2);
        Bai13_3 hangSX3 = new Bai13_3("Asus",quocGia3);

        Bai13_4 mayTinh1 = new Bai13_4(hangSX1,ngay1,1500,12);
        Bai13_4 mayTinh2 = new Bai13_4(hangSX2,ngay2,2000,12);
        Bai13_4 mayTinh3 = new Bai13_4(hangSX3,ngay3,1000,12);

        System.out.println("Gia may1 > may 2: "+ mayTinh1.soSanhGia(mayTinh2));
        System.out.println("Gia may1 > may 3: "+ mayTinh1.soSanhGia(mayTinh3));
        System.out.println("Gia may3 > may 2: "+ mayTinh3.soSanhGia(mayTinh2));

        System.out.println("Ten qg may1: "+mayTinh1.layTenQG());
        System.out.println("Ten qg may2: "+mayTinh2.layTenQG());
        System.out.println("Ten qg may3: "+mayTinh3.layTenQG());
    }
}
