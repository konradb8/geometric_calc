public class Square extends Figure {
    private double side;

    public Square(double side) {
        if (side <= 0) {
            throw new IllegalArgumentException("Długość boku musi być większa od zera.");
        }
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }

    @Override
    public void print() {
        System.out.println("Kwadrat o boku: " + side);
    }
}
