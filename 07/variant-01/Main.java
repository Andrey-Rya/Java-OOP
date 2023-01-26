/**
Фильмотека
 */

import java.io.IOException;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;


public class Main {
    public static void main(String[] args) throws IOException{
        file arF = new file();
        ArrayList<String> arrFile = arF.readFile("FilmDataBase.txt");

        Map<String, Film> mapFilm = new HashMap<>();

        Film flm0 = new Film(arrFile.get(0));
        mapFilm.put(flm0.name, flm0);
        Film flm1 = new Film(arrFile.get(1));
        mapFilm.put(flm1.name, flm1);
        Film flm2 = new Film(arrFile.get(2));
        mapFilm.put(flm2.name, flm2);
        Film flm3 = new Film(arrFile.get(3));
        mapFilm.put(flm3.name, flm3);
        Film flm4 = new Film(arrFile.get(4));
        mapFilm.put(flm4.name, flm4);
        Film flm5 = new Film(arrFile.get(5));
        mapFilm.put(flm5.name, flm5);
        Film flm6 = new Film(arrFile.get(6));
        mapFilm.put(flm6.name, flm6);
        Film flm7 = new Film(arrFile.get(7));
        mapFilm.put(flm7.name, flm7);
        Film flm8 = new Film(arrFile.get(8));
        mapFilm.put(flm8.name, flm8);
        Film flm9 = new Film(arrFile.get(9));
        mapFilm.put(flm9.name, flm9);

        Set<String> keys = mapFilm.keySet();
        boolean exFerst = true;
        Scanner imput = new Scanner(System.in);
        while(exFerst){
            System.out.println("\nФильмотека:\n1. Вывести общий список фильмов,\n" +
                    "2. Получить информацию о фильме,\n" +
                    "3. Выход.\n\nВыберите цифру пункта меню: ");
            int numMen = imput.nextInt();
            if(numMen == 1){
                commonListMenu(mapFilm);
            }else if(numMen == 2){
                nameSearch(mapFilm, keys);
            }else if(numMen == 3){
                System.out.println("Спасибо за пользование нашей фильмотекой\n");
                exFerst = false;
            }else{
                System.out.println("Введено неверное значение\n");
            }
        }
        imput.close();
    }

    public static void nameSearch(Map<String, Film> mapFlm, Set<String> keys){
        System.out.println("Введите название фильма: ");
        Scanner scn = new Scanner(System.in);
        String nFlm = scn.nextLine();
        int count = 0;
        for(Object k : keys){
            if(mapFlm.get(k).nameFlm(nFlm)){
                System.out.println(mapFlm.get(k).getInfo());
            }else{
                count++;
            }
        }
        if(count == mapFlm.size()){
            System.out.printf("Фильм с названием %s отсутствует в нашей фильмотеке\n", nFlm);
        }
    }

    public static void commonListMenu(Map<String, Film> mapFlm){
        for(Map.Entry<String, Film> item : mapFlm.entrySet()){
            System.out.printf("%s\n", item.getKey());
        }
    }
}
