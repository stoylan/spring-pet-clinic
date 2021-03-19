package stoylan.springframework.springpetclinic.repository;

import org.springframework.data.repository.CrudRepository;
import stoylan.springframework.springpetclinic.domain.PetType;

public interface PetTypeRepository extends CrudRepository<PetType,Long> {
}
