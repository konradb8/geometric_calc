public class Triangle extends Figure {
    private double base;
    private double height;
    private double sideA;
    private double sideB;

    public Triangle(double base, double height, double sideA, double sideB) {
        if (base <= 0 || height <= 0 || sideA <= 0 || sideB <= 0) {
            throw new IllegalArgumentException("Wszystkie długości muszą być większe od zera.");
        }
        else if(base+sideA<sideB || base+sideB<sideA || sideA+sideB<base){
            throw new IllegalArgumentException("Nie istnieje trójkąt o podanych wymiarach.");
        }
        this.base = base;
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    public double calculatePerimeter() {
        return base + sideA + sideB;
    }

    @Override
    public void print() {
        System.out.println("Trójkąt o podstawie: " + base + ", wysokości: " + height + ", bokach: " + sideA + ", " + sideB);
    }
}