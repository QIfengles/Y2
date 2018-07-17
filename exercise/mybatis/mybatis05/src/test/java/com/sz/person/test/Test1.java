package com.sz.person.test;

import com.sz.old.been.HelloSpring;
import com.sz.old.been.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

    @Test
    public void personTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("app1.xml");
        Person person3=(Person)context.getBean("person3");
        Person person2=(Person)context.getBean("person2");
        System.out.println(person3);
        System.out.println(person2);
    }
}
