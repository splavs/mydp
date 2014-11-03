package chapter11;

import java.lang.reflect.Proxy;

/**
 * Created by Vyacheslav Silchenko on 03.11.2014.
 */
public class ReadOnlyProxyTestDrive {
    public static void main(String[] args) {
        ReadOnlyProxyTestDrive testDrive = new ReadOnlyProxyTestDrive();
        testDrive.drive();
    }

    public void drive() {
        PersonBean person = new PersonBeanImpl("Person");
        PersonBean proxy = getReadOnlyProxy(person);

        System.out.println("Trying to set Name through ReadOnly proxy...");
        try {
            proxy.setName("Updated");
        } catch (Exception e) {
            System.out.println("Can't update person");
        }

        System.out.println("Trying to get name....");
        try {
            String name = proxy.getName();
            System.out.println("The name is " + name);
        } catch (Exception e) {
            System.out.println("Can't couldn't get name");
        }
    }

    public PersonBean getReadOnlyProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new ReadOnlyInvocationHandler(person));
    }


}
