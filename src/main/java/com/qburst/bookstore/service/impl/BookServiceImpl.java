package com.qburst.bookstore.service.impl;

import java.util.List;

import com.qburst.bookstore.dao.BookDao;
import com.qburst.bookstore.model.Book;
import com.qburst.bookstore.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookDao bookDao;

	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	@Transactional
	public void saveBook(Book book) {
		bookDao.saveBook(book);
	}

	@Transactional(readOnly = true)
	public List<Book> listBooks() {
		return bookDao.listBooks();
	}

	@Transactional(readOnly = true)
	public Book getBook(Long id) {
		return bookDao.getBook(id);
	}

	@Transactional
	public void deleteBook(Long id) {
		bookDao.deleteBook(id);

	}

}
