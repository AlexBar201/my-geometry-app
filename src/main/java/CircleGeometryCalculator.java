import com.example.Circle;

import java.util.Scanner;

public class CircleGeometryCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введи радиус круга: ");
        double radius = scanner.nextDouble();

        if (radius < 0){
            System.out.println(" ");
            System.out.println("Ошибка: введите положительный радиус!");
        } else {
            Circle.setR(radius);
            double area = Circle.areaCircle();
            double perimeter = Circle.perimeterCircle();

            System.out.println(" ");
            System.out.printf("Площадь круга при радиусе" + " " + UnitConversionCircle.radiusToString(radius) + " " + "будет равна = %.2f; ", area);
            System.out.println(" ");
            System.out.println(" ");
            System.out.printf("При этом периметр круга будет равен = %.2f; ", perimeter);
            System.out.println(" ");
        }
        scanner.close();
    }
}
