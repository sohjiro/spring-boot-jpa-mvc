package hello

import org.springframework.data.repository.CrudRepository

interface CustomerRepository extends CrudRepository<Customer, Long> {

  List<Customer> findByLastName(String lastName)

}
