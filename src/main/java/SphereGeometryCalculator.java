import java.util.Scanner;

public class SphereGeometryCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введи длину радиуса сферы: ");
        double radiusLength = scanner.nextDouble();

        if (radiusLength < 0){
            System.out.println(" ");
            System.out.println("Ошибка: введите положительный радиус!");
        } else {
            Sphere.setR(radiusLength);

            System.out.println(" ");
            System.out.printf("Площадь сферы = %.2f; ", Sphere.areaSphere());
            System.out.println(" ");
            System.out.println(" ");
            System.out.printf("При этом объём сферы будет равен = %.2f; ", Sphere.volumeSphere());
            System.out.println(" ");
        }
        scanner.close();
    }
}
