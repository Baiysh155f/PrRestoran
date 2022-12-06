
package clases;

import interfaceAble.FeedSpeed;

import java.util.*;

public class Menu implements FeedSpeed {
    private List<Dishes> dishes;
    private List<Beverages> beverages;
    private List<Salad> salad;
    private List<Dessert> dessert;

    public Menu() {
    }

    public Menu(List<Dishes> dishes, List<Beverages> beverages, List<Salad> salad, List<Dessert> dessert) {
        this.dishes = dishes;
        this.beverages = beverages;
        this.salad = salad;
        this.dessert = dessert;
    }

    public List<Dishes> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dishes> dishes) {
        this.dishes = dishes;
    }

    public List<Beverages> getBeverages() {
        return beverages;
    }

    public void setBeverages(List<Beverages> beverages) {
        this.beverages = beverages;
    }

    public List<Salad> getSalad() {
        return salad;
    }

    public void setSalad(List<Salad> salad) {
        this.salad = salad;
    }

    public List<Dessert> getDessert() {
        return dessert;
    }

    public void setDessert(List<Dessert> dessert) {
        this.dessert = dessert;
    }

    Scanner scanner = new Scanner(System.in);

    @Override
    public void create(List<Menu> menus) {
        for (Menu menu : menus) {
            System.out.println(menu);
        }
    }

    @Override
    public void remove(List<Menu> menus) {
        System.out.println("write the names of what you want to delete");
        String str = scanner.nextLine();
        int i = 0;
        int i1 = 1;
        int i2 = 2;
        int i3 = 3;
        for (Menu menu : menus) {
            if (menu.getDishes().get(i).getName().contains(str)) {
              menu.getDishes().remove(i);
                System.out.println(menu);
            } else if (menu.getDishes().get(i1).getName().contains(str)) {
               menu.getDishes().remove(i1);
                System.out.println(menu);;
            } else if (menu.getDishes().get(i2).getName().contains(str)) {
                menu.getDishes().remove(i2);
                System.out.println(menu);
            } else if (menu.getDishes().get(i3).getName().contains(str)) {
                menu.getDishes().remove(i3);
                System.out.println(menu);

            } else if (menu.getBeverages().get(i1).getName().contains(str)) {
                menu.getBeverages().remove(i1);
                System.out.println(menu);
            } else if (menu.getBeverages().get(i2).getName().contains(str)) {
              menu.getBeverages().remove(i2);
                System.out.println(menu);
            } else if (menu.getBeverages().get(i3).getName().contains(str)) {
                menu.getBeverages().remove(i3);
                System.out.println(menu);
            }else if (menu.getBeverages().get(i).getName().contains(str)) {
                menu.getBeverages().remove(i);
                System.out.println(menu);

            }else if (menu.getSalad().get(i1).getName().contains(str)) {
                menu.getSalad().remove(i1);
                System.out.println(menu);
            } else if (menu.getSalad().get(i2).getName().contains(str)) {
               menu.getSalad().remove(i2);
                System.out.println(menu);
            } else if (menu.getSalad().get(i3).getName().contains(str)) {
                menu.getSalad().remove(i3);
                System.out.println(menu);
            }else if (menu.getSalad().get(i).getName().contains(str)) {
              menu.getSalad().remove(i);
                System.out.println(menu);

            } else if (menu.getDessert().get(i1).getName().contains(str)) {
                menu.getDessert().remove(i1);
                System.out.println(menu);
            } else if (menu.getDessert().get(i2).getName().contains(str)) {
                menu.getDessert().remove(i2);
                System.out.println(menu);
            } else if (menu.getDessert().get(i3).getName().contains(str)) {
                menu.getDessert().remove(i3);
                System.out.println(menu);
            }else if (menu.getDessert().get(i).getName().contains(str)) {
                menu.getDessert().remove(i);
                System.out.println(menu);
            }
        }
    }

    @Override
    public void getAll(List<Menu> menus) {
        System.out.println("============== Menu ==============");
        System.out.println("press 1 to see what we have");
        Scanner scanner = new Scanner(System.in);
        int str = scanner.nextInt();
        switch (str) {
            case 1:
                for (Menu m : menus) {
                    System.out.println(m);
                }

        }

    }

    @Override
    public void getByName(List<Menu> menus) {
        System.out.println("write the names of what you want");
        String str = scanner.nextLine();
        int i = 0;
        int i1 = 1;
        int i2 = 2;
        int i3 = 3;
        for (Menu menu : menus) {
            if (menu.getDishes().get(i).getName().contains(str)) {
                System.out.println(menu.getDishes().get(i));
            } else if (menu.getDishes().get(i1).getName().contains(str)) {
                System.out.println(menu.getDishes().get(i1));
            } else if (menu.getDishes().get(i2).getName().contains(str)) {
                System.out.println(menu.getDishes().get(i2));
            } else if (menu.getDishes().get(i3).getName().contains(str)) {
                System.out.println(menu.getDishes().get(i3));

            } else if (menu.getBeverages().get(i1).getName().contains(str)) {
                System.out.println(menu.getBeverages().get(i1));
            } else if (menu.getBeverages().get(i2).getName().contains(str)) {
                System.out.println(menu.getBeverages().get(i2));
            } else if (menu.getBeverages().get(i3).getName().contains(str)) {
                System.out.println(menu.getBeverages().get(i3));
            }else if (menu.getBeverages().get(i).getName().contains(str)) {
                System.out.println(menu.getBeverages().get(i));

            }else if (menu.getSalad().get(i1).getName().contains(str)) {
                System.out.println(menu.getSalad().get(i1));
            } else if (menu.getSalad().get(i2).getName().contains(str)) {
                System.out.println(menu.getSalad().get(i2));
            } else if (menu.getSalad().get(i3).getName().contains(str)) {
                System.out.println(menu.getSalad().get(i3));
            }else if (menu.getSalad().get(i).getName().contains(str)) {
                System.out.println(menu.getSalad().get(i));

            } else if (menu.getDessert().get(i1).getName().contains(str)) {
                System.out.println(menu.getDessert().get(i1));
            } else if (menu.getDessert().get(i2).getName().contains(str)) {
                System.out.println(menu.getDessert().get(i2));
            } else if (menu.getDessert().get(i3).getName().contains(str)) {
                System.out.println(menu.getDessert().get(i3));
            }else if (menu.getDessert().get(i).getName().contains(str)) {
                System.out.println(menu.getDessert().get(i));
            }
        }

    }

    @Override
    public void sortByprice(List<Menu> menus) {
      ArrayList<Menu> menus1= new ArrayList<>();
      menus1.sort(menus1);

        for (Menu menu : menus) {

        }
    }

    @Override
    public String toString() {
        return dishes +""+ beverages +
                "" + salad +
                "" + dessert;
    }

    @Override
    public int compare(Menu o1, Menu o2) {
        r;
    }
}
//           if (getBeverages().getName().contains(str)) {
//           System.out.println(menus);
//           } else {
//           System.out.println("you have chosen a drink that we do not have");
//           }