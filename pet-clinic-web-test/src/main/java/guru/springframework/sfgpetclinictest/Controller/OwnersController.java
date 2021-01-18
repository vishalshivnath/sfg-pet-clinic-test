package guru.springframework.sfgpetclinictest.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.sfgpetclinictest.services.OwnerService;

@RequestMapping({"/owners"})
@Controller
public class OwnersController {

  private final OwnerService ownerService;

  public OwnersController(final OwnerService ownerService) {
    this.ownerService = ownerService;
  }

  @RequestMapping({"","/","/index.html","/index"})
  public String listVets(Model model){
    model.addAttribute("owners",ownerService.findAll());
    return "owners/index";
  }

}
