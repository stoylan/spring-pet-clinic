package stoylan.springframework.springpetclinic.service.map;

import org.springframework.stereotype.Service;
import stoylan.springframework.springpetclinic.domain.Pet;
import stoylan.springframework.springpetclinic.domain.Speciality;
import stoylan.springframework.springpetclinic.domain.Vet;
import stoylan.springframework.springpetclinic.service.SpecialityService;
import stoylan.springframework.springpetclinic.service.VetService;

import java.util.Set;

@Service
public class VetMapService extends AbstractMapService<Vet,Long> implements VetService {
    private final SpecialityService specialityService;

    public VetMapService(SpecialityService specialityService) {
        this.specialityService = specialityService;
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {

        if (object.getSpecialities().size()>0){
            object.getSpecialities().forEach(Speciality ->{
                if (Speciality.getId()==null){
                    stoylan.springframework.springpetclinic.domain.Speciality savedSpeciality = specialityService.save(Speciality);
                    Speciality.setId(savedSpeciality.getId());
                    }
                });
            }
            return super.save(object);
        }


    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
