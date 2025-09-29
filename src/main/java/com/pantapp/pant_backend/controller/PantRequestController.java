package com.pantapp.pant_backend.controller;


import com.pantapp.pant_backend.model.PantRequest;
import com.pantapp.pant_backend.model.PantRequestDTO;
import com.pantapp.pant_backend.service.PantRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/requests")
public class PantRequestController {

    @Autowired
    private PantRequestService pantRequestService;

    // Endpint for creationg a new request
    @PostMapping
    public PantRequest createRequst(@RequestBody PantRequestDTO dto) {
        return pantRequestService.createPantRequest(dto);
    }

    @GetMapping
    public List<PantRequest> getAllRequests() {
        return pantRequestService.getAllRequests();
    }

    @PutMapping("/{id}")
    public PantRequest updateRequest(@PathVariable Long id, @RequestBody PantRequest request) {
        return pantRequestService.updatedRequest(id, request);
    }
}
