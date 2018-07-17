package com.sz.select.test;

import com.sz.news.bean.Boy;
import com.sz.news.bean.Car;
import com.sz.old.been.Dog;
import com.sz.old.been.HelloSpring;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Calendar;

/**
 * 人
 */
public class Test1 {

    @Test
    public void sum(){
        ApplicationContext context = new ClassPathXmlApplicationContext("app1.xml");
      HelloSpring helloSpring=(HelloSpring)context.getBean("spring");
      System.out.println(helloSpring);

    Boy boy=(Boy) context.getBean("boy");
    System.out.println(boy);
    }

    @Test
    public void sum21(){
        ApplicationContext context = new ClassPathXmlApplicationContext("app1.xml");
        Boy boy=(Boy) context.getBean("boy");
        System.out.println(boy);

        Boy boy2=(Boy) context.getBean("boy2");
        System.out.println(boy2);
    }


    /**
     * 注入
     */
    @Test
    public void sum2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("app1.xml");
        Car car=(Car) context.getBean("car");
        System.out.println(car);
    }




}
