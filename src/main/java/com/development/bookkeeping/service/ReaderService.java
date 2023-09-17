package com.development.bookkeeping.service;

import com.development.bookkeeping.entity.ReaderEntity;
import java.util.List;
import java.util.Optional;

public interface ReaderService {
    List<ReaderEntity> findAllReaders();
    Optional<ReaderEntity> findById(Long id);
    ReaderEntity saveReader(ReaderEntity readerEntity);
    ReaderEntity updateReader(ReaderEntity readerEntity);
    void deleteReader(Long id);
}
