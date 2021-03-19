package stoylan.springframework.springpetclinic.repository;

import org.springframework.data.repository.CrudRepository;
import stoylan.springframework.springpetclinic.domain.Speciality;

public interface SpecialityRepository extends CrudRepository<Speciality,Long> {
}
