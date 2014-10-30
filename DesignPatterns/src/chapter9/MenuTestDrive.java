package chapter9;

/**
 * Created by Vyacheslav Silchenko on 30.10.2014.
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        MenuComponent allMenu = new Menu("Main menu");
        MenuComponent menu1 = new Menu("Menu1");
        MenuComponent menu2 = new Menu("Menu2");

        MenuComponent leaf11 = new MenuItem("Leaf1");
        MenuComponent leaf12 = new MenuItem("Leaf2");
        MenuComponent leaf21 = new MenuItem("Leaf1");
        MenuComponent leaf22 = new MenuItem("Leaf2");


        menu1.add(leaf11);
        menu1.add(leaf12);
        menu2.add(leaf21);
        menu2.add(leaf22);

        allMenu.add(menu1);
        allMenu.add(menu2);

        Waitress waitress = new Waitress(allMenu);
        waitress.print();
    }
}
