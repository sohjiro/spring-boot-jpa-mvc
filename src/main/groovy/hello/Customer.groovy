package hello

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Customer {

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  long id
  String firstName
  String lastName

  @Override
  public String toString() {
    "Customer[id=${id}, firstName=${firstName}, lastName=${lastName}]"
  }

}
