package stoylan.springframework.springpetclinic.service.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import stoylan.springframework.springpetclinic.domain.Vet;
import stoylan.springframework.springpetclinic.repository.VetRepository;
import stoylan.springframework.springpetclinic.service.VetService;


@Service
@Profile("jpa")
public class VetSDJpaService extends AbstractSDJPAService<Vet, VetRepository> implements VetService {
    public VetSDJpaService(VetRepository repository) {
        super(repository);
    }


}
