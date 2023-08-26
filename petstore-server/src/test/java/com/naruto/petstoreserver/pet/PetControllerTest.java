package com.naruto.petstoreserver.pet;

import static org.hamcrest.Matchers.greaterThan;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(controllers = { PetController.class })
public class PetControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private PetService petSerivce;

    @Test
    public void testFetchAllPet() throws Exception {
        Pet pet = Pet.builder().id(0).name("tobby").photoUrls(List.of("")).build();

        when(petSerivce.fetchAllPet()).thenReturn(List.of(pet));

        mockMvc.perform(get("/v2/pet"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.length()", greaterThan(0)));
    }
}
