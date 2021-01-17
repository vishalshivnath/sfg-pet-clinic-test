package guru.springframework.sfgpetclinictest.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import guru.springframework.sfgpetclinictest.model.Owner;
import guru.springframework.sfgpetclinictest.services.OwnerService;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements OwnerService {

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

  @Override
  public Owner findByLastName(final String lastName) {
    return null;
  }
}
