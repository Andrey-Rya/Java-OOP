import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        System.out.print("Выберите какие числа вы собираетесь подсчитывать: \n");
        Scanner ch = new Scanner(System.in);
        System.out.print(" 1 - рациональные числа.\n 2 - комплексные числа.\n Ваш выбор: ");
        String chois = ch.next();



        Input.chois(chois);
        ch.close();
    }

}
