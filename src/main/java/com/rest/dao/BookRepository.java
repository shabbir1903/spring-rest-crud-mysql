package com.rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.rest.model.Book;

import java.util.List;
// 1JPaRepository, Crud Repository PagingAndSortingRepos
public interface BookRepository extends JpaRepository<Book, Long>{

    List<Book> findByName(String name);

}
