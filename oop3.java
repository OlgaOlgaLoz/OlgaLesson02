package figure;

public class oop3 {
    public static void main(String[] args) {
        Point Point1=new Point(0,0);
        Point1.setX(4);
        Point1.setY(5);

        Praym Praym1=new Praym(Point1.getX(), Point1.getY());
        Praym1.getPerimetr();
        Praym1.getArea();

        System.out.println(Praym1.toString());

        Point1.setX(8);
        Point1.setY(8);

        Kvadrat Kvadrat1=new Kvadrat(Point1.getX(), Point1.getY());
        Kvadrat1.getPerimetr();
        Kvadrat1.getArea();

        System.out.println(Kvadrat1.toString());

        Point1.setX(3.14);
        Point1.setY(8);

        Krug Krug1=new Krug(Point1.getX(), Point1.getY());
        Krug1.getPerimetr();
        Krug1.getArea();

        System.out.println(Krug1.toString());

    }

}
