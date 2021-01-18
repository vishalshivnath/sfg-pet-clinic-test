package guru.springframework.sfgpetclinictest.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import guru.springframework.sfgpetclinictest.model.Vet;
import guru.springframework.sfgpetclinictest.services.CrudService;
import guru.springframework.sfgpetclinictest.services.VetService;

@Service
public class VetServiceMap extends AbstractMapService<Vet,Long> implements VetService {
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
    return super.save(object);
  }
}
