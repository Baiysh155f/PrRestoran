package clases;

import clases.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Dishes> dishes = new ArrayList<>(Arrays.asList(
                new Dishes("Bedford-shire clanger", 150, "5 minutes"),
                new Dishes("Bangers and mash", 170, "12 minutes"),
                new Dishes("Beans on toast", 180, "15 minutes"),
                new Dishes("Beef Wellington", 200, "10 minutes")));

        List<Beverages> beverages = new ArrayList<>(Arrays.asList(
                new Beverages("Coffee", 120, "5 minutes"),
                new Beverages("Tea ", 15, "2 minutes"),
                new Beverages("Milk", 40, "3 minutes"),
                new Beverages("juice", 100, "1 minutes")));

        List<Salad> salads = new ArrayList<>(Arrays.asList(
                new Salad("Ham salad", 50, "5 minutes"),
                new Salad("Herring salad", 40, "5 minutes"),
                new Salad("Insalata Caprese", 30, "5 minutes"),
                new Salad("Israeli salad", 70, "5 minutes")));

        List<Dessert> desserts = new ArrayList<>(Arrays.asList(
                new Dessert("Jam Roly Poly", 75, "5 minutes"),
                new Dessert("Knickerbocker Glory", 100, "5 minutes"),
                new Dessert("Syllabub", 60, "5 minutes"),
                new Dessert("Banoffee Pie Recipe", 130, "5 minutes")));
       List<Menu> menus = List.of(new Menu(dishes,beverages,salads,desserts));



        Menu menu = new Menu();
        while (true) {
            System.out.println("============== The Restaurant ==============");
            System.out.println("press 0 to enter the menu");
            System.out.println("press 1 to create");
            System.out.println("press 2 to remove");
            System.out.println("press 3 to get by name");

            Scanner scanner = new Scanner(System.in);
            int str = scanner.nextInt();
            switch (str) {
                case 0:
                    menu.getAll(menus);
                    break;
                case 1:
                    menu.create(menus);
                    break;
                case 2:
                    menu.remove(menus);
                    break;
                case 3:
                    menu.getByName(menus);
                    break;
            }


        }
    }
}
//    ArrayList<Menu> menus = new ArrayList<>(Arrays.asList(
//            new  ArrayList<>(List.of(
//                    new Dishes("Bedford-shire clanger", 150, "5 minutes"),
//                    new Dishes("Bangers and mash", 170, "12 minutes"),
//                    new Dishes("Beans on toast", 180, "15 minutes"),
//                    new Dishes("Beef Wellington", 200, "10 minutes"))),
//            new  ArrayList<>(List.of(
//                    new Beverages("Coffee", 120, "5 minutes"),
//                    new Beverages("Tea ", 15, "2 minutes"),
//                    new Beverages("Milk", 40, "3 minutes"),
//                    new Beverages("juice", 100, "1 minutes"))),
//            new  ArrayList<>(List.of(
//                    new Salad("Ham salad", 50, "5 minutes"),
//                    new Salad("Herring salad", 40, "5 minutes"),
//                    new Salad("Insalata Caprese", 30, "5 minutes"),
//                    new Salad("Israeli salad", 70, "5 minutes"))),
//            new  ArrayList<>(List.of(
//                    new Dessert("Jam Roly Poly", 75, "5 minutes"),
//                    new Dessert("Knickerbocker Glory", 100, "5 minutes"),
//                    new Dessert("Syllabub", 60, "5 minutes"),
//                    new Dessert("Banoffee Pie Recipe", 130, "5 minutes")))));

