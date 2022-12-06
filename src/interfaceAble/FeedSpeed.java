package interfaceAble;

import clases.Menu;
import java.util.List;

public interface FeedSpeed extends Sortable {
    void create(List<Menu> menus);
    void remove(List<Menu> menus);
    void getAll(List<Menu> menus);
    void getByName(List<Menu> menus);




}
