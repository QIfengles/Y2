package com.sz.mapper;

import com.sz.entity.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {

    //按价格查询
    List<Book> sleByPrice(@Param("price") Integer price);
    // 查询所有书本
    List<Book> selAllBook(Book book);
    //增加书本
    void insertInfo(Book book);
    //修改书本
    int updateInfo(Book book);
    //修改2
    int updateInfoTwo(Book book);
    //删除书本
    int deleteInfo(@Param("id") Integer id);

}
