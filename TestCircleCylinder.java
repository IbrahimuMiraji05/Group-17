public class TestCircleCylinder {
    public static void main(String[] args) {
    
        Cylinder cy1 = new Cylinder();
        System.out.println("Cylinder 1 - Radius: " + cy1.getRadius()
                + ", Height is : " + cy1.getHeight() + ", Color: " + cy1.getColor()
                + ", Color is: " + cy1.getColor()
                + ", Base Area is: " + cy1.area()
                + ", Volume is : " + cy1.volume());
    }
}