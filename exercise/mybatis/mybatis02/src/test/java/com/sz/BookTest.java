package com.sz;

import com.sun.xml.internal.bind.v2.model.core.ID;
import com.sz.entity.Book;
import com.sz.mapper.BookMapper;
import com.sz.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试类
 */

public class BookTest {

    /**
     * 添加数据aaaaa
     */
    @Test
    public void getInsertBook(){
        SqlSession session = MybatisUtil.getSession();
        BookMapper mapper = session.getMapper(BookMapper.class);
        Book book = new Book();
        book.setName("风");
        mapper.insertInfo(book);
        session.commit();
        //关闭
        session.close();
    }

    /**
     * 查询数据
     */
    @Test
    public void getSelBook(){
        SqlSession session = MybatisUtil.getSession();
        BookMapper mapper = session.getMapper(BookMapper.class);
        Book book = new Book();
        book.setId(3);
       //  book.setName("等风来");
       List<Book>list= mapper.selAllBook(book);
        System.out.println(list);
    }

    /**
     * 按价格查询数据
     */
    @Test
    public void getsleByPriceBook(){
        SqlSession session = MybatisUtil.getSession();
        BookMapper mapper = session.getMapper(BookMapper.class);
        Book book = new Book();
       List<Book> list = mapper.sleByPrice(3);
       System.out.println(list);
    }

    /**
     * 修改数据
     */
    @Test
    public void getUpdateBook(){
        SqlSession session = MybatisUtil.getSession();
        BookMapper mapper = session.getMapper(BookMapper.class);
        Book book = new Book();
        book.setId(2);
        book.setName("风来了");
        book.setIsbn("北京");
        book.setPrice(60);
        book.setDiscount(3);
        book.setPublisher("日本出社版");
        mapper.updateInfo(book);
        session.commit();
    }
    /**
     * 修改数据
     */
    @Test
    public void getUpdateBookTwo(){
        SqlSession session = MybatisUtil.getSession();
        BookMapper mapper = session.getMapper(BookMapper.class);
        Book book = new Book();
        book.setId(2);
        book.setName("ssdsadf");
        book.setIsbn("33333");
        book.setPrice(3);
        book.setDiscount(2);
        book.setPublisher("dfd");
        mapper.updateInfo(book);
        session.commit();
    }

    /**
     * 删除书本
     */
    @Test
    public void getDeletBook(){
           SqlSession session = MybatisUtil.getSession();
           int row= session.getMapper(BookMapper.class).deleteInfo(2);
           System.out.println("影响的行数"+row);
           session.commit();
           session.close();
    }


}
