package figure;

public class Kvadrat extends Figures {
    public Kvadrat (double x, double y) {
        super(x,y);
    }
    public Kvadrat (){

    }
    public double  getPerimetr() {
       return x*2+y*2;
    }

    public double  getArea() {
       return x*y;
    }

    @Override
    public String toString() {
        return " Квадрат , сторона "+ x +" периметр "+getPerimetr()+" площадь "+getArea();
    }


}
