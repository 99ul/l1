import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String avto1 = "";
        String avto2 = "";
        String avto3 = "";
        int speed1 = 0;
        int speed2 = 0;
        int speed3 = 0;

        while (true) {
            System.out.println("Введите название машины №1: ");
            avto1 = scanner.nextLine().trim();
            if (!avto1.isEmpty()) {
                break;
            }
        }
        while (true) {
            System.out.println("Введите скорость машины №1: ");
            String input = scanner.nextLine().trim();
            try {
                speed1 = Integer.parseInt(input);
                if (speed1 >= 0 && speed1 <= 250) {
                    break;
                }
                System.out.println("Неправильная скорость, введите другое значение для машины номер 1");
            } catch (NumberFormatException e) {
                System.out.println("Введено нечисловое значение");
            }
        }
        while (true) {
            System.out.println("Введите название машины №2: ");
            avto2 = scanner.nextLine().trim();
            if (!avto2.isEmpty()) {
                break;
            }
        }
        while (true) {
            System.out.println("Введите скорость машины №2: ");
            String input = scanner.nextLine().trim();
            try {
                speed2 = Integer.parseInt(input);
                if (speed2 >= 0 && speed1 <= 250) {
                    break;
                }
                System.out.println("Неправильная скорость, введите другое значение для машины номер 2");
            } catch (NumberFormatException e) {
                System.out.println("Введено нечисловое значение");
            }
        }
        while (true) {
            System.out.println("Введите название машины №3: ");
            avto3 = scanner.nextLine().trim();
            if (!avto3.isEmpty()) {
                break;
            }
        }
        while (true) {
            System.out.println("Введите скорость машины №3: ");
            String input = scanner.nextLine().trim();
            try {
                speed3 = Integer.parseInt(input);
                if (speed3 >= 0 && speed1 <= 250) {
                    break;
                }
                System.out.println("Неправильная скорость, введите другое значение для машины номер 3");
            } catch (NumberFormatException e) {
                System.out.println("Введено нечисловое значение");
            }
        }

        if (speed1 >= speed2 && speed1 >= speed3) {
            System.out.println("Самая быстрая машина: " + avto1);
        }
        if (speed2 >= speed1 && speed2 >= speed3) {
            System.out.println("Самая быстрая машина: " + avto2);
        }
        if (speed3 >= speed1 && speed3 >= speed2) {
            System.out.println("Самая быстрая машина: " + avto3);
        }
        scanner.close();

    }
}