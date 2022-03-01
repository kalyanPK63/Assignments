package CustomAnnInfo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Info{
    String AuthorID();
    String Author() default "";
    String Supervisor() default "";
    String Date();
    String Time();
    String Version();
    String Description() default "";


}
@Info(AuthorID = "007",Date = "22/02/2022", Time = "02:20", Version = "2.0")
public class Movies {
    String Movie;
    String Actor;

    public Movies(String Movie, String Actor) {
        this.Actor = Actor;
        this.Movie = Movie;
    }
}
