package stoylan.springframework.springpetclinic.service.map;

import org.springframework.stereotype.Service;
import stoylan.springframework.springpetclinic.domain.Owner;
import stoylan.springframework.springpetclinic.domain.Pet;
import stoylan.springframework.springpetclinic.service.CrudService;
import stoylan.springframework.springpetclinic.service.PetService;

import java.util.Set;

@Service
public class PetMapService extends AbstractMapService<Pet,Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        return save(object);
    }

    @Override
    public void deleteById(Long id) {
        deleteById(id);
    }
    @Override
    public Pet findById(Long id) {
        return findById(id);
    }


}
