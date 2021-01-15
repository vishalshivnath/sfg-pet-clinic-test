package guru.springframework.sfgpetclinictest.services.map;

import java.util.Set;

import guru.springframework.sfgpetclinictest.model.Vet;
import guru.springframework.sfgpetclinictest.services.CrudService;

public class VetServiceMap extends AbstractMapService<Vet,Long> implements CrudService<Vet,Long> {
  @Override
  public Set<Vet> findAll() {
    return super.findAll();
  }

  @Override
  public void deleteById(Long id) {
    super.deleteById(id);
  }

  @Override
  public void delete(Vet object) {
    super.delete(object);
  }

  @Override
  public Vet findById(final Long id) {
    return super.findByID(id);
  }

  @Override
  public Vet save(final Vet object) {
    return super.save(object.getId(),object);
  }
}
