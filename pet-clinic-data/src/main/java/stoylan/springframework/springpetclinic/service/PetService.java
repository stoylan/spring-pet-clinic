package stoylan.springframework.springpetclinic.service;

import stoylan.springframework.springpetclinic.domain.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> finAll();
}
