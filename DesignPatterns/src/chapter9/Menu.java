package chapter9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Vyacheslav Silchenko on 30.10.2014.
 */
public class Menu extends MenuComponent {
    String desc;
    List<MenuComponent> menuComponents;

    public Menu(String desc) {
        this.desc = desc;
        menuComponents = new ArrayList<MenuComponent>();
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public String getDesc() {
        return desc;
    }

    @Override
    public void print() {
        System.out.println("MENU " + getDesc());
        Iterator iterator = menuComponents.iterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            menuComponent.print();
        }

/* and this is with for loop
        for (MenuComponent menuComponent : menuComponents) {
            menuComponent.print();
        }
*/
    }
}
