package shapes;

public class Square extends Quadrilateral {
    public Square(double sides) {
        super(sides, sides);
    }

    @Override
    public double getPerimeter() {
        return (2 * length) + (2 * length);
    }



    @Override
    public double getArea() {
        return length * length;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

//    //constructor
//    public Square(int sides){
//        super(sides, sides);
//    }
//
//    // Override
//    @Override
//    public int getArea(){
//        //area = length x width
//        return length * length;
//    }
//
//   @Override
//    public int getPerimeter() {
//        //perimeter = 2 x length + 2 x width
//       return 4 * width;
//   }


}
