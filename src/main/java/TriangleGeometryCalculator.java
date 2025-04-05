import com.example.Triangle;

import java.util.Scanner;

public class TriangleGeometryCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введи первую сторону треугольника: ");
        double firstSide = scanner.nextDouble();

        System.out.println(" ");

        System.out.print("Введи вторую сторону треугольника: ");
        double secondSide = scanner.nextDouble();

        System.out.println(" ");

        System.out.print("Введи основание треугольника: ");
        double base = scanner.nextDouble();

        if (firstSide < 0 || secondSide < 0 || base < 0){
            System.out.println(" ");
            System.out.println("Ошибка: одно из введённых значений отрицательное");
        } else {
            Triangle.setA(firstSide);
            Triangle.setB(secondSide);
            Triangle.setC(base);
            double area = Triangle.areaThreeSideTriangle();
            double perimeter = Triangle.perimeterTriangle();

            System.out.println(" ");
            System.out.printf("Площадь треугольника будет равна = %.2f; ", area);
            System.out.println(" ");
            System.out.println(" ");
            System.out.printf("При этом периметр треугольника будет равен = %.2f; ", perimeter);
            System.out.println(" ");
        }
        scanner.close();
    }
}
