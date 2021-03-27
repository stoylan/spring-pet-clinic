package stoylan.springframework.springpetclinic.service.springdatajpa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import stoylan.springframework.springpetclinic.domain.Owner;
import stoylan.springframework.springpetclinic.repository.OwnerRepository;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class OwnerSDJpaServiceTest {
    @Mock
    OwnerRepository ownerRepository;

    @InjectMocks
    OwnerSDJpaService ownerSDJpaService;

    Owner owner;
    @BeforeEach
    void setUp() {
        owner = Owner.builder().id(1L).lastname("Smith").build();
    }

    @Test
    void findAll() {
        Set<Owner> owners = new HashSet<>();
        owners.add(Owner.builder().id(1L).build());
        owners.add(Owner.builder().id(2L).build());

        when(ownerRepository.findAll()).thenReturn(owners);

        Set<Owner> returnOwners = ownerSDJpaService.findAll();

        assertEquals(owners,returnOwners);

    }

    @Test
    void findById() {
        when(ownerRepository.findById(anyLong())).thenReturn(java.util.Optional.ofNullable(owner));

        Owner findedOwner = ownerSDJpaService.findById(owner.getId());
        assertEquals(findedOwner.getId(),owner.getId());
    }
    @Test
    void findByIdNotFound() {
        when(ownerRepository.findById(anyLong())).thenReturn(Optional.empty());

        Owner findedOwner = ownerSDJpaService.findById(1L);
        assertNull(findedOwner);
    }

    @Test
    void save() {
        when(ownerRepository.save(any())).thenReturn(owner);

        Owner savedOwner = ownerSDJpaService.save(owner);

        assertNotNull(savedOwner);
        verify(ownerRepository).save(any());
    }

    @Test
    void delete() {
        ownerSDJpaService.delete(owner);
        verify(ownerRepository).delete(any());

    }

    @Test
    void deleteById() {
        ownerSDJpaService.deleteById(1L);
        verify(ownerRepository).deleteById(anyLong());
    }

    @Test
    void findByLastName() {

        when(ownerRepository.findByLastName(any())).thenReturn(owner);

        Owner smith = ownerSDJpaService.findByLastName("Smith");

        assertEquals("Smith",smith.getLastName());

        verify(ownerRepository).findByLastName(any());
    }
}