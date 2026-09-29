package com.foodshare.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.foodshare.entity.NGO;
import com.foodshare.repository.NGORepository;

@Service
public class NGOService {

    private final NGORepository ngoRepository;

    public NGOService(NGORepository ngoRepository) {
        this.ngoRepository = ngoRepository;
    }

    public NGO saveNGO(NGO ngo) {
        return ngoRepository.save(ngo);
    }

    public List<NGO> getAllNGOs() {
        return ngoRepository.findAll();
    }

    public NGO getNGOById(Long id) {
        return ngoRepository.findById(id).orElse(null);
    }

    public void deleteNGO(Long id) {
        ngoRepository.deleteById(id);
    }
}
