package luo.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test1 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        HelloService service = new HelloServiceImpl();
        Method method = HelloService.class.getMethod("sayHello", String.class);

        Object ret = method.invoke(service,"张三");
    }

}
