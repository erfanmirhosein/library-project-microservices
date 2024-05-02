package erfanslibrary.microservices.members.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MembersController {

  @GetMapping("/")
  public String helloWorld() {
    return "MEMMMMMMMMBERSSSSSS SERVICCCE";
  }
}
