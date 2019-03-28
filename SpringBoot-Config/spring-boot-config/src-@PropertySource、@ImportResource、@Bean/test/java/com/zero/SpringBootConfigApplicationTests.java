package com.zero;

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
    ApplicationContext ioc;

    @Test
    public void helloService() {
        ioc.getBean("helloService");
        boolean helloSerice = ioc.containsBean("helloService");
        System.out.println(helloSerice);
    }

}
