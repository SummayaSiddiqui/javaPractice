public class Demo {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        Rectangle r3 = new Rectangle();
        Rectangle r4 = new Rectangle(2,5);
        Rectangle r5 = new Rectangle(4,6);
        Rectangle r6 = new Rectangle(3,7);


        System.out.println(r1.getLength() + ", " + r1.getWidth());
        System.out.println("Area = " + r1.getArea());
        System.out.println("Perimeter = " + r1.getPerimeter());
        r1.setLength(4);
        System.out.println(r1.getLength() + ", " + r1.getWidth());
        System.out.println("Area = " + r1.getArea());
        System.out.println("Perimeter = " + r1.getPerimeter());
        r1.setWidth(2);
        System.out.println(r1.getLength() + ", " + r1.getWidth());
        System.out.println("Area = " + r1.getArea());
        System.out.println("Perimeter = " + r1.getPerimeter());
        

        System.out.println(r1.toString());
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);


        // wrote it to display
        // r1.display();
        // r2.display();
        // r3.display();
        // r4.display();
        // r5.display();
        // r6.display();
    }
}

