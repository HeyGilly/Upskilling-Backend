package shapes;

public class Rectangle extends Quadrilateral implements Measurable{
    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return this.length * this.width;
    }

    @Override
    public double getArea() {
        return (2* this.length) + (2* this.width);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }


//    protected int length;
//    protected int width;
//
//    //Constructor
//    public Rectangle(int length, int width){
//        this.length = length;
//        this.width = width;
//    }
//
//    public int getArea(){
//        //area = length x width
//        return this.length * this.width;
//    }
//
//    public int getPerimeter(){
//        //perimeter = 2 x length + 2 x width
//        return (2* this.length) + (2* this.width);
//    }




}
