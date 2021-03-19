package stoylan.springframework.springpetclinic.repository;

import org.springframework.data.repository.CrudRepository;
import stoylan.springframework.springpetclinic.domain.Pet;

public interface PetRepository extends CrudRepository<Pet,Long> {
}
