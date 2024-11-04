import java.util.*;
import java.io.*;

public class Main {

    public static void Sum(double a, double b){
        double s = a + b;
        System.out.println("Сумма двух чисел a и b равна:" + s);
    }
    public static void Multiplicate (double a, double b){
        double m = a * b;
        System.out.println("Произведение двух чисел a и b равна:" + m);
    }
    public static void Deduct (double a, double b){
        double d = a - b;
        System.out.println("Разность двух чисел a и b равна:" + d);
    }
    public static void Divide (double a, double b){
        double D = a / b;
        System.out.println("Частное двух чисел a и b равна:" + D);
    }


    public static void main(String[] args) {
        System.out.println("Введите два числа a и b: ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        Sum(a,b);
        Multiplicate(a,b);
        Deduct(a,b);
        Divide(a,b);

    }
}