package stoylan.springframework.springpetclinic.service.map;

import org.springframework.stereotype.Service;
import stoylan.springframework.springpetclinic.domain.Owner;
import stoylan.springframework.springpetclinic.domain.Pet;
import stoylan.springframework.springpetclinic.service.OwnerService;
import stoylan.springframework.springpetclinic.service.PetService;
import stoylan.springframework.springpetclinic.service.PetTypeService;

import java.util.Set;

@Service
public class OwnerMapService extends AbstractMapService<Owner,Long> implements OwnerService {
    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerMapService(PetTypeService petTypeService, PetTypeMapService petTypeMapService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        if (object != null){
            if (object.getPet() != null){
                object.getPet().forEach(Pet ->{
                    if (Pet.getPetType()!=null){
                        Pet.setPetType(petTypeService.save(Pet.getPetType()));
                    }else {
                        throw new RuntimeException("Pet type is required.");
                    }
                    if (Pet.getId()==null){
                        Pet savedPet = petService.save(Pet);
                        Pet.setId(savedPet.getId());
                    }
                });
            }
            return super.save(object);
        }else
            return null;



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
    public Owner findByLastName(String lastName) {
        return null;
    }
}
