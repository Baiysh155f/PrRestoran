package clases;

import interfaceAble.Sortable;

import java.util.Comparator;
import java.util.List;

public class Dishes {

    private String name;
    private int price;
    private String volume;

    public Dishes(String name, int price, String volume) {
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
        return "\n~~~~~~~ Dishes ~~~~~~~" +"\nName :" + name +"\nPrice :" + price +"\nvolume :"+volume+"\n";
    }

    public static Comparator<Dishes> menuComparator = new Comparator<Dishes>() {
        @Override
        public int compare(Dishes o1, Dishes o2) {
            return o1.getPrice()- o2.getPrice();
        }


    };


}

