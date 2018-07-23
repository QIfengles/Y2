package cn.smbms.tools;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class myBatisUtil {
    private  static SqlSessionFactory sqlSessionFactory;

    static {
        try{
            InputStream is = Resources.getResourceAsStream("mybatis-cfg.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public  static SqlSession getSqlSession(){
        return  sqlSessionFactory.openSession();
    }

    /**
     * 释放资源！
     * @param sqlSession
     */
    public static void closeAll(SqlSession sqlSession){
        if(null != sqlSession){
            sqlSession.close();
        }
    }
}
