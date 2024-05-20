public class Bai17_5 {
    public static void main(String[] args) 
    {
        System.out.println("Test Dog:");
        Bai17_2 d = new Bai17_2("Dog");
        d.eat();
        d.makeSound();
        d.sleep();

        System.out.println("======");

        System.out.println("Test cat:");
        Bai17_3 c = new Bai17_3("Cat");
        c.eat();
        c.makeSound();
        c.sleep();

        System.out.println("======");
        
        System.out.println("Test Bird:");
        Bai17_4 b = new Bai17_4("Bird");
        b.eat();
        b.makeSound();
        b.sleep();

        

    }
}
