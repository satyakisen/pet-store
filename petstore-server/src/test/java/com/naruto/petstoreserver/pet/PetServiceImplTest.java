package com.naruto.petstoreserver.pet;

import static org.mockito.Mockito.when;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
public class PetServiceImplTest {

    @MockBean
    private PetRepository petRepo;

    private PetService petService;

    @BeforeEach
    public void setUp() {
        petService = new PetServiceImpl(petRepo);
    }

    @Test
    public void testFetchAllPet() {
        Pet pet = Pet.builder().id(0).name("tobby").photoUrls(List.of("")).build();
        when(petRepo.findAll()).thenReturn(List.of(pet));
        List<Pet> pets = petService.fetchAllPet();
        Assertions.assertThat(pets.size() > 0);
        Assertions.assertThat(pets.get(0).getId() == 0);
    }
}
