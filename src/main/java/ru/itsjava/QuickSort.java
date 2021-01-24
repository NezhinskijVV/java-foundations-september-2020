package ru.itsjava;

import java.util.Arrays;

public class QuickSort {
    public static void quickSort(String[] array, int low, int high) {
        if (array.length == 0)
            return;//завершить выполнение если длина массива равна 0

        if (low >= high)
            return;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        String opora = array[middle];

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (array[i].charAt(0) < opora.charAt(0)) {
                i++;
            }

            while (array[j].charAt(0) > opora.charAt(0)) {
                j--;
            }

            if (i <= j) {//меняем местами
                String temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }

    public static void main(String[] args) {
        String[] items = {"A", "C", "B", "D"};
        System.out.println("Было");
        System.out.println(Arrays.toString(items));

        int low = 0;
        int high = items.length - 1;

        quickSort(items, low, high);
        System.out.println("Стало");
        System.out.println(Arrays.toString(items));
    }
}