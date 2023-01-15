/* Подсчитываем рациональные числа */

public class RacionNumber {

    public static void logic(double x, double y, String q) {

        double resul;
        switch (q) {
            case "+":
                resul = x + y;
                System.out.printf("Результат вычисления = ");
                System.out.printf("%.2f", resul);

                break;

            case "*":
                resul = x * y;
                System.out.printf("Результат вычисления = ");
                System.out.printf("%.2f", resul);

                break;

            case "-":
                resul = x - y;
                System.out.printf("Результат вычисления = ");
                System.out.printf("%.2f", resul);

                break;

            case "/":
                resul = x / y;
                System.out.printf("Результат вычисления = ");
                System.out.printf("%.2f", resul);

                break;

            default:
                System.out.println("Вы ввели неверные данные. Нужно вводить только: *,+,-,/");
                break;
        }

    }



}
