package CustomAnnExecute;

import javax.sound.midi.Sequence;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

import static CustomAnnExecute.TestAnnotations.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Execute{
    int Sequence() ;
}
class TestAnnotations {
    String str = "I am a test";

    @Execute(Sequence = 2)
    public static void testMethod1(){
        System.out.println("Testing annotation1");
    }

    @Execute(Sequence = 3)
    public static void testMethod2(){
        System.out.println("Testing annotation2");
    }

    @Execute(Sequence = 1)
    public static void testMethod3(){
        System.out.println("Testing annotation3");
    }
}

public class test{
    public static void main(String[] args) throws Exception {
        TestAnnotations t = new TestAnnotations();
        Execute a = t.getClass().getMethod("testMethod1").getAnnotation(Execute.class);
        Execute b = t.getClass().getMethod("testMethod2").getAnnotation(Execute.class);
        Execute c = t.getClass().getMethod("testMethod3").getAnnotation(Execute.class);

        System.out.println(a.Sequence());
        System.out.println(b.Sequence());
        System.out.println(c.Sequence());
    }
}
