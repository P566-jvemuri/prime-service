package edu.indiana.p566.prime_service.service;

import edu.indiana.p566.prime_service.model.Customer;
import org.springframework.stereotype.Service;

import java.io.IOException;
@Service
public interface IAuthenticationService {
    boolean register(Customer customer) throws IOException;
//    boolean login(String username, String password) throws IOException;
}
