package CustomAnnInfo;

import java.lang.annotation.Annotation;

public class Demo {

    public static void main(String[] args) {
        Movies movie = new Movies("From Russia, with Love", "Sean Connery");

        Class c = movie.getClass();
        Annotation A = c.getAnnotation(Info.class);
        Info info = (Info) A;
        System.out.println(info.AuthorID());
    }
}
