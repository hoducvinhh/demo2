public class Bai18_1 {
    public int timMin(int a, int b) {
        if (a < b)
        {
            return a;
        } else {
            return b;
        }
    }

    public double timMin(double a, double b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }


    public double tinhTong(double a, double b)
    {
        return a+b;    
    }

    public double tinhTong(double arr[])
    {
        double tong = 0;
        for(int i=0;i<arr.length;i++)
        {
            tong += arr[i];
        }
        return tong;
    }

}