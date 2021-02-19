package stoylan.springframework.springpetclinic.service;


import stoylan.springframework.springpetclinic.domain.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> finAll();
}
