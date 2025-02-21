package edu.indiana.p566.prime_service.repository;

import edu.indiana.p566.prime_service.model.Customer;

import java.io.IOException;

public interface IAuthenticationRepository {
    boolean save(Customer customer) throws IOException;
    Customer findByUsername(String username) throws IOException;
}
