package chapter11;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Vyacheslav Silchenko on 03.11.2014.
 */
public class ReadOnlyInvocationHandler implements InvocationHandler {
    PersonBean person;

    public ReadOnlyInvocationHandler(PersonBean person) {
        this.person = person;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try {
            if (method.getName().startsWith("get")) {
                return method.invoke(person, args);
            } else {
                throw new IllegalAccessException();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
