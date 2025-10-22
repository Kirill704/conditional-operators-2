//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//задача 1
        byte clientOS = 0;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("укажите OS");
        }
//задача 2
        byte clientOS2 = 1;
        short clientDeviceYear = 2015;
        if (clientDeviceYear < 2015 && clientOS2 == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientDeviceYear < 2015 && clientOS2 == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (clientDeviceYear >= 2015 && clientOS2 == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientDeviceYear >= 2015 && clientOS2 == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

//задача 3
        int year = 2021;
        if (year >= 1584 && year % 4 == 0 && year % 400 == 0) {
            System.out.println("год високосный");
        } else {
            System.out.println("год не високосный");
        }

//задача 4
        int deliveryDistance = 95;
        if (deliveryDistance <= 100) {
            byte days = 3;
            if (deliveryDistance < 60) {
                days--;
                if (deliveryDistance < 20) {
                    days--;
                }
            }
            System.out.println("Потребуется дней: " + days);
        } else {
            System.out.println("доставки нет");
        }

//задача 5
        byte monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("осень");
                break;
            default:
                System.out.println("некорректный номер месяца");
        }

    }
}