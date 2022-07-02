package com.zeng.service;

import com.zeng.dao.BookMapper;
import com.zeng.pojo.Books;

import java.util.List;

public class BookServiceImpl implements BookService {

    //service调dao层 ：组合Dao层

    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    @Override
    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    @Override
    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    @Override
    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    @Override
    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }

    @Override
    public List<Books> queryByName(String name) {
        return bookMapper.queryByName(name);
    }
}
