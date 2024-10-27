package com.solvio.store.backend.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/stores")
public class StoreController {

    private List<Store> storeList = new ArrayList<>();

    // Create Store
    @PostMapping
    public ResponseEntity<String> createStore(@RequestBody Store store) {
        storeList.add(store);
        return new ResponseEntity<>("Store created successfully", HttpStatus.CREATED);
    }

    // Get All Stores
    @GetMapping
    public ResponseEntity<List<Store>> getStores() {
        return new ResponseEntity<>(storeList, HttpStatus.OK);
    }

    // Delete Store by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteStore(@PathVariable int id) {
        if (id < 0 || id >= storeList.size()) {
            return new ResponseEntity<>("Store not found", HttpStatus.NOT_FOUND);
        }
        storeList.remove(id);
        return new ResponseEntity<>("Store deleted successfully", HttpStatus.OK);
    }
}
