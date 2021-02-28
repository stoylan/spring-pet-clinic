package stoylan.springframework.springpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import stoylan.springframework.springpetclinic.domain.Owner;
import stoylan.springframework.springpetclinic.domain.Vet;
import stoylan.springframework.springpetclinic.service.OwnerService;
import stoylan.springframework.springpetclinic.service.VetService;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Owen");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Elizabeth");
        owner2.setLastName("Page");

        ownerService.save(owner2);

        System.out.println("Loaded owners...");

        Vet vet1= new Vet();
        vet1.setFirstName("Harry");
        vet1.setLastName("Clay");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jack");
        vet2.setLastName("Houston");

        vetService.save(vet2);

        System.out.println("Loaded vets...");


    }
}
