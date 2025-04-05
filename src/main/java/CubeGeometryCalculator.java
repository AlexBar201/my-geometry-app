import java.util.Scanner;

public class CubeGeometryCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введи длину ребра куба: ");
        double sideLength = scanner.nextDouble();

        if (sideLength < 0){
            System.out.println(" ");
            System.out.println("Ошибка: введите положительное значение!");
        } else {
            Cube.setA(sideLength);

            System.out.println(" ");
            System.out.printf("Площадь куба = %.2f; ", Cube.areaCube());
            System.out.println(" ");
            System.out.println(" ");
            System.out.printf("При этом объём куба будет равен = %.2f; ", Cube.volumeCube());
            System.out.println(" ");
        }
        scanner.close();
    }
}
