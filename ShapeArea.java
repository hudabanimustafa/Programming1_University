package Assignment;

public class ShapeArea {

    public static void main(String[]args){
        // Rectangle
        int Rectangle_L1=4;
        int Rectangle_L2=6;

        int RectangleArea = Rectangle_L1 * Rectangle_L2;
        System.out.println("The Area Of Rectangle = "+RectangleArea);

        // Triangle
        double TriangleHeight = 4;
        double TriangleBase = 5.6;
        // formula area = 0.5 x base x height is used to calculate the area of a triangle
        double TriangleArea = 0.5 * TriangleBase * TriangleHeight;
        System.out.println("The Area of Triangle ="+TriangleArea);

        /*
        circle
        formula area = pi x radius x radius.
        pi is represented by the Math.PI constant.
         */
        double radius = 7.6;
        double Area = Math.PI * radius * radius;
        System.out.println("Area of the circle: " + Area);



    }

    public ShapeArea() {
    }
}
