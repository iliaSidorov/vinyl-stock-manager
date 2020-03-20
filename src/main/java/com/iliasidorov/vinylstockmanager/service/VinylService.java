package com.iliasidorov.vinylstockmanager.service;

import com.iliasidorov.vinylstockmanager.model.Vinyl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VinylService {

    @Autowired
    private VinylRepository repository;

    public List<Vinyl> listAll() {
        return repository.findAll();
    }

    public Vinyl get(Long id) {
        return repository.findById(id).get();
    }

    public void save(Vinyl vinyl) {
        repository.save(vinyl);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }


}
