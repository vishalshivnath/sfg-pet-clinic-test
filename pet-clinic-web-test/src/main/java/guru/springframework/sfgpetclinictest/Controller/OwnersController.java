package guru.springframework.sfgpetclinictest.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping({"/owners"})
@Controller
public class OwnersController {
  @RequestMapping({"","/","/index.html","/index"})
  public String listVets(){
    return "owners/index";
  }
}
