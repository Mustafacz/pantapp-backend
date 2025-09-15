package com.pantapp.pant_backend.controller;


import com.pantapp.pant_backend.model.PantRequest;
import com.pantapp.pant_backend.model.PantRequestDTO;
import com.pantapp.pant_backend.service.PantRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
