package shapes;

public class Circle {

    private  double radius;
    private int keepCount;

    public void addKeepCount(){
       ++keepCount;
    };

    public int showCount(){
        return keepCount;
    }





    public Circle(){
    }

//    area = pi x (radius ^ 2)
    public double getArea(double radius){
        return Math.PI * Math.pow(radius, 2);
    }

    public double getCircumference(double radius){
        return 2 * Math.PI * radius;
    }



}
