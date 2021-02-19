package stoylan.springframework.springpetclinic.service;

import stoylan.springframework.springpetclinic.domain.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> finAll();
}
