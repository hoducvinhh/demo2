
public class Bai8 {
    private int day;
    private int month;
    private int year;

    public Bai8(int day, int month, int year) {
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

    public int getDay()
    {
        return this.day;
    }

    public void setDay(int d)
    {
        if(d <=30 && d>=1 )
        {
            this.day = d;
        }
    }

    public int getMonth()
    {
        return this.month;
    }

    public void setMonth(int m)
    {
        if(m <=12 && m >= 1)
        {
            this.month = m;
        }
    }

    public int getYear()
    {
        return this.year;
    }

    public void setYear(int y)
    {
        if(y > 0 )
        {
            this.year = y;
        }
    }
    @Override
    public String toString()
    {
        return this.day +"/"+ this.month +"/" +this.year;
    }


    public static void main(String[] args)
    {
        Bai8 md = new Bai8(25,1,2000);
        System.out.println("Day : " + md.getDay());
        md.setDay(35);
        System.out.println("Month : "+ md.getMonth());
        md.setMonth(2);
        System.out.println("Year : "+ md.getYear());
        md.setYear(2021);
        System.out.println("====");
        System.out.println("Day : " + md.getDay());
        System.out.println("Month : "+ md.getMonth());
        System.out.println("Year : "+ md.getYear());
        System.out.println("====");
        System.out.println("Year : "+ md.day);
        System.out.println("Year : "+ md.month);
        System.out.println("Year : "+ md.year);
         System.out.println("====");

         System.out.println(md);
         
    }


}
