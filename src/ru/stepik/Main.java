package ru.stepik;

import java.util.Arrays;

public class Main {
    public static void yearDefinitionTask1(int year1) {
        if (year1 % 100 == 0 && year1 % 400 != 0) {
            System.out.println(year1 + " - не високосный год");
        } else if (year1 % 4 == 0 || year1 % 400 == 0) {
            System.out.println(year1 + " - високосный год");
        } else
            System.out.println(year1 + " - не високосный год");
    }

    public static void versionOfAppTask2(int clientOS, int clientDeviceYear) {
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else
            System.out.println("Установите версию приложения для Android по ссылке");
    }

    public static void timeDeliveryTask3(int deliveryDistance) {
        int timeDelivery = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + timeDelivery);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + (timeDelivery + 1));
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: " + (timeDelivery + 2));
        } else
            System.out.println("Так далеко не доставляем");
    }

    public static void duplicatesSearch(String strSearch) {
        char[] array = strSearch.toCharArray();
        Arrays.sort(array);
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                System.out.println("В строке найден дубль и это символ: " + array[i]);
                break;
            }
        }
    }

    public static void arrayFlipping(int[] array) {
        System.out.println(Arrays.toString(array));
        int n = 0;
        for (int i = 0; i < array.length / 2; i++) {
            n = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = n;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        int year = 2022;
        yearDefinitionTask1(year);
    }

    public static void task2() {
        int clientOS = 0;
        int clientDeviceYear = 2017;
        versionOfAppTask2(clientOS, clientDeviceYear);
    }

    public static void task3() {
        int deliveryDistance = 95;
        timeDeliveryTask3(deliveryDistance);
    }

    public static void task4() {
        String str = "aabccddefgghiijjkk";
        duplicatesSearch(str);
    }

    public static void task5() {
        int[] array = {3, 2, 1, 6, 5};
        arrayFlipping(array);
    }
}



