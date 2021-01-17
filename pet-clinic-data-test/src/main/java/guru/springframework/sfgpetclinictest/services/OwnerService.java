package guru.springframework.sfgpetclinictest.services;

//import java.util.Set;

import guru.springframework.sfgpetclinictest.model.Owner;
import guru.springframework.sfgpetclinictest.model.Person;

public interface OwnerService extends CrudService<Owner,Long>{

  Owner findByLastName(String lastName);
/*
  Owner findById(Long id);
  Owner save(Owner owner);
  Set<Owner> findAll();
*/

}
