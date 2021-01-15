package guru.springframework.sfgpetclinictest.services.map;

import java.util.Set;

import guru.springframework.sfgpetclinictest.model.Owner;
import guru.springframework.sfgpetclinictest.services.CrudService;

public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements CrudService<Owner,Long> {

  @Override
  public Set<Owner> findAll() {
    return super.findAll();
  }

  @Override
  public void deleteById(Long id) {
    super.deleteById(id);
  }

  @Override
  public void delete(Owner object) {
    super.delete(object);
  }

  @Override
  public Owner findById(final Long id) {
    return super.findByID(id);
  }

  @Override
  public Owner save(final Owner object) {
    return super.save(object.getId(),object);
  }
}
