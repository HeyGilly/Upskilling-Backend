package shapes;

public class Square extends Rectangle {

    //constructor
    public Square(int sides){
        super(sides, sides);
    }

    // Override
    @Override
    public int getArea(){
        //area = length x width
        return length * length;
    }

   @Override
    public int getPerimeter() {
        //perimeter = 2 x length + 2 x width
       return 4 * width;
   }


}
