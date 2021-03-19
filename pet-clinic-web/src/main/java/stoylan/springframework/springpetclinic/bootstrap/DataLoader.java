package stoylan.springframework.springpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import stoylan.springframework.springpetclinic.domain.*;
import stoylan.springframework.springpetclinic.service.*;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialityService;
    private final VisitService visitService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialityService specialityService, VisitService visitService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
        this.visitService = visitService;
    }

    @Override
    public void run(String... args) throws Exception {
        int count = petTypeService.findAll().size();
        if(count==0)
        loadData();


    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Speciality radiology = new Speciality();
        radiology.setDescription("Radiology");

        Speciality savedRadiologySpeciality = specialityService.save(radiology);

        Speciality surgery = new Speciality();
        radiology.setDescription("Surgery");

        Speciality savedSurgerySpeciality = specialityService.save(surgery);

        Speciality dentistry = new Speciality();
        radiology.setDescription("Dentistry");

        Speciality savedDentistrySpeciality = specialityService.save(dentistry);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Owen");
        owner1.setAddress("423 Street Brickel");
        owner1.setCity("Miami");
        owner1.setTelephone("12324252623");


        Pet pet1 = new Pet();
        pet1.setPetType(savedCatPetType);
        pet1.setName("Honey");
        pet1.setBirthDate(LocalDate.now());
        pet1.setOwner(owner1);
        owner1.getPet().add(pet1);

        ownerService.save(owner1);

        Visit visit = new Visit();
        visit.setPet(pet1);
        visit.setDescription("Sneezy Kitty");
        visit.setLocalDate(LocalDate.now());
        visitService.save(visit);


        Owner owner2 = new Owner();
        owner2.setFirstName("Elizabeth");
        owner2.setLastName("Page");
        owner2.setAddress("21 Street Hilton");
        owner2.setCity("Los Angeles");
        owner2.setTelephone("12533464334");

        Pet pet2 = new Pet();
        pet2.setName("Rosco");
        pet2.setBirthDate(LocalDate.now());
        pet2.setOwner(owner2);
        pet2.setPetType(savedDogPetType);

        owner2.getPet().add(pet2);
        ownerService.save(owner2);

        System.out.println("Loaded owners...");

        Vet vet1= new Vet();
        vet1.setFirstName("Harry");
        vet1.setLastName("Clay");

        vet1.getSpecialities().add(radiology);
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jack");
        vet2.setLastName("Houston");
        vet2.getSpecialities().add(surgery);
        vetService.save(vet2);

        System.out.println("Loaded vets...");
    }
}
