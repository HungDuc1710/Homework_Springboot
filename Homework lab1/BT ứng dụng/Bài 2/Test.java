import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws NoSuchMethodException, SecurityException {
        HelloWorld h = new HelloWorld();
        Method m = h.getClass().getMethod("sayHello");
        System.out.println(m.getAnnotation(MyNumberAnnotation.class).value());
    }
}
