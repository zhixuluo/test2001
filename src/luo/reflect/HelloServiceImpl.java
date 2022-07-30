package luo.reflect;

public class HelloServiceImpl implements HelloService{
    @Override
    public void sayHello(String a) {
        System.out.println("你好" + a);
    }
}
