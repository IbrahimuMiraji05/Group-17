public class Cylinder extends Circle {
    private double height;
    private String color;

    public Cylinder() {
        super(); 
        this.height = 1.0; 
        this.color = "red"; 
        System.out.println("Cylinder created with default height and color.");
    }   

    public Cylinder(double radius, double height) {
        super(radius); 
        this.height = height;
        this.color = "red"; 
    }

    public Cylinder(double radius, double height, String color) {
        super(radius); 
        this.height = height;
        this.color = color;
    }

    public double volume() {
        return area() * height; 
    }   
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public String getColor() {
        return color;
    }   
    @Override
    public void setColor(String color) {
        this.color = color;
    }   
    @Override
    public double area() {  
        return super.area(); 
    }       
}       