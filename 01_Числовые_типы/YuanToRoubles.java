import java.util.Scanner;

public class YuanToRoubles {
    public static final double ROUBLES_PER_YUAN = 11.91;

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Введите сумму денег в китайскых юанях: ");
        int yuan = Integer.parseInt(input.nextLine().trim());

        double roubles = ROUBLES_PER_YUAN * yuan;


        System.out.printf("Курс покупки: %.2f руб. за 1 юань%n", ROUBLES_PER_YUAN);
        System.out.printf("%d юаней = %.2f руб.%n", yuan, roubles);

        input.close();
    }
}