import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите размерность массива n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] array = new double[n];

        System.out.println("Массив случайных чисел имеет вид array[n] : ");
        FillArray(array);
        PrintArray(array);
        System.out.println(" Отсортированный массив случайных чисел имеет вид array[n] : ");
        SortArray(array);
        PrintArray(array);
        System.out.println("Экстремальные и среднее значения массива: ");
        MaxMinAverage(array);

    }

    public static void FillArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
            //            array[i] = (int) Math.random();
            /*
            Прошу Вас указать как правильно реализовать функцию/метод Math.random(),
            Так как требуется вводить целочисленный массив. А данная функция работает
            только  в вещественных числах
             */
        }
    }

    public static void PrintArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void SortArray(double[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 2; j++) {
                if (array[j] < array[j + 1]) {
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }
            }
        }
    }

    public static void MaxMinAverage(double[] array) {

        double max = array[0];
        double min = array[0];
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
            sum += array[i];
        }

        double average = sum / array.length;

        System.out.println("Максимальное значение: " + max);
        System.out.println("Минимальное значение: " + min);
        System.out.println("Среднее значение: " + average);

    }
}