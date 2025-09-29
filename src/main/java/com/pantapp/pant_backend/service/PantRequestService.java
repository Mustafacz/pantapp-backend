package com.pantapp.pant_backend.service;

import com.pantapp.pant_backend.model.PantRequest;
import com.pantapp.pant_backend.model.PantRequestDTO;
import com.pantapp.pant_backend.repository.PantRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public List<PantRequest> getAllRequests() {
        return pantRequestRepository.findAll();
    }

    public PantRequest updatedRequest(Long id, PantRequest updatedRequest) {
        return pantRequestRepository.findById(id)
                .map(existingRequest -> {
                    existingRequest.setEmail(updatedRequest.getEmail());
                    existingRequest.setPhoneNumber(updatedRequest.getPhoneNumber());
                    existingRequest.setAddress(updatedRequest.getAddress());
                    existingRequest.setAmount(updatedRequest.getAmount());
                    existingRequest.setRequestType(updatedRequest.getRequestType());
                    return pantRequestRepository.save(existingRequest);
                })
                .orElseThrow(() -> new RuntimeException("Request not found with id " + id ));
    }
}
