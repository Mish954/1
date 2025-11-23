//задание 1


public class dz2 {
    public static void main() {
        int age = 10; // Здесь задайте нужный возраст для проверки

        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
        } else if (age >= 7 && age <= 17) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
        } else if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет.");
        } else if (age > 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу.");
        } else {
            System.out.println("Возраст должен быть положительным числом.");
        }
    }
    //задание 2


    public static void main2() {
        int totalCapacity = 102;      // Общая вместимость вагона
        int seatedCapacity = 60;      // Количество сидячих мест
        int standingCapacity = totalCapacity - seatedCapacity; // Количество стоячих мест

        int passengers = 50;          // Переменная с количеством пассажиров (можно менять для тестов)

        if (passengers <= seatedCapacity) {
            System.out.println("В вагоне есть сидячие места. Количество пассажиров: " + passengers + ", свободных сидячих мест: " + (seatedCapacity - passengers));
        } else if (passengers <= totalCapacity) {
            int freeStanding = totalCapacity - passengers;
            System.out.println("Сидячих мест нет, но есть стоячие. Количество пассажиров: " + passengers + ", свободных стоячих мест: " + freeStanding);
        } else {
            System.out.println("Вагон полностью забит! Вместимость вагона — " + totalCapacity + " человек, а пассажиров — " + passengers + ".");
        }
    }
//задание 3



    public static void main3() {
        int year = 2024;  // Здесь можно менять значение года для проверки

        if (year <= 1584) {
            System.out.println("Год должен быть больше 1584");
            return;
        }

        if ((year % 400 == 0) ||
                (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    //задание 4


    public static void main4() {
        int monthNumber = 12;  // Здесь можно менять номер месяца для проверки

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println(monthNumber + " месяц принадлежит сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + " месяц принадлежит сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + " месяц принадлежит сезону лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + " месяц принадлежит сезону осень");
                break;
            default:
                System.out.println("Ошибка: номер месяца должен быть от 1 до 12");
                break;
        }
    }
}
