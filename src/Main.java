public class Main {

    public static void main(String[] args) {
        int year = 2020;
        checkLeapYear(year);
        int clientDeviceYear = 2017;
        int clientOs = 0;
        checkOs(clientDeviceYear, clientOs);
        int deliveryDistance = 6;
        int days = counterDays(deliveryDistance);
        System.out.println(days);
    }

    private static void checkLeapYear(int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + "это высокосный год");
        } else {
            System.out.println(year + "это не високосный год");
        }
    }


    private static void checkOs(int clientDeviceYear, int clientOs) {

        if (clientOs == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите новую версию для Ios");
        } else if (clientOs == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите старую версию для Ios");
        } else if (clientOs == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите новую версию для Android");
        } else if (clientOs == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите старую версию Android");
        } else {
            System.out.println("Ваше устройство не поддерживается");
        }

    }

    private static int counterDays(int deliveryDistance) {

        int days = 1;
        if (deliveryDistance > 20) {
            days++;
        }
        if (deliveryDistance > 60) {
            days++;
        }
        return days;
    }
}


