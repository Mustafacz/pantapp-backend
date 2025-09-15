package com.pantapp.pant_backend.service;

import com.pantapp.pant_backend.model.PantRequest;
import com.pantapp.pant_backend.model.PantRequestDTO;
import com.pantapp.pant_backend.repository.PantRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PantRequestService {

    @Autowired
    private PantRequestRepository pantRequestRepository;

    public PantRequest createPantRequest(PantRequestDTO dto) {
        PantRequest request = new PantRequest();

        // Set values from DTO
        request.setName(dto.getName());
        request.setEmail(dto.getEmail());
        request.setPhoneNumber(dto.getPhoneNumber());
        request.setAddress(dto.getAddress());
        request.setAvailability(dto.getAvailability());
        request.setAmount(dto.getAmount());
        request.setRequestType(dto.getRequestType());

        return pantRequestRepository.save(request);
    }
}
