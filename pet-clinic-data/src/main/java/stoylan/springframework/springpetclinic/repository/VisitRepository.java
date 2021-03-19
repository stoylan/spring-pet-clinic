package stoylan.springframework.springpetclinic.repository;

import org.springframework.data.repository.CrudRepository;
import stoylan.springframework.springpetclinic.domain.Visit;

public interface VisitRepository extends CrudRepository<Visit,Long> {
}
