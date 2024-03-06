import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Kaluklator figur");
            System.out.println("1.Trójkąt");
            System.out.println("2.Kwadrat");
            System.out.println("3.Koło");
            System.out.println("4.Graniastosłup");
            Scanner scanner = new Scanner(System.in);
            int myInt = scanner.nextInt();

            float height = 0;
            float bot = 0;
            float side1 = 0;
            float side2 = 0;
            float side = 0;
            float radius = 0;
            float prismHeight = 0;
            float side3 = 0;
            switch (myInt) {
                case 1:
                    System.out.println("Podaj kolejno: długość podstawy, wysokość, jeden oraz drugi bok: ");
                    bot = scanner.nextFloat();
                    height = scanner.nextFloat();
                    side1 = scanner.nextFloat();
                    side2 = scanner.nextFloat();
                    Triangle triangle = new Triangle(bot, height, side1, side2);
                    triangle.print();
                    System.out.println("Pole trójkąta: " + triangle.calculateArea());
                    System.out.println("Obwód trójkąta: " + triangle.calculatePerimeter());
                    break;
                case 2:
                    System.out.println("Podaj długość boku: ");
                    side = scanner.nextFloat();
                    Square square = new Square(side);
                    square.print();
                    System.out.println("Pole kwadratu: " + square.calculateArea());
                    System.out.println("Obwód kwadratu: " + square.calculatePerimeter());
                    break;
                case 3:
                    System.out.println("Podaj promień: ");
                    radius = scanner.nextFloat();
                    Circle circle = new Circle(radius);
                    circle.print();
                    System.out.println("Pole koła: " + circle.calculateArea());
                    System.out.println("Obwód koła: " + circle.calculatePerimeter());
                    break;
                case 4:
                    System.out.println("Podaj wysokość graniastosłupa: ");
                    prismHeight = scanner.nextFloat();
                    System.out.println("Podaj długosc boku postawy: ");
                    side3 = scanner.nextFloat();
                    Square square1 = new Square(side3);
                    Prism prism = new Prism(square1, prismHeight);
                    System.out.println("Pole powierzchni graniastosłupa: " + prism.calculateSurfaceArea());
                    System.out.println("Objętość graniastosłupa: " + prism.calculateVolume());

            }

        } catch (IllegalArgumentException e) {
            System.out.println("Błąd: " + e.getMessage());
        }
    }
}
