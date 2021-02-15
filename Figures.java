package figure;

public abstract class Figures {
   double x;
   double y;
  public Figures (double x, double y) {
      this.x=x;
      this.y=y;
  }
  public Figures (){

  }

    public abstract double getPerimetr();
    public abstract double getArea();

}