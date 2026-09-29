package com.foodshare.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.foodshare.entity.NGO;
import com.foodshare.service.NGOService;

@RestController
@RequestMapping("/api/ngos")
@CrossOrigin(origins = "*")
public class NGOController {

    private final NGOService ngoService;

    public NGOController(NGOService ngoService) {
        this.ngoService = ngoService;
    }

    @PostMapping
    public NGO saveNGO(@RequestBody NGO ngo) {
        return ngoService.saveNGO(ngo);
    }

    @GetMapping
    public List<NGO> getAllNGOs() {
        return ngoService.getAllNGOs();
    }

    @GetMapping("/{id}")
    public NGO getNGOById(@PathVariable Long id) {
        return ngoService.getNGOById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteNGO(@PathVariable Long id) {
        ngoService.deleteNGO(id);
        return "NGO deleted successfully";
    }
}
