package uz.sodiqdev.appjpa.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.sodiqdev.appjpa.model.Customer;
import uz.sodiqdev.appjpa.repository.CustomerRepository;
import uz.sodiqdev.appjpa.service.CustomerService;

import java.util.List;

//@RestController
//@RequestMapping(value = "/customer")
public class CustomerController {
//
//    @Autowired
//    CustomerRepository customerRepository;
//
//    @Autowired
//    CustomerService customerService;
//
//    @GetMapping
//    public HttpEntity<?> getAllCustomer(@RequestParam(defaultValue = "0") int page,
//                                        @RequestParam(defaultValue = "10") int size) {
//        List<Customer> customers = customerService.getCustomers(page, size);
//        return ResponseEntity.ok(customers);
//    }
//
//    @GetMapping(value = "/{id}")
//    public HttpEntity<?> getCustomerById(@PathVariable Integer id) {
//        Customer customer = customerService.getCustomer(id);
//        return ResponseEntity.status(customer != null ? HttpStatus.OK : HttpStatus.CONFLICT).body(customer);
//    }
//
//    @PostMapping
//    public HttpEntity<?> addCustomer(@RequestBody Customer customer) {
//        Customer customer1 = customerService.addCustomer(customer);
//        return ResponseEntity.status(201).body(customer1);
//
//
//    }
//
//    @PutMapping(value = "/{id}")
//    public HttpEntity<?> updateCustomer(@PathVariable Integer id,
//                                        @RequestBody Customer currentCustomer) {
//       Customer customer = customerService.updateCustomer(id, currentCustomer);
//       return ResponseEntity.status(customer != null? 200:409).body(customer);
//    }
//
//    @DeleteMapping(value = "/{id}")
//    public HttpEntity<?> deleteCustomer(@PathVariable Integer id) {
//        String customer =  customerService.deleteCustomer(id);
//        return ResponseEntity.status(customer != null? 200 :409).body(customer);
//    }

}
