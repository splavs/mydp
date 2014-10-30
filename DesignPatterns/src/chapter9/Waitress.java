package chapter9;

/**
 * Created by Vyacheslav Silchenko on 30.10.2014.
 */
public class Waitress {
    MenuComponent allMenu;

    public Waitress(MenuComponent allMenu) {
        this.allMenu = allMenu;
    }

    public void print() {
        allMenu.print();
    }
}
