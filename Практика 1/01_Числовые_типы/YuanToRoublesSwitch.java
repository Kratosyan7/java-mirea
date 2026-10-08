import java.util.Scanner;

public class YuanToRoublesSwitch{
    public static final double ROUBLES_PER_YUAN = 11.91;

        public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Введите сумму денег в китайских юанях: ");
        int yuan = Integer.parseInt(input.nextLine().trim());

        double roubles = ROUBLES_PER_YUAN * yuan;

        System.out.printf("Курс покупки: %.2f руб. за 1 юань%n", ROUBLES_PER_YUAN);
        System.out.printf("%d %s = %.2f руб.%n", yuan, yuanForm(yuan), roubles);

        input.close();
    }

    public static String yuanForm(int yuan){
        int amount = Math.abs(yuan);
        int lastTwoDigits = amount % 100;

        if (lastTwoDigits >= 11 && lastTwoDigits <= 14) {
            return "китайских юаней";
        }

        int digit = amount % 10;
        String form;

        switch (digit) {
            case 1:
                form = "китайский юань";
                break;
            case 2:
            case 3:
            case 4:
                form = "китайских юаня";
                break;
            default:
                form = "китайских юаней";
                break;
        }

        return form;
    }
}