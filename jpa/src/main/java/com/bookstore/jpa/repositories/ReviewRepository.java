package com.bookstore.jpa.repositories;

import com.bookstore.jpa.models.BookModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ReviewRepository extends JpaRepository<BookModel, UUID> {

}
