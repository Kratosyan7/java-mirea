import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Практика №4 (вторая часть), задание 1.
 *
 * Два массива: названия месяцев и количество дней. Программа просит число
 * от 1 до 12 и выводит месяц с количеством дней.
 *
 * Недопустимое число перехватывается как ArrayIndexOutOfBoundsException,
 * нечисловой ввод — как InputMismatchException (ввод кроме целого
 * не должен ломать программу).
 */
public class Months {

    public static void main(String[] args) {
        String[] months = {"январь", "февраль", "март", "апрель", "май", "июнь",
                           "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner input = new Scanner(System.in);

        System.out.print("Введите целое число от 1 до 12: ");
        try {
            int number = input.nextInt();

            // При number = 0 или 13 индекс выходит за границы массива
            // и выбрасывается ArrayIndexOutOfBoundsException
            String month = months[number - 1];
            int days = dom[number - 1];

            System.out.println(month + " — " + days + " дней");

        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Недопустимое число");
        } catch (InputMismatchException ex) {
            System.out.println("Нужно ввести целое число");
        }

        input.close();
    }
}
