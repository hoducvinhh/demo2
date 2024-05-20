public class Bai16_4 {
    public static void main(String[] args)
    {
        Bai16_3 bbd = new Bai16_3(" BB Dog");
      
        bbd.eat();
        bbd.bark();
        bbd.weep();

        System.out.println(" "+ bbd.getName());

        Bai16_2 d = new Bai16_2("Dog");

        d.eat();
        System.out.println(" "+ d.getName());


        
        
    }
}
