package com.development.bookkeeping.controller;

import com.development.bookkeeping.entity.ReaderEntity;
import com.development.bookkeeping.exception.ApiRequestException;
import com.development.bookkeeping.service.ReaderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/reader")
public class ReaderController {
    private final ReaderService readerService;

    public ReaderController(ReaderService readerService) {
        this.readerService = readerService;
    }
@GetMapping
    public List<ReaderEntity> findAllReaders(){
//        throw new ApiRequestException("Testing custom exceptions!");
        return readerService.findAllReaders();
    }
@GetMapping("/{id}")
    public Optional<ReaderEntity> findReaderById(@PathVariable("id") Long id){
        return readerService.findById(id);
    }
@PostMapping
    public ReaderEntity saveReader(@RequestBody ReaderEntity readerEntity){
        return readerService.saveReader(readerEntity);
    }
@PutMapping
    public ReaderEntity updateReader(@RequestBody ReaderEntity readerEntity){
        return readerService.updateReader(readerEntity);
    }
    @DeleteMapping("/{id}")
    public void deleteReader(@PathVariable("id") Long id){
        readerService.deleteReader(id);
    }
}
