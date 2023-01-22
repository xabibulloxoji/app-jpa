package uz.sodiqdev.appjpa.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.sodiqdev.appjpa.model.Customer;

@RepositoryRestResource(path = "customer")
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
