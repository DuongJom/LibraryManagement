package com.management.library.repositories.Book;

import com.management.library.models.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookRepository extends MongoRepository<Book, Long> {
}
