package stoylan.springframework.springpetclinic.service.map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import stoylan.springframework.springpetclinic.domain.Owner;
import stoylan.springframework.springpetclinic.service.PetService;
import stoylan.springframework.springpetclinic.service.PetTypeService;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class OwnerMapServiceTest {
    OwnerMapService ownerMapService;
    @Autowired
    PetTypeService petTypeService;
    @Autowired
    PetService petService;


    @BeforeEach
    void setUp() {
        ownerMapService = new OwnerMapService(petTypeService,petService);
        ownerMapService.save(Owner.builder().id(1L).lastname("Smith").build());
        ownerMapService.save(Owner.builder().id(2L).build());
    }

    @Test
    void findAll() {
        Set<Owner> ownerSet = ownerMapService.findAll();
        assertEquals(2,ownerSet.size());
    }

    @Test
    void findById() {
        Owner owner = ownerMapService.findById(2L);
        assertEquals(2L,owner.getId());
    }

    @Test
    void saveExistingId() {
        Long id = 3L;
        Owner owner2 = new Owner();
        owner2.setId(id);
        Owner savedOwner = ownerMapService.save(owner2);
        assertEquals(id,savedOwner.getId());
    }

    @Test
    void saveNoId() {
        Owner savedOwner = ownerMapService.save(Owner.builder().build());
        assertNotNull(savedOwner);
        assertNotNull(savedOwner.getId());
    }

    @Test
    void deleteById() {
        Long id = 3L;
        Owner owner = ownerMapService.save(Owner.builder().id(3L).build());
        ownerMapService.deleteById(id);
        assertNull(ownerMapService.findById(id));
    }

    @Test
    void delete() {
        Owner owner = ownerMapService.save(Owner.builder().id(4L).build());

        ownerMapService.delete(owner);
        assertNull(ownerMapService.findById(4L));
    }

    @Test
    void findByLastName() {
        Owner findedOwner = ownerMapService.findByLastName("Smith");
        assertNotNull(findedOwner);
        assertEquals(1L,findedOwner.getId());
    }

    @Test
    void findByLastNameNotFound(){
        Owner notFindedOwner = ownerMapService.findByLastName("Foo");
        assertNull(notFindedOwner);
    }
}