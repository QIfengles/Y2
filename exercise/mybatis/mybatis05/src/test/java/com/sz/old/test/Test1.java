package com.sz.old.test;

import com.sz.old.been.Dog;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 狗狗测试
 */
public class Test1 {



    @Test
    public void dogTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("app1.xml");
        Dog dog=(Dog)context.getBean("dog");
        System.out.println(dog);
    }


}
