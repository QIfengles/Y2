package com.sz.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisUtil {
    private static SqlSessionFactory sqlSessionFactory;

    static {
        //1.定义mybatis核心配置文件的位置
        //2.通过mabatis的工具类加载这个文件为输入流
        InputStream is =null;
        //异常处理
            //1.定义mybatis核心配置文件的位置
        try {
            is= Resources.getResourceAsStream("mybatis.cfg.xml");
            sqlSessionFactory= new SqlSessionFactoryBuilder().build(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //生产会话
    public static SqlSession getSession(){
      return  sqlSessionFactory.openSession();
    }
}
