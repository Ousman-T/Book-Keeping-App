package com.development.bookkeeping.service.impl;

import com.development.bookkeeping.entity.ReaderEntity;
import com.development.bookkeeping.repository.ReaderRepository;
import com.development.bookkeeping.service.ReaderService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReaderServiceImpl implements ReaderService {

    private final ReaderRepository readerRepository;

    public ReaderServiceImpl(ReaderRepository readerRepository) {
        this.readerRepository = readerRepository;
    }

    @Override
    public List<ReaderEntity> findAllReaders() {
         return readerRepository.findAll();
    }

    @Override
    public Optional<ReaderEntity> findById(Long id) {
        return readerRepository.findById(id);
    }

    @Override
    public ReaderEntity saveReader(ReaderEntity readerEntity) {
        return readerRepository.save(readerEntity);
    }

    @Override
    public ReaderEntity updateReader(ReaderEntity readerEntity) {
        return readerRepository.save(readerEntity);
    }

    @Override
    public void deleteReader(Long id) {
        readerRepository.deleteById(id);
    }
}
