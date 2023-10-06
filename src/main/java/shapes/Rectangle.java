package shapes;

public class Rectangle {

    protected int length;
    protected int width;

    //Constructor
    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    public int getArea(){
        //area = length x width
        return this.length * this.width;
    }

    public int getPerimeter(){
        //perimeter = 2 x length + 2 x width
        return (2* this.length) + (2* this.width);
    }


}
