package stoylan.springframework.springpetclinic.service.map;

import org.springframework.stereotype.Service;
import stoylan.springframework.springpetclinic.domain.Owner;
import stoylan.springframework.springpetclinic.domain.Vet;
import stoylan.springframework.springpetclinic.service.CrudService;
import stoylan.springframework.springpetclinic.service.VetService;

import java.util.Set;

@Service
public class VetMapService extends AbstractMapService<Vet,Long> implements VetService {
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
        return super.save(object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
