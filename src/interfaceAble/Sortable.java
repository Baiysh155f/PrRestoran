package interfaceAble;

import  clases.Menu;

import java.util.Comparator;
import java.util.List;

public interface Sortable extends Comparator<Menu> {
    public void sortByprice(List<Menu>menus);
}
