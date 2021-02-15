package figure;

public class Praym extends Figures {
   public Praym (double x, double y) {
       super(x,y);
   }
    public Praym (){

    }
    public double  getPerimetr() {

       return x*2+y*2;
  }

    public double  getArea() {

       return x*y;
    }

    @Override
    public String toString() {
        return " Прямоугольник , стороны: "+x+";"+y +" периметр "+getPerimetr()+" площадь "+getArea();
    }

}
