package stoylan.springframework.springpetclinic.service;


import stoylan.springframework.springpetclinic.domain.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner,Long> {
    Owner findByLastName(String lastName);
}
