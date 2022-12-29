package FamilyTree;

import FamilyTree.FamilyTree.Type;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var andrey = new Person("Андрей");
        var elena = new Person("Елена");
        var nastya = new Person("Настя");
        var alena = new Person("Алена");
        var danil = new Person("Данил");
        var ivan = new Person("Ваня");
        var vadim = new Person("Вадим");
        var olga = new Person("Ольга");
        var matvey = new Person("Матвей");
        var stepan = new Person("Степан");

        FamilyTree ft = new FamilyTree();

        ft.addNode(elena, Type.wife, andrey); // жена
        ft.addNode(nastya, Type.daughter, andrey); // дочь
        ft.addNode(alena, Type.daughter, andrey); // дочь
        ft.addNode(danil, Type.son, andrey); // сын
        ft.addNode(ivan, Type.son, andrey); // сын
        ft.addNode(vadim, Type.brother, andrey); // брат
        ft.addNode(olga, Type.sister, andrey); // сестра
        ft.addNode(matvey, Type.grandchildren, andrey); // внук
        ft.addNode(stepan, Type.grandchildren, andrey); // внук

        System.out.println("Чтобы узнать состав семьи Андрея, воспользуйтесь меню ниже по тексту: " +
                "\n1. Как зовут его жену?" +
                "\n2. Как зовут его сына?" +
                "\n3. Как зовут его дочь?" +
                "\n4. Как зовут его брата?" +
                "\n5. Как зовут его сестру?" +
                "\n6. Как зовут его внуков?");

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите цифру: ");
        String sc = scan.nextLine();
        //System.out.println(sc);
        scan.close();

        Research children = new Research(ft);
        if(sc.equals("1")) {
            System.out.println("Жену Андрея зовут " + Printer.people(children.findAll(andrey, Type.wife)));
        } else if (sc.equals("2")) {
            System.out.println("Сыновей Андрея зовут: " + Printer.people(children.findAll(andrey, Type.son)));
        } else if (sc.equals("3")) {
            System.out.println("Дочерей Андрея зовут: " + Printer.people(children.findAll(andrey, Type.daughter)));
        } else if (sc.equals("4")) {
            System.out.println("Брата Андрея зовут " + Printer.people(children.findAll(andrey, Type.brother)));
        } else if (sc.equals("5")) {
            System.out.println("Двоюродную сестру Андрея зовут " + Printer.people(children.findAll(andrey, Type.sister)));
        } else if (sc.equals("6")) {
        System.out.println("У Андрея есть 2 внука: " + Printer.people(children.findAll(andrey, Type.grandchildren)));
        }else {
            System.out.println("Вы ошиблись при вводе цифры. Повторите ввод: ");
        }

    }

}
