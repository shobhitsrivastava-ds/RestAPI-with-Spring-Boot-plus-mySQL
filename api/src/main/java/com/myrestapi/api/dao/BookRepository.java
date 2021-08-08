package com.myrestapi.api.dao;

import com.myrestapi.api.models.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Integer> {
    public Book findById(int id);

}
