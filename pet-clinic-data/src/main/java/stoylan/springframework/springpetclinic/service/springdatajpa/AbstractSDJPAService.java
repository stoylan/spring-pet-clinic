package stoylan.springframework.springpetclinic.service.springdatajpa;

import org.springframework.data.repository.CrudRepository;
import stoylan.springframework.springpetclinic.domain.BaseEntity;
import stoylan.springframework.springpetclinic.domain.Owner;
import stoylan.springframework.springpetclinic.service.CrudService;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public abstract class AbstractSDJPAService<T extends BaseEntity,R extends CrudRepository<T,Long>> implements CrudService<T,Long>{

    protected final R repository;

    public AbstractSDJPAService(R repository) {
        this.repository = repository;
    }

    @Override
    public Set<T> findAll() {
        Set<T> set = new HashSet<>();
        repository.findAll().iterator().forEachRemaining(set::add);
        return set;
    }

    @Override
    public T findById(Long aLong) {
        return repository.findById(aLong).orElse(null);
    }

    @Override
    public T save(T object) {
        return repository.save(object);
    }

    @Override
    public void delete(T object) {
        repository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        repository.deleteById(aLong);
    }
}
