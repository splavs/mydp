package chapter11;

/**
 * Created by Vyacheslav Silchenko on 03.11.2014.
 */
public class PersonBeanImpl implements PersonBean {
    String name;

    public PersonBeanImpl(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;

    }
}
