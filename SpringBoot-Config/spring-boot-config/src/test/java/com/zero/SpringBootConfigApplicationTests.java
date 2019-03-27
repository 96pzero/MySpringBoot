package com.zero;

import com.zero.bean.Person;
import com.zero.bean.Person2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootConfigApplicationTests {

    @Autowired
    Person person;
    @Autowired
    Person2 person2;
    @Autowired
    ApplicationContext ioc;

    @Test
    public void hello() {
        boolean hello = ioc.containsBean("hello");
        System.out.println(hello);
    }

    @Test
    public void helloService() {
        ioc.getBean("helloService");
        boolean helloSerice = ioc.containsBean("helloService");
        System.out.println(helloSerice);
    }

    @Test
    public void contextLoads() {
        System.out.println(person);
    }

    @Test
    public void test() {
        System.out.println(person2);
    }
}
