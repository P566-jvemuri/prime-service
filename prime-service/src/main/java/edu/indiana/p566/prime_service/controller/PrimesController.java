package edu.indiana.p566.prime_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.indiana.p566.prime_service.service.IPrimeService;

@RestController
@CrossOrigin
@RequestMapping("/primes")
public class PrimesController {


    @Autowired
    IPrimeService primesService;

    public PrimesController(IPrimeService primesService) {
        this.primesService = primesService;
    }

    @GetMapping("/{n}")
    public boolean isPrime(@PathVariable long n) {
        return primesService.isPrime(n);
    }

}
