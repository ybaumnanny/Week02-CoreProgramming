class Area{
    double radius;

    Area(double radius){
        this.radius = radius;
    }

    public void printArea(){
        System.out.println("Area of circle is : " + (radius*Math.PI*radius));
        System.out.println("Circumference of the circle is :" +(2*Math.PI*radius));
    }
}
public class AreaOfCircle{
    public static void main(String[]args){
        Area area = new Area(4);
        area.printArea();
    }
    }