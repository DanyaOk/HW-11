import java.time.LocalDate;

public class Main {

    public static void checkYear(int year) {
        if (year < 1584) {
            System.out.println("Данный год не подходит под критерии определения високосного года.");
        } else {
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        }
    }

    public static void printDeviceVersion(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear == currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear == currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");

        }
    }

    public static int dayToDelivery(int deliveryDistance) {
        int days = 0;
        if (deliveryDistance > 1000) {

        } else {
            if (deliveryDistance >= 0) {
                days++;
            }
            if (deliveryDistance > 20) {
                days++;
            }
            if (deliveryDistance > 60) {
                days++;
            }
            if (deliveryDistance > 100) {
                days++;
            }
        }
        return days;
    }

    public static void main(String[] args) {
        checkYear(2003);

        printDeviceVersion(1, 2023);

        System.out.println("Потребуется дней: " + dayToDelivery(200) + " дня.");
    }
}