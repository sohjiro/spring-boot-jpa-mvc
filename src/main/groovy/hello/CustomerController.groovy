package hello

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView

@Controller
@RequestMapping("/customers")
class CustomerController {

  @Autowired
  CustomerRepository repository

  @RequestMapping("/")
  ModelAndView index() {
    new ModelAndView("customers/index", [customers:repository.findAll()])
  }
}
