package stoylan.springframework.springpetclinic.service.map;

import stoylan.springframework.springpetclinic.domain.Owner;
import stoylan.springframework.springpetclinic.domain.Pet;
import stoylan.springframework.springpetclinic.service.CrudService;

import java.util.Set;

public class PetMapService extends AbstractMapService<Pet,Long> implements CrudService<Pet,Long> {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Long id, Pet object) {
        return save(id,object);
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
