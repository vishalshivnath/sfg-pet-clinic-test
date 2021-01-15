package guru.springframework.sfgpetclinictest.services.map;

import java.util.Set;

import guru.springframework.sfgpetclinictest.model.Pet;
import guru.springframework.sfgpetclinictest.services.CrudService;
import guru.springframework.sfgpetclinictest.services.PetService;

public class PetServiceMap extends AbstractMapService<Pet,Long> implements CrudService<Pet,Long> {

  @Override
  public Set<Pet> findAll() {
    return super.findAll();
  }

  @Override
  public void deleteById(Long id) {
    super.deleteById(id);
  }

  @Override
  public void delete(Pet object) {
    super.delete(object);
  }

  @Override
  public Pet findById(final Long id) {
    return super.findByID(id);
  }

  @Override
  public Pet save(final Pet object) {
    return super.save(object.getId(),object);
  }
}
