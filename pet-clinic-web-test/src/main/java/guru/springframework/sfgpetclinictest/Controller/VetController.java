package guru.springframework.sfgpetclinictest.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.sfgpetclinictest.services.VetService;

@Controller
public class VetController {

  private final VetService vetService;

  public VetController(final VetService vetService) {
    this.vetService = vetService;
  }

  @RequestMapping({"/vets","/vets/index.html","/vets/index"})
  public String listVets(Model model){
    model.addAttribute("vets",vetService.findAll());
    return "vets/index";
  }
}
