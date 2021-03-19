package stoylan.springframework.springpetclinic.repository;

import org.springframework.data.repository.CrudRepository;
import stoylan.springframework.springpetclinic.domain.Vet;

public interface VetRepository extends CrudRepository<Vet,Long> {
}
