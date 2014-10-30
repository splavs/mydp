package chapter9;

/**
 * Created by Vyacheslav Silchenko on 30.10.2014.
 */
public abstract class MenuComponent {

    // these methods are used to maintain tree structure
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    // these methods are used to maintain leafes
    public String getDesc() {
        throw new UnsupportedOperationException();
    }

    public void print() {
        throw new UnsupportedOperationException();
    }
}
