public class Bai15_1 {
    
    protected String name;
    
    public Bai15_1(String name)
    {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat()
    {
        System.out.println("I'm eating");
    }
}
