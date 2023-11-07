public class Rectangle extends Shape implements Colorable {
    private double width;
    private double height;

    public Rectangle() {

    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return width + height;
    }

    @Override
    public String toString() {
        return "A rectangle with width: " + this.width + " and height: " + this.height + ", which is a subclass of " + super.toString();
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
