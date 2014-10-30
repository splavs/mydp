package chapter9;

/**
 * Created by Vyacheslav Silchenko on 30.10.2014.
 */
public class MenuItem extends MenuComponent {
    String desc;

    public MenuItem(String desc) {
        this.desc = desc;
    }

    @Override
    public String getDesc() {
        return desc;
    }

    @Override
    public void print() {
        System.out.println("LEAF " + getDesc());
    }

}
