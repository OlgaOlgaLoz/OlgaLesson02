package figure;

public class Krug extends Figures {
    public Krug (double x, double y) {
        super(x,y);
    }
    public Krug (){

    }
    public double  getPerimetr() {
            return 2*x*y;
    }

    public double  getArea() {
           return x*Math.pow(y, 2);
    }

    @Override
    public String toString() {
        return " Круг , радиус "+y+" периметр "+getPerimetr()+" площадь "+getArea();
    }

}
