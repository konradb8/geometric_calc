public class Prism {
    private Figure base;
    private double height;

    public Prism(Figure base, double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Wysokość musi być większa od zera.");
        }

        this.base = base;
        this.height = height;
    }

    public double calculateSurfaceArea() {
        return 2 * base.calculateArea() + base.calculatePerimeter() * height;
    }

    public double calculateVolume() {
        return base.calculateArea() * height;
    }
}