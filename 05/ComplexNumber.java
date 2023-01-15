/* Подсчитываем комплексные числа */

public class ComplexNumber {

    public static void logica(double x, double y, double x2, double y2, String w) {

        switch (w) {
            case "-":
                double subX = x - x2;
                double subY = y - y2;
                if (subY > 0) {

                    System.out.printf("%.2f + %.2fi",subX,subY);

                    //  System.out.println(subX + " + " + subY + "i");
                } else if (subY < 0) {
                    System.out.printf("%.2f + (%.2fi)",subX,subY);
                } else {
                    System.out.println(subX);
                }

                break;

            case "+":
                double newX = x + x2;
                double newY = y + y2;
                if (newY > 0) {
                    System.out.printf("%.2f + %.2fi",newX,newY);
                } else if (newY < 0) {
                    System.out.println(newX + "" + newY + "i");
                } else {
                    System.out.println(newX);
                }

                break;

            case "*":
                double multX = x * x2 - y * y2;
                double multY = y * x2 + x * y2;
                if (multY > 0) {
                    System.out.printf("%.2f + %.2fi",multX,multY);
                } else if (multY < 0) {
                    System.out.println(multX + "" + multY + "i");
                } else {
                    System.out.println(multX);
                }

                break;

            case "/":
                double divX = (x * x2 + y * y2) / (x2 * x2 + y2 * y2);
                double divY = (y * x2 - x * y2) / (x2 * x2 + y2 * y2);
                if (divY > 0) {
                    System.out.printf("%.2f + %.2fi",divX,divY);
                } else if (divY < 0) {
                    System.out.println(divX + "" + divY + "i");
                } else {
                    System.out.println(divX);
                }

                break;

            default:
                System.out.println("Ошибка.Введите действие *,+,-,/");
                break;
        }

    }
}
