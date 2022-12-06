package clases;

import java.util.Comparator;

public class Dessert extends Menu {
    private String name;
    private int price;
    private String volume;

    public Dessert(String name, int price, String volume) {
        this.name = name;
        this.price = price;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }
    @Override
    public String toString() {
        return "~~~~~~~ Desserts ~~~~~~~" +"\nName :" + name +"\nPrice :" + price +"\nvolume :"+volume+"\n";
    }
    public static Comparator<Dessert> menuComparator = new Comparator<Dessert>() {
        @Override
        public int compare(Dessert o1, Dessert o2) {
            return o1.getPrice()- o2.getPrice();
        }


    };

}
