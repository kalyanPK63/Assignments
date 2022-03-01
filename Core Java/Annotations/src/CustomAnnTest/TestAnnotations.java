package CustomAnnTest;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Test{
    int t() default 1;
}
public class TestAnnotations {
    String str = "I am a test";

    @Test
    public static void testMethod(){
        System.out.println("Testing annotation");
    }

    public static void main(String[] args) {
        testMethod();
    }
}
