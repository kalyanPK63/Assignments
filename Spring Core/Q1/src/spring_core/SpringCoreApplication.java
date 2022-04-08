package spring_core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCoreApplication {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring2.xml");

        System.out.println("Setter = " + context.getBean("Customer"));
        System.out.println("Constructor = " + context.getBean("C_Customer"));

    }

}
