public class Circle {
    private double radius;
    private String color;
    public Circle() {
        this.radius = 1.0; 
        this.color = "red"; 
        System.out.println("Circle created with default radius and color.");
    }

   
    public Circle(double radius) {
        this.radius = radius;
        this.color = "red"; 
    }

   
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Getter for color
    public String getColor() {
        return color;
    }

    // Setter for color
    public void setColor(String color) {
        this.color = color;
    }

    // Method to calculate the area of the circle
    public double area() {
        return Math.PI * radius * radius;
    }

    // Method to calculate the circumference of the circle
    public double circumference() {
        return 2 * Math.PI * radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }
}