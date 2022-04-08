package spring_core;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import static org.junit.jupiter.api.Assertions.*;

class SpringCoreApplicationTest {

    @Test
    void main() {
        SpringCoreApplication springCoreApplication = new SpringCoreApplication();
        ApplicationContext context = new ClassPathXmlApplicationContext("spring2.xml");

        String s = "Customer = { customerId='12345', customerName='Pavan', customerContact='6303727856', customerAddress=Address { street='Road No.9', city='Hyderabad', state='Telangana', zip='500033', country='India'}}";
        assertEquals(s, context.getBean("Customer"));
    }
}