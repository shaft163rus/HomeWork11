import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        isLeapYear(2023);
        setOsVersion("aNdRoid", 2022);
        printDeliverуTime(20);

    }

    public static void isLeapYear(int year) {

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - невисокосный год");
        }

    }

    public static void setOsVersion (String clientOS, int clientDeviceYear) {
        clientOS = clientOS.toLowerCase();
        int currentYear = LocalDate.now().getYear();

        if (clientDeviceYear >= currentYear) {
            switch (clientOS) {
                case "ios":
                    System.out.println("Установите обычную версию приложения для iOS по ссылке");
                    break;
                case "android":
                    System.out.println("Установите обычную версию приложения для Android по ссылке");
                    break;
            }
        } else {
            switch(clientOS) {
                case "ios":
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                    break;
                case "android":
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    break;
            }

        }
    }


    public static void printDeliverуTime(int deliveryDistance) {

        if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        } else if (deliveryDistance <= 20) {
            System.out.println("Потребуется 1 день");
        } else if (deliveryDistance <= 60) {
            System.out.println("Потребуется 2 дня");
        } else {
            System.out.println("Потребуется 3 дня");
        }
    }

}