package shapes;

public class Square extends Quadrilateral {
    public Square(double sides) {
        super(sides, sides);
    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }



    @Override
    public double getArea() {
        return length * length;
    }

    @Override
    public void setLength(double sides) {
        setWidth(sides);
        this.length = sides;
    }

    @Override
    public void setWidth(double side) {
        setLength(side);
        this.width = side;
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
