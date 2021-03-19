package stoylan.springframework.springpetclinic.service.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import stoylan.springframework.springpetclinic.domain.Pet;
import stoylan.springframework.springpetclinic.repository.PetRepository;
import stoylan.springframework.springpetclinic.service.PetService;

@Service
@Profile("jpa")
public class PetSDJpaService extends AbstractSDJPAService<Pet, PetRepository> implements PetService {
    public PetSDJpaService(PetRepository repository) {
        super(repository);
    }
}
