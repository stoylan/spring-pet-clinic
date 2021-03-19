package stoylan.springframework.springpetclinic.service.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import stoylan.springframework.springpetclinic.domain.Speciality;
import stoylan.springframework.springpetclinic.repository.SpecialityRepository;
import stoylan.springframework.springpetclinic.service.CrudService;
import stoylan.springframework.springpetclinic.service.SpecialityService;

@Service
@Profile("jpa")
public class SpecialitySDJPaService extends AbstractSDJPAService<Speciality, SpecialityRepository> implements SpecialityService {

    public SpecialitySDJPaService(SpecialityRepository repository) {
        super(repository);
    }
}
