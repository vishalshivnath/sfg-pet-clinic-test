package guru.springframework.sfgpetclinictest.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import guru.springframework.sfgpetclinictest.model.Owner;
import guru.springframework.sfgpetclinictest.model.Vet;
import guru.springframework.sfgpetclinictest.services.OwnerService;
import guru.springframework.sfgpetclinictest.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {

  private final OwnerService ownerService;
  private final VetService vetService;

  public DataLoader(final OwnerService ownerService, final VetService vetService) {
    this.ownerService = ownerService;
    this.vetService = vetService;
  }

  /*public DataLoader() {
    this.ownerService = new OwnerServiceMap();
    this.vetService = new VetServiceMap();
  }*/

  @Override
  public void run(final String... args) throws Exception {
    Owner owner1 = new Owner();
    owner1.setFirstName("Michael");
    owner1.setLastName("Weston");
    ownerService.save(owner1);

    Owner owner2 = new Owner();
    owner2.setFirstName("Fiona");
    owner2.setLastName("Glenanne");
    ownerService.save(owner2);

    System.out.println("Loaded Owners....");

    Vet vet1 = new Vet();
    vet1.setFirstName("Sam");
    vet1.setLastName("Axe");
    vetService.save(vet1);

    Vet vet2 = new Vet();
    vet2.setFirstName("Jessie");
    vet2.setLastName("Porter");
    vetService.save(vet2);

    System.out.println("Loaded Vets....");


  }
}
