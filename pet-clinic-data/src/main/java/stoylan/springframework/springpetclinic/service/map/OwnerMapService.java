package stoylan.springframework.springpetclinic.service.map;

import stoylan.springframework.springpetclinic.domain.Owner;
import stoylan.springframework.springpetclinic.service.CrudService;

import java.util.Set;

public class OwnerMapService extends AbstractMapService<Owner,Long> implements CrudService<Owner,Long> {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
        delete(object);
    }

    @Override
    public Owner save(Long id,Owner object) {
        return super.save(id,object);
    }

}
