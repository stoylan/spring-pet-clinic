package stoylan.springframework.springpetclinic.service.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import stoylan.springframework.springpetclinic.domain.Visit;
import stoylan.springframework.springpetclinic.service.VisitService;

import java.util.Set;

@Service
@Profile({"default","map"})
public class VisitMapService extends AbstractMapService<Visit,Long> implements VisitService {
    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public Visit findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Visit save(Visit object) {
        if (object.getPet() ==null || object.getPet().getId() ==null || object.getPet().getOwner() ==null) {
            throw new RuntimeException("Invalid visit");
        }
        return super.save(object);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    public void delete(Visit object) {
        super.delete(object);
    }
}
