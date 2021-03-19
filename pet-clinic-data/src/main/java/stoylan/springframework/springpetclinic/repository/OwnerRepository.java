package stoylan.springframework.springpetclinic.repository;

import org.springframework.data.repository.CrudRepository;
import stoylan.springframework.springpetclinic.domain.Owner;

public interface OwnerRepository extends CrudRepository<Owner,Long> {
    Owner findByLastName(String lastName);

}
