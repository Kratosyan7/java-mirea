import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Практика №4 (вторая часть), задание 2.
 *
 * Дополнение задания 1: при выборе февраля запрашивается год, и количество
 * дней считается с учётом високосности.
 */
public class MonthsLeapYear {

    /** Номер февраля в нумерации с единицы. */
    private static final int FEBRUARY = 2;

    public static void main(String[] args) {
        String[] months = {"январь", "февраль", "март", "апрель", "май", "июнь",
                           "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner input = new Scanner(System.in);

        System.out.print("Введите целое число от 1 до 12: ");
        try {
            int number = input.nextInt();

            String month = months[number - 1];
            int days = dom[number - 1];

            if (number == FEBRUARY) {
                System.out.print("Введите год: ");
                int year = input.nextInt();

                if (isLeapYear(year)) {
                    days = 29;
                    System.out.println(year + " — високосный год");
                } else {
                    System.out.println(year + " — обычный год");
                }
                System.out.println(month + " " + year + " — " + days + " дней");
            } else {
                System.out.println(month + " — " + days + " дней");
            }

        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Недопустимое число");
        } catch (InputMismatchException ex) {
            System.out.println("Нужно ввести целое число");
        }

        input.close();
    }

    /**
     * Год високосный, если делится на 4, но не на 100 — либо делится на 400.
     * Поэтому 2000 високосный, а 1900 нет.
     */
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
