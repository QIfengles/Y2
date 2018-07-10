package com.sz;

import com.sun.xml.internal.bind.v2.model.core.ID;
import com.sz.entity.Book;
import com.sz.mapper.BookMapper;
import com.sz.util.MybatisUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionException;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Member;
import java.util.List;


/**
 * 测试类
 */
public class Test1 {
    @Test
    public void allBook(){
        //1.定义mybatis核心配置文件的位置
        //2.通过mabatis的工具类加载这个文件为输入流
        InputStream is =null;
        SqlSessionFactory factory=null;
        SqlSession sqlSession=null;
        //异常处理
        try {
            //1.定义mybatis核心配置文件的位置
            is= Resources.getResourceAsStream("mybastis.cfg.xml");
            //3.创建一个会话工厂
            factory= new SqlSessionFactoryBuilder().build(is);
            //4.利用工厂生产会话
            sqlSession=factory.openSession();
            //5.使用会话进行相关的操作
            BookMapper book=sqlSession.getMapper(BookMapper.class);
            //查询所有
            List<Book>books=book.AllBook();
            for(Book b:books){
                System.out.print(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    /**
     * 查询所有书本
     */
    @Test
    public void getAllBook(){
     SqlSession sqlSession =MybatisUtil.getSession();
     BookMapper bookDao=sqlSession.getMapper(BookMapper.class);
     List<Book>books=bookDao.AllBook();
     System.out.println(books);
     if(sqlSession!=null){
         sqlSession.close();
     }
    }

    /**
     * 添加书本
     */
   @Test
   public void getinsertBook(){
      SqlSession sqlSession = MybatisUtil.getSession();
      BookMapper mapper = sqlSession.getMapper(BookMapper.class);
      Book book = new Book();
      try {
          book.setName("风的跟随者");
          book.setIsbn("上海");
          book.setPrice(34);
          book.setDiscount(3);
          book.setPublisher("上海出版社");
          mapper.insertInfo(book);
          sqlSession.commit();
      }catch (SqlSessionException e){
        sqlSession.rollback();
      }finally {
          if(sqlSession!=null){
              sqlSession.close();
          }
      }


   }

    /**
     * 实现修改书本
     */
   @Test
   public void getUpdateBook(){
       SqlSession sqlSession = MybatisUtil.getSession();
       BookMapper mapper = sqlSession.getMapper(BookMapper.class);
       Book book =new Book();
       book.setId(1);
       book.setName("风雨交加");
       book.setIsbn("上海");
       book.setPrice(34);
       book.setDiscount(2);
       book.setPublisher("深圳出社版");
      int row= mapper.updateInfo(book);
       System.out.println("影响行书："+row);
       sqlSession.commit();
//       测试
       // 01

   }


    /**
     * 实现删除书本
     */
   @Test
   public void getDeleteBook(){
       SqlSession sqlSession = MybatisUtil.getSession();
       BookMapper mapper = sqlSession.getMapper(BookMapper.class);
       int row = mapper.deleteInfo(1);
       System.out.println(row);
       sqlSession.commit();

   }


}
