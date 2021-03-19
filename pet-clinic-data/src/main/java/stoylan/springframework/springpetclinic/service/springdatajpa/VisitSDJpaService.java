package stoylan.springframework.springpetclinic.service.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import stoylan.springframework.springpetclinic.domain.Visit;
import stoylan.springframework.springpetclinic.repository.VisitRepository;
import stoylan.springframework.springpetclinic.service.VisitService;

@Service
@Profile("jpa")
public class VisitSDJpaService extends AbstractSDJPAService<Visit, VisitRepository> implements VisitService {
    public VisitSDJpaService(VisitRepository repository) {
        super(repository);
    }
}
