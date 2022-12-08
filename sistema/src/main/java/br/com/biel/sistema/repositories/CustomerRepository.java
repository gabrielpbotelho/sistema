package br.com.biel.sistema.repositories;

import br.com.biel.sistema.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer > {
    public Customer findByEmail(String email);
}
