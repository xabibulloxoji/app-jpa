package uz.sodiqdev.appjpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import uz.sodiqdev.appjpa.model.Customer;
import uz.sodiqdev.appjpa.repository.CustomerRepository;

import java.util.List;
import java.util.Optional;

//@Service
public class CustomerService {

//    @Autowired
//    CustomerRepository customerRepository;
//
//    public List<Customer> getCustomers(int page, int size) {
//        Pageable pageable = PageRequest.of(page, size);
//        Page<Customer> customerPage = customerRepository.findAll(pageable);
//        return customerPage.getContent();
//    }
//
//    public Customer getCustomer(Integer id) {
//        Optional<Customer> optionalCustomer = customerRepository.findById(id);
//        return optionalCustomer.orElse(null);
//    }
//
//    public Customer addCustomer(Customer customer) {
//        Customer customer1 = customerRepository.save(customer);
//        return customer1;
//    }
//
//    public Customer updateCustomer(Integer id, Customer currentCustomer) {
//        Optional<Customer> optionalCustomer = customerRepository.findById(id);
//        if (optionalCustomer.isPresent()) {
//            Customer customer = optionalCustomer.get();
//            customer.setUsername(currentCustomer.getUsername());
//            customer.setPhoneNumber(currentCustomer.getPhoneNumber());
//            Customer customer1 = customerRepository.save(customer);
//            return customer1;
//        }
//        return null;
//    }
//
//    public String deleteCustomer(Integer id) {
//        Optional<Customer> optionalCustomer = customerRepository.findById(id);
//        if (optionalCustomer.isPresent()) {
//            Customer customer = optionalCustomer.get();
//            customerRepository.delete(customer);
//            return "Customer deleted";
//        }
//        return null;
//    }
}
