import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        printLeapYear(2022);
        recommendApplicationVersions(0, 2022);
        deliveryDays(99);
    }

    public static void printLeapYearResult(int year, boolean yearIsLeap) {
        System.out.println(" задание 1");
        if (yearIsLeap) {
            System.out.println(year + " високосный");
        } else {
            System.out.println(year + " не високосный");
        }
    }

    public static void printLeapYear(int year) {
        boolean yearIsLeap = isLeap(year);
        printLeapYearResult(year, yearIsLeap);
    }

    public static boolean isLeap(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static void recommendApplicationVersions(int clientOS, int deviceYear) {
        boolean deviceIsOld = isDeviceOld(deviceYear);
        System.out.println(" задание 2 ");
        System.out.print(" установите");
        if (deviceIsOld) {
            System.out.print(" lite");
        }
        System.out.print(" Версия для ");
        if (clientOS == 0) {
            System.out.print(" ios");
        } else {
            System.out.print(" Android");
        }
    }

    public static boolean isDeviceOld(int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        return deviceYear <= currentYear;
    }

    public static void deliveryDays(int deliveryDistance) {
        System.out.println();
        System.out.println("Задание 3");
        int days = 1;
        if (deliveryDistance < 20 && days == 1) {
            System.out.println("Потребуется дней:" + days);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней:" + (days + 1));
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней:" + (days + 2));
        } else {
            System.out.println(" доставки нет");
        }
    }
}