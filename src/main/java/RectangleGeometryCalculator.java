import com.example.Rectangle;

import java.util.Scanner;

public class RectangleGeometryCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введи первую сторону прямоугольника: ");
        double firstSide = scanner.nextDouble();

        System.out.println(" ");

        System.out.print("Введи вторую сторону прямоугольника: ");
        double secondSide = scanner.nextDouble();

        if (firstSide < 0 || secondSide < 0){
            System.out.println(" ");
            System.out.println("Ошибка: одна из сторон прямоугольника отрицательная");
        } else {
            Rectangle.setA(firstSide);
            Rectangle.setB(secondSide);
            double area = Rectangle.areaRectangle();
            double perimeter = Rectangle.perimeterRectangle();

            System.out.println(" ");
            System.out.printf("Площадь прямоугольника будет равна = %.2f; ", area);
            System.out.println(" ");
            System.out.println(" ");
            System.out.printf("При этом периметр прямоугольника будет равен = %.2f; ", perimeter);
            System.out.println(" ");
        }
        scanner.close();
    }
}
