import java.util.*;

class Circle {
    double radius;

    // Default constructor
    public Circle() {
        this.radius = 0; // Assigning default radius value
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }
}

public class CircleRadius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double userRadius = scanner.nextDouble();

        // Creating Circle objects
        Circle defaultCircle = new Circle(); // Uses default radius (5)
        
        System.out.println("Default Circle Radius: " + defaultCircle.radius);
        System.out.println("User-entered Circle Radius: " + userRadius);
    }
}
