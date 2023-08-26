package com.naruto.petstoreserver.pet;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface PetRepository extends JpaRepository<Pet, Integer> {
    
}
