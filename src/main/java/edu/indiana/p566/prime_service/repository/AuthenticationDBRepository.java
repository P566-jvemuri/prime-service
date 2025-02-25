package edu.indiana.p566.prime_service.repository;

import edu.indiana.p566.prime_service.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface AuthenticationDBRepository extends CrudRepository<Customer, String> {
    Customer findByUsername(String username);
}
