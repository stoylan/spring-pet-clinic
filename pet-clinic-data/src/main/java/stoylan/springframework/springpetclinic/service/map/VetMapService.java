package stoylan.springframework.springpetclinic.service.map;

import stoylan.springframework.springpetclinic.domain.Owner;
import stoylan.springframework.springpetclinic.domain.Vet;
import stoylan.springframework.springpetclinic.service.CrudService;

import java.util.Set;

public class VetMapService extends AbstractMapService<Vet,Long> implements CrudService<Vet,Long> {
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
    public Vet save(Long id, Vet object) {
        return super.save(id,object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
