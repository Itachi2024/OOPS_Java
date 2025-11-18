// 6. Create a class Rectangle with attributes length and width, each defaulting to 1. The class should include set and get methods for both attributes, and a method to calculate the area of the rectangle.
public class Rectangle {
    private double length;
    private double width;

    public Rectangle(){
        length=1;
        width=1;
    }
    public Rectangle(double length , double width){
        this.length=length;
        this.width=width;

    }
    public double getLength(){
        return this.length;
    }
    public double getWidth(){
        return this.width;

    }
    public void setLength(double length) {
       if (length > 0) {
           this.length = length;
       } else {
           System.out.println("Length must be positive.");
       }
   }
    public void setWidth(double width) {
       if (length > 0) {
           this.width = width;
       } else {
           System.out.println("Width must be positive.");
       }
}
    public double calculateArea() {
       return length * width;
   }
   
   public static void main(String[] args) {
       Rectangle rectangle = new Rectangle();
       System.out.println("Default Area: " + rectangle.calculateArea());

       rectangle.setLength(5);
       rectangle.setWidth(4);
       System.out.println("Updated Area: " + rectangle.calculateArea());

       Rectangle customRectangle = new Rectangle(7, 3);
       System.out.println("Custom Area: " + customRectangle.calculateArea());
   }



    
}