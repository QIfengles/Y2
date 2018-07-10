package com.sz.mapper;

import com.sz.entity.Book;

import java.util.List;

/**
 * 数据访问层（接口）
 */
public interface BookMapper {
    // 查询所有书本
    List<Book> AllBook();
    //增加书本
    void insertInfo(Book book);
    //修改书本
    int updateInfo(Book book);
    //删除书本
    int deleteInfo(Integer id);
}
