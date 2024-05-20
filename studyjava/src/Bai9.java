public class Bai9 {
    private int day;
    private int month;
    private int year;

    public Bai9(int day, int month, int year) {
        if (day <= 30 && day >= 1) {
            this.day = day;
        } else {
            System.out.println("INVALID");
        }

        if (month <= 12 && month >= 1) {
            this.month = month;
        } else {
            System.out.println("INVALID");
        }

        if (year >= 1) {
            this.year = year;
        } else {
            System.out.println("INVALID");
        }
    }

    @Override
    public boolean equals(Object obj)
    {
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(this.getClass() != obj.getClass())
            return false;
        
        Bai9 other = (Bai9) obj;

        if(this.day!= other.day)
            return false;
        if(this.month != other.month)
            return false;
        if(this.year != other.year)
            return false;
        return true;
    }

    @Override

    public int hashCode()
    {
        final int prime = 31;
        int result =1;
        result = prime * result +day;
        result = prime * result +month;
        result = prime * result + year;
        return result;
    }

    public static void main(String[] args)
    {
        Bai9 md = new Bai9(5,6,2020);
        Bai9 md1 = new Bai9(4 ,7,2021);
        Bai9 md2 = new Bai9(5,6 ,2020);

        System.out.println("md = md1 :" + md.equals(md1));
        System.out.println("md = md2 : "+ md.equals(md2));
        System.out.println("md1 = md2 :" + md1.equals(md2));

        System.out.println("Hashcode md :" + md.hashCode() );
        System.out.println("Hashcode md1 :" + md1.hashCode());
        System.out.println("Hashcode md2: " + md2.hashCode());
        
    }

    
}