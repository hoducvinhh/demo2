public class Bai17_1
{
    protected String name;

    public Bai17_1(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void eat()
    {
        System.out.println("Toi dang an");
    }

    public void makeSound()
    {
        System.out.println("___________");
    }

    public void sleep()
    {
        System.out.println("zzzzzzzzzzzz");
    }
}