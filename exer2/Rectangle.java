public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public double getArea() {
        return length * width;
    }

    @Override
    public String toString() {
        return String.format("Hình chữ nhật có chiều dài %.2f và chiều rộng %.2f. Chu vi: %.2f. Diện tích: %.2f.",
                length, width, getPerimeter(), getArea());
    }

}
