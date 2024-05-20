package Bai35;

public class TestBox2 {
    public static void main(String[] args) {
        Box2<Integer> b1 = new Box2<Integer>(15);
        System.out.println("Gia tri: "+b1.getvalue());

        Box2<String> b2  = new Box2<String>("hello titv");
        System.out.println("Gia tri: "+b2.getvalue());

        Box2 <Double> b3 = new Box2<Double>(15.5);
        System.out.println("Gia tri: "+b3.getvalue());


    }
}
