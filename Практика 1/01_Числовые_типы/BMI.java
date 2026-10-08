import java.util.Scanner;

public class BMI{
    public static final int SMS_PER_METER = 100;

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Введите вес в кг: ");
        double weight = input.nextDouble();

        System.out.print("Введите рост в см: ");
        double height = input.nextDouble();
        
        double bmi = weight / (height / SMS_PER_METER * height / SMS_PER_METER);

        System.out.print("BMI равно " + bmi);

        if (bmi < 18.5){
            System.out.println("Недостаточный вес");
        } 
        else if (bmi < 25){
            System.out.println("Норма");
        }
        else if (bmi < 30){
            System.out.println("Избыточный вес");
        }
        else{
            System.out.println("Ожирение");
        }

        input.close();
    }

    // private static double readDouble(Scanner input, String prompt){
    //     System.out.print(prompt);
    //     return Double.parseDouble(input.nextLine().trim().replace(',', '.'));
    // }
}