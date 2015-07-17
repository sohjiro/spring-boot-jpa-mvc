package hello

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class Application implements ApplicationRunner {

  @Autowired
  CustomerRepository repository

  static void main(String[] args) {
    SpringApplication.run(Application.class, args)
  }

  @Override
  void run(ApplicationArguments args) throws Exception {
    // save a couple of customers
    repository.save(new Customer([firstName:"Jack", lastName:"Bauer"]))
    repository.save(new Customer([firstName:"Chloe", lastName:"O'Brian"]))
    repository.save(new Customer([firstName:"Kim", lastName:"Bauer"]))
    repository.save(new Customer([firstName:"David", lastName:"Palmer"]))
    repository.save(new Customer([firstName:"Michelle", lastName:"Dessler"]))

    // fetch all customers
    // println "Customers found with findAll():"
    // println "-------------------------------"
    // for (Customer customer : repository.findAll()) {
    //   println customer
    // }

    // // fetch an individual customer by ID
    // Customer customer = repository.findOne(1L)
    // println "Customer found with findOne(1L):"
    // println "--------------------------------"
    // println customer

    // // fetch customers by last name
    // println "Customer found with findByLastName('Bauer'):"
    // println "--------------------------------------------"
    // for (Customer bauer : repository.findByLastName("Bauer")) {
    //   println bauer
    // }
  }

}
