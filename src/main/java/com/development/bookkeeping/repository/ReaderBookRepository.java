package com.development.bookkeeping.repository;

import com.development.bookkeeping.entity.BookEntity;
import com.development.bookkeeping.entity.ReaderBookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReaderBookRepository extends JpaRepository<ReaderBookEntity, Long> {

}
