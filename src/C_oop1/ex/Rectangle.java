package C_oop1.ex;

public class Rectangle {
    //속성과 기능을 다 가지고 있음.
    int width;
    int height;

    int calculateArea(){
        return width * height;
    }
    int calculatePerimeter(){
        return (width + height) * 2;
    }
    boolean isSquare(){
        return this.width == this.height;
    }

}
