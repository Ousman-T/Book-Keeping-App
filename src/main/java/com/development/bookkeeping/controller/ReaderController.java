package com.development.bookkeeping.controller;

import com.development.bookkeeping.entity.ReaderEntity;
import com.development.bookkeeping.service.ReaderService;
import org.springframework.web.bind.annotation.*;
import com.development.bookkeeping.service.ReaderBookService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/reader")
public class ReaderController {
    private final ReaderService readerService;
    private final ReaderBookService readerBookService;

    public ReaderController(ReaderService readerService, ReaderBookService readerBookService) {
        this.readerService = readerService;
        this.readerBookService = readerBookService;
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
@PutMapping("/{id}")
    public ReaderEntity updateReader(@PathVariable Long id,@RequestBody ReaderEntity readerEntity){
        return readerService.updateReader(readerEntity);
    }
    @DeleteMapping("/{id}")
    public void deleteReader(@PathVariable("id") Long id){
        readerService.deleteReader(id);
    }


}
