package edu.indiana.p566.prime_service.service;

import org.springframework.stereotype.Service;

@Service
public class PrimeService implements IPrimeService {
    @Override
    public boolean isPrime(long n) {
        if (n <= 1) return false;
        for (long i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
