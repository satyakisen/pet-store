package com.naruto.petstoreserver.pet;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PetServiceImpl implements PetService {

    private final PetRepository petRepo;

    @Autowired
    public PetServiceImpl(PetRepository petRepo) {
        this.petRepo = petRepo;
    }

    @Override
    public List<Pet> fetchAllPet() {
        List<Pet> pets = petRepo.findAll();
        return pets;
    }

}
