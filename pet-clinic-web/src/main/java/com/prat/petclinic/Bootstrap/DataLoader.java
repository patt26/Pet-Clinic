package com.prat.petclinic.Bootstrap;

import com.prat.petclinic.Model.Owner;
import com.prat.petclinic.Model.Vet;
import com.prat.petclinic.Service.OwnerService;
import com.prat.petclinic.Service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

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
        Owner jhon = new Owner();
        jhon.setId(1L);
        jhon.setFirstName("John");
        jhon.setLastName("Martin");
        ownerService.save(jhon);

        Owner smith = new Owner();
        smith.setId(2L);
        smith.setFirstName("Smith");
        smith.setLastName("Cooper");
        ownerService.save(smith);

        System.out.println("Owner loaded...");

        Vet alex = new Vet();
        alex.setId(1L);
        alex.setFirstName("Alex");
        alex.setLastName("Stark");
        vetService.save(alex);

        Vet ashley=new Vet();
        ashley.setId(2L);
        ashley.setFirstName("Ashley");
        ashley.setLastName("Harris");
        vetService.save(ashley);

        System.out.println("Vets loaded....");


    }
}
