package stoylan.springframework.springpetclinic.service.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import stoylan.springframework.springpetclinic.domain.PetType;
import stoylan.springframework.springpetclinic.repository.PetTypeRepository;
import stoylan.springframework.springpetclinic.service.CrudService;
import stoylan.springframework.springpetclinic.service.PetTypeService;

@Service
@Profile("jpa")
public class PetTypeSDJpaService extends AbstractSDJPAService<PetType, PetTypeRepository> implements PetTypeService {
    public PetTypeSDJpaService(PetTypeRepository repository) {
        super(repository);
    }
}
