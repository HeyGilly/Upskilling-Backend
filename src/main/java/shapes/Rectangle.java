package shapes;

public class Rectangle {

    protected int length;
    protected int width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    public int getArea(int length, int width){
        //area = length x width
        return length * width;
    }

    public int getPerimeter(int length, int width){
        //perimeter = 2 x length + 2 x width
        return (2*length) + (2* width);
    }


}
