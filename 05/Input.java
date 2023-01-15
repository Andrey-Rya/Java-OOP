import java.util.Scanner;

public class Input {

    public double n1;
    public double n2;
    public String action;

    public String act;

    public double x;
    public double y;

    public double x2;
    public double y2;

    public static void chois(String ch) {

        switch (ch) {

            case "1":

                Input a = Input.inputRacio();
                RacionNumber.logic(a.n1, a.n2, a.action);

                break;

            case "2":

                Input b = Input.inputCompl();
                ComplexNumber.logica(b.x, b.y, b.x2, b.y2, b.act);

                break;

            default:
                System.out.println("Будьте внимательны при вводе! Нужно вводить цифру 1 или 2.1");
                break;
        }

    }

    public Input(Double n1, Double n2, String action) { // конструктор значений

        this.n1 = n1;

        this.n2 = n2;

        this.action = action;
    }

    // вещественная и мнимая часть

    public static Input inputRacio() { // Вводим значения и знак выражения

        Scanner in = new Scanner(System.in);
        System.out.print("Число X: ");
        Double n1 = in.nextDouble();

        System.out.print("Число Y: ");
        Double n2 = in.nextDouble();

        System.out.print("Выберите действие (+) (-) (/) (*): ");
        String action = in.next();

        System.out.printf("Вы ввели число: %.2f \n", n1);
        System.out.printf("Вы ввели число: %.2f \n", n2);
        System.out.printf("Вы выбрали действие: %s \n", "(" +action +")");

        in.close();

        return new Input(n1, n2, action);

    }

    public Input(double x, double y, double x2, double y2, String act) { // конструктор комплексных чисел

        this.x = x;
        this.y = y;

        this.x2 = x2;
        this.y2 = y2;

        this.act = act;

    }

    public static Input inputCompl() {

        Scanner in = new Scanner(System.in);
        System.out.print("Число X: ");
        Double x = in.nextDouble();

        System.out.print("Число Y: ");
        Double y = in.nextDouble();

        System.out.print("Число X: ");
        Double x2 = in.nextDouble();

        System.out.print("Число Y: ");
        Double y2 = in.nextDouble();

        System.out.print("Действие: ");
        String act = in.next();

        System.out.printf("Вы ввели: %.2f + %.2f j\n", x, y);
        System.out.printf("Вы ввели: %.2f + %.2f j\n", x2, y2);
        System.out.printf("Вы ввели: %s \n", act);

        in.close();

        return new Input(x, y, x2, y2, act);

    }

}
